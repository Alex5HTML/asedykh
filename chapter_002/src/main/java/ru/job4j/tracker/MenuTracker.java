package ru.job4j.tracker;

	/**
     * @author Alexandr Sedykh
     * @version $Id$
     * @since 24.03.18
     */

class EditItem implements UserAction {
	
	public int key() {
		return 2;
	}
	
	/**
	 * Выполнение выбранного пункта меню.
	 */
	
	public void execute(Input input, Tracker tracker) {
		System.out.println("---------- Редактирование заявки ----------");
		String id = input.ask("Введите ID заявки: ");
		Item item = tracker.findById(id);
		String name = input.ask("Введите новое имя заявки: ");
		String desc = input.ask("Введите описание изменения: ");
		item.setName(name);
		item.setDescription(desc);
		tracker.replace(id, item);
		System.out.println("---------- Заявка " + item.getName() + "c ID " + item.getId() + " изменена ----------");
	}
	
	/**
	  * Пункт меню, выводимый на консоль.
	  */
	
	public String info() {
		return String.format("%s. %s", this.key(), "Редактировать заявку");
	}
}

public class MenuTracker {
	
	private Input input;
	private Tracker tracker;
	private UserAction[] actions = new UserAction[7];
	
	public MenuTracker(Input input, Tracker tracker) {
		this.input = input;
		this.tracker = tracker;
	}
	
	public void fillActions() {
		this.actions[0] = new AddItem();
		this.actions[1] = new MenuTracker.ShowItems();
		this.actions[2] = new EditItem();
		this.actions[3] = new DeleteItem();
		this.actions[4] = new FindById();
		this.actions[5] = new FindByName();
		this.actions[6] = new Exit();
	}
	
	/**
	 * Выбор пользователем пункта меню.
	 * @param key ключ, пункт меню, выбираемый пользователем.
	 */
	
	public void select(int key) {
		this.actions[key].execute(this.input, this.tracker);
	}
	
	/**
	  * Выводит в консоль меню.
	  */
	  
	public void show() {
		for (UserAction action : this.actions) {
			if (action != null) {
				System.out.println(action.info());
			}
		}
	}
	
	private class AddItem implements UserAction {
		
		public int key() {
			return 0;
		}
		
		/**
	     * Выполнение выбранного пункта меню.
	     */
		
		public void execute(Input input, Tracker tracker) {
			System.out.println("---------- Добавление новой заявки ----------");
			String name = input.ask("Введите имя заявки: ");
			String desc = input.ask("Введите описание заявки: ");
			long create = System.currentTimeMillis();
			Item item = new Item(name, desc, create);
			tracker.add(item);
			System.out.println("---------- Новая заявка с ID : " + item.getId() + " -----------");
		}
		
		/**
	     * Пункт меню, выводимый на консоль.
	     */
		
		public String info() {
			return String.format("%s. %s", this.key(), "Добавить новую заявку");
		}
	}
	
	private static class ShowItems implements UserAction {
		
		public int key() {
			return 1;
		}
		
		/**
	     * Выполнение выбранного пункта меню.
	     */		
		
		public void execute(Input input, Tracker tracker) {
			System.out.println("---------- Список всех заявок ----------");
			Item[] items = tracker.findAll();
			for (int index = 0; index != items.length; index++) {
				System.out.println("---------- Имя заявки: " + items[index].getName() + " ----------");
				System.out.println("---------- Описание: " + items[index].getDescription() + " ----------");
				System.out.println("---------- ID заявки: " + items[index].getId() + " ----------");
			}
		}
		
		/**
	     * Пункт меню, выводимый на консоль.
	     */
	  
		public String info() {
			return String.format("%s. %s", this.key(), "Показать все заявки");
		}
	}
	
	private class DeleteItem implements UserAction {
		
		public int key() {
			return 3;
		}
		
		/**
	     * Выполнение выбранного пункта меню.
	     */		
		
		public void execute(Input input, Tracker tracker) {
			System.out.println("---------- Удаление заявки ----------");
			String id = input.ask("Введите ID заявки: ");
			tracker.delete(id);
			System.out.println("---------- Заявка " + id + " удалена ----------");
		}
		
		/**
	     * Пункт меню, выводимый на консоль.
	     */
	  
		public String info() {
			return String.format("%s. %s", this.key(), "Удалить заявку");
		}
	}
	
	private class FindById implements UserAction {
		
		public int key() {
			return 4;
		}
		
		/**
	     * Выполнение выбранного пункта меню.
	     */		
		
		public void execute(Input input, Tracker tracker) {
			System.out.println("---------- Поиск заявки по ID ----------");
			String id = input.ask("Введите ID заявки: ");
			Item item = tracker.findById(id);
			System.out.println("---------- Имя заявки " + item.getName() + " ----------");
			System.out.println("---------- Описание: " + item.getDescription() + " ----------");
		}
		
		/**
	     * Пункт меню, выводимый на консоль.
	     */
	  
		public String info() {
			return String.format("%s. %s", this.key(), "Найти заявку по Id");
		}
	}
	
	private class FindByName implements UserAction {
		
		public int key() {
			return 5;
		}
		
		/**
	     * Выполнение выбранного пункта меню.
	     */		
		
		public void execute(Input input, Tracker tracker) {
			System.out.println("---------- Поиск заявки по имени ----------");
			String name = input.ask("Введите имя заявки: ");
			Item[] items = tracker.findByName(name);
			for (int index = 0; index != items.length; index++) {
				System.out.println("---------- ID заявки " + items[index].getId() + " ----------");
				System.out.println("---------- Описание: " + items[index].getDescription() + " ----------");
			}
		}	
		
		/**
	     * Пункт меню, выводимый на консоль.
	     */
	  
		public String info() {
			return String.format("%s. %s", this.key(), "Найти заявку по имени");
		}
	}
	
	private class Exit implements UserAction {
		
		public int key() {
			return 6;
		}
		
		public void execute(Input input, Tracker tracker) {
		}
		
		/**
	     * Пункт меню, выводимый на консоль.
	     */
		
		public String info() {
			return String.format("%s. %s", this.key(), "Выход");
		}
	}
	
}