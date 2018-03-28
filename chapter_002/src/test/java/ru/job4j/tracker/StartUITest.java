package ru.job4j.tracker;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class StartUITest {
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
		Item[] testArray = new Item[1];
		testArray[0] = item1;
		assertThat(tracker.findAll(), is(testArray));
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