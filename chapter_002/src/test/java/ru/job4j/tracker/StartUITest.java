package ru.job4j.tracker;

import org.junit.Test;
import org.junit.After;
import org.junit.Before;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class StartUITest {
	
	private final PrintStream stdout = System.out;
	private final ByteArrayOutputStream out = new ByteArrayOutputStream();
	
	@Before
	public void loadOutput() {
		System.setOut(new PrintStream(this.out));
	}
	
	@After
	public void backOutput() {
		System.setOut(this.stdout);
	}
	
	@Test
	public void whenShowAllItemsThenTrackerDisplayItems() {
		Tracker tracker = new Tracker();
		Item item = tracker.add(new Item("test name", "desc", 123L));
		Input input = new StubInput(new String[]{"1", "6"});
		new StartUI(input, tracker).init();
		assertThat(new String(this.out.toByteArray()),
										is(new StringBuilder()
										.append("Меню.")
										.append(System.lineSeparator())
										.append("0 - Добавить новую заявку")
										.append(System.lineSeparator())
										.append("1 - Показать список всех заявок")
										.append(System.lineSeparator())
										.append("2 - Редактировать заявку")
										.append(System.lineSeparator())
										.append("3 - Удалить заявку")
										.append(System.lineSeparator())
										.append("4 - Найти заявку по ID")
										.append(System.lineSeparator())
										.append("5 - Найти заявку по имени")
										.append(System.lineSeparator())
										.append("6 - Выход")
										.append(System.lineSeparator())
										.append("---------- Список всех заявок ----------")
										.append(System.lineSeparator())
										.append("---------- Имя заявки: test name ----------")
										.append(System.lineSeparator())
										.append("---------- Описание: " + item.getDescription() + " ----------")
										.append(System.lineSeparator())
										.append("---------- ID заявки: " + item.getId() + " ----------")
										.append(System.lineSeparator())
										.append("Меню.")
										.append(System.lineSeparator())
										.append("0 - Добавить новую заявку")
										.append(System.lineSeparator())
										.append("1 - Показать список всех заявок")
										.append(System.lineSeparator())
										.append("2 - Редактировать заявку")
										.append(System.lineSeparator())
										.append("3 - Удалить заявку")
										.append(System.lineSeparator())
										.append("4 - Найти заявку по ID")
										.append(System.lineSeparator())
										.append("5 - Найти заявку по имени")
										.append(System.lineSeparator())
										.append("6 - Выход")
										.append(System.lineSeparator())
										.toString()
										));
	}
	
	@Test
	public void whenDeleteItemThenTrackerDisplayDeleteItem() {
		Tracker tracker = new Tracker();
		Item item = tracker.add(new Item("test name", "desc", 123L));
		Item item1 = tracker.add(new Item("test name1", "desc", 1234L));
		Input input = new StubInput(new String[]{"3", item.getId(), "6"});
		new StartUI(input, tracker).init();
		assertThat(new String(this.out.toByteArray()),
										is(new StringBuilder()
										.append("Меню.")
										.append(System.lineSeparator())
										.append("0 - Добавить новую заявку")
										.append(System.lineSeparator())
										.append("1 - Показать список всех заявок")
										.append(System.lineSeparator())
										.append("2 - Редактировать заявку")
										.append(System.lineSeparator())
										.append("3 - Удалить заявку")
										.append(System.lineSeparator())
										.append("4 - Найти заявку по ID")
										.append(System.lineSeparator())
										.append("5 - Найти заявку по имени")
										.append(System.lineSeparator())
										.append("6 - Выход")
										.append(System.lineSeparator())
										.append("---------- Удаление заявки ----------")
										.append(System.lineSeparator())
										.append("---------- Заявка " + item.getId() + " удалена ----------")
										.append(System.lineSeparator())
										.append("Меню.")
										.append(System.lineSeparator())
										.append("0 - Добавить новую заявку")
										.append(System.lineSeparator())
										.append("1 - Показать список всех заявок")
										.append(System.lineSeparator())
										.append("2 - Редактировать заявку")
										.append(System.lineSeparator())
										.append("3 - Удалить заявку")
										.append(System.lineSeparator())
										.append("4 - Найти заявку по ID")
										.append(System.lineSeparator())
										.append("5 - Найти заявку по имени")
										.append(System.lineSeparator())
										.append("6 - Выход")
										.append(System.lineSeparator())
										.toString()
										));
	}
	
	@Test
	public void whenUserAddItemThenTrackerHasNewItemWithSameName() {
		Tracker tracker = new Tracker();
		Input input = new StubInput(new String[]{"0", "test name", "desc", "6"});
		new StartUI(input, tracker).init();
		assertThat(tracker.findAll()[0].getName(), is("test name"));
	}
	
	@Test
	public void whenShowAllItemsThenTrackerShowsAll() {
		Tracker tracker = new Tracker();
		Item item = tracker.add(new Item("test name", "desc", 123L));
		Input input = new StubInput(new String[]{"1", "6"});
		new StartUI(input, tracker).init();
		assertThat(tracker.findById(item.getId()), is(item));
	}
	
	@Test
	public void whenUpdateThenTrackerHasUpdatedValue() {
		Tracker tracker = new Tracker();
		Item item = tracker.add(new Item("test name", "desc", 123L));
		Input input = new StubInput(new String[]{"2", item.getId(), "test name", "desc", "6"});
		new StartUI(input, tracker).init();
		assertThat(tracker.findById(item.getId()).getName(), is("test name"));
	}
	
	@Test
	public void whenDeleteItemThenTrackerDeleteItem() {
		Tracker tracker = new Tracker();
		Item item = tracker.add(new Item("test name", "desc", 123L));
		Item item1 = tracker.add(new Item("test name1", "desc", 1234L));
		Input input = new StubInput(new String[]{"3", item.getId(), "6"});
		new StartUI(input, tracker).init();
		assertThat(tracker.findAll().length, is(1));
	}
	
	@Test
	public void whenFindByIdThenTrackerFindsItem() {
		Tracker tracker = new Tracker();
		Item item = tracker.add(new Item("test name", "desc", 123L));
		Input input = new StubInput(new String[]{"4", item.getId(), "6"});
		new StartUI(input, tracker).init();
		assertThat(tracker.findByName(item.getName())[0].getName(), is("test name"));
	}
	
	@Test
	public void whenFindByNameThenTrackerFindsItem() {
		Tracker tracker = new Tracker();
		Item item = tracker.add(new Item("test name", "desc", 123L));
		Input input = new StubInput(new String[]{"5", item.getName(), "6"});
		new StartUI(input, tracker).init();
		assertThat(tracker.findByName(item.getName())[0], is(item));
	}
}