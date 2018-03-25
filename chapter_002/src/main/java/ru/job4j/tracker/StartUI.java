package ru.job4j.tracker;

    /**
     * @author Alexandr Sedykh
     * @version $Id$
     * @since 24.03.18
     */

public class StartUI {
	
	private static final String ADD = "0";
	private static final String SHOWALL = "1";
	private static final String EDIT = "2";
	private static final String DELETE = "3";
	private static final String FINDBYID = "4";
	private static final String FINDBYNAME = "5";
	private static final String EXIT = "6";
	private final Input input;
	private final Tracker tracker;
	
	public StartUI(Input input, Tracker tracker) {
		this.input = input;
		this.tracker = tracker;
	}
	public void init() {
		boolean exit = false;
		while (!exit) {
			this.showMenu();
			String answer = this.input.ask("Введите пункт меню: ");
			if (ADD.equals(answer)) {
				this.createItem();
			} else if (SHOWALL.equals(answer)) {
				this.showAll();
			} else if (EDIT.equals(answer)) {
				this.editItem();
			} else if (DELETE.equals(answer)) {
				this.deleteItem();
			} else if (FINDBYID.equals(answer)) {
				this.findById();
			} else if (FINDBYNAME.equals(answer)) {
				this.findByName();
			} else if (EXIT.equals(answer)) {
				exit = true;
			}
		}
	}
	
	private void createItem() {
		System.out.println("---------- Добавление новой заявки ----------");
		String name = this.input.ask("Введите имя заявки: ");
		String desc = this.input.ask("Введите описание заявки: ");
		long create = System.currentTimeMillis();
		Item item = new Item(name, desc, create);
		this.tracker.add(item);
		System.out.println("---------- Новая заявка с ID : " + item.getId() + " -----------");
	}
	
	private void showAll() {
		System.out.println("---------- Список всех заявок ----------");
		Item[] items = this.tracker.findAll();
		for (int index = 0; index != items.length; index++) {
			System.out.println("---------- Имя заявки: " + items[index].getName() + " ----------");
			System.out.println("---------- Описание: " + items[index].getDescription() + " ----------");
			System.out.println("---------- ID заявки: " + items[index].getId() + " ----------");
		}
	}
	
	private void editItem() {
		System.out.println("---------- Редактирование заявки ----------");
		String id = this.input.ask("Введите ID заявки: ");
		Item item = this.tracker.findById(id);
		String desc = this.input.ask("Введите описание изменения: ");
		item.setDescription(desc);
		this.tracker.replace(id, item);
		System.out.println("---------- Заявка " + item.getId() + " изменена ----------");
	}
	
	private void deleteItem() {
		System.out.println("---------- Удаление заявки ----------");
		String id = this.input.ask("Введите ID заявки: ");
		this.tracker.delete(id);
		System.out.println("---------- Заявка " + id + " удалена ----------");
	}
	
	private void findById() {
		System.out.println("---------- Поиск заявки по ID ----------");
		String id = this.input.ask("Введите ID заявки: ");
		Item item = this.tracker.findById(id);
		System.out.println("---------- Имя заявки " + item.getName() + " ----------");
		System.out.println("---------- Описание: " + item.getDescription() + " ----------");
	}
	
	private void findByName() {
		System.out.println("---------- Поиск заявки по имени ----------");
		String name = this.input.ask("Введите имя заявки: ");
		Item[] items = this.tracker.findByName(name);
		for (int index = 0; index != items.length; index++) {
			System.out.println("---------- ID заявки " + items[index].getId() + " ----------");
			System.out.println("---------- Описание: " + items[index].getDescription() + " ----------");
		}
	}
	
	private void showMenu() {
		System.out.println("Меню.");
		System.out.println("0 - Добавить новую заявку");
		System.out.println("1 - Показать список всех заявок");		
		System.out.println("2 - Редактировать заявку");
		System.out.println("3 - Удалить заявку");
		System.out.println("4 - Найти заявку по ID");
		System.out.println("5 - Найти заявку по имени");
		System.out.println("6 - Выход");
	}

	public static void main(String[] args) {
		new StartUI(new ConsoleInput(), new Tracker()).init();
	}
}