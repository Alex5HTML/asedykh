package ru.job4j.tracker;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class TrackerTest {
	@Test
	public void whenAddNewItemThenTrackerHasSameItem() {
		Tracker tracker = new Tracker();
		Item item = new Item("test1", "testDescription", 123L);
		tracker.add(item);
		assertThat(tracker.findAll()[0], is(item));
	}
	@Test
	public void whenReplaceNameThenReturnNewName() {
		Tracker tracker = new Tracker();
		Item previous = new Item("test1", "testDescription", 123L);
		tracker.add(previous);
		Item next = new Item("test2", "testDescription", 123L);
		next.setId(previous.getId());
		tracker.replace(previous.getId(), next);
		assertThat(tracker.findById(previous.getId()).getName(), is("test2"));
	}

	@Test
	public void whenDeleteItemThenTrackerDeleteItem() {
		Tracker tracker = new Tracker();
		Item item1 = new Item("test1", "testDescription", 123L);
        Item item2 = new Item("test2", "testDescription", 123L);
		tracker.add(item1);
        tracker.add(item2);
		Item[] testArray = new Item[1];
		testArray[0] = item1;
		tracker.delete(item2.getId());
		assertThat(tracker.findAll(), is(testArray));
	}
	
	@Test
	public void whenFindAllItemsThanTrackerFindsAllItems() {
		Tracker tracker = new Tracker();
		Item item = new Item("test1", "testDescription", 123L);
		Item item1 = new Item("test2", "testDescription", 123L);
		tracker.add(item);
		tracker.add(item1);
		Item[] testArray = new Item[2];
		testArray[0] = item;
		testArray[1] = item1;
		assertThat(tracker.findAll(), is(testArray));
	}

	@Test
	public void whenFindByNameThenTrackerFindsItem() {
		Tracker tracker = new Tracker();
		Item item = new Item("test1", "testDescription", 123L);
		tracker.add(item);
		Item result = tracker.findByName(item.getName())[0];
		assertThat(result, is(item));
	}
	
	@Test
	public void whenFindByIdThenTrackerFidsItem() {
		Tracker tracker = new Tracker();
		Item item = new Item("test1", "testDescription", 123L);
		tracker.add(item);
		Item result = tracker.findById(item.getId());
		assertThat(result, is(item));
	}

}