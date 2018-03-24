package ru.job4j.tracker;

import java.util.*;

    /**
     * @author Alexandr Sedykh
     * @version $Id$
     * @since 15.03.18
     */
public class Tracker {

	private final Item[] items = new Item[100];
	private int position = 0;
	private static final Random RN = new Random();
	
	public Item add(Item item) {
		item.setId(this.generateId());
		this.items[this.position++] = item;
		return item;
	}
	
	String generateId() {
		return String.valueOf(System.currentTimeMillis() + RN.nextInt());
	} 
	
	public void replace(String id, Item item) {
		for (int index = 0; index != this.position; index++) {
			if (item.getId().equals(id)) {
				this.items[index] = item;
				break;
			}
		}
	}
	
	public void delete(String id) {
		Item[] result = new Item[items.length - 1];
		for (int index = 0; index != this.position; index++) {
			if (items[index].getId().equals(id)) {
			    System.arraycopy(items, 0, result, 0, index);
			    System.arraycopy(items, index + 1, result, index, items.length - index - 1);
			    System.arraycopy(result, 0, items, 0, items.length - 1);
				this.position = this.position - 1;
			}
		}
	}

	public Item[] findAll() {
		Item[] result = new Item[this.position];
		for (int index = 0; index != this.position; index++) {
			result[index] = this.items[index];
		}
		return result;
	}
	
	public Item[] findByName(String key) {
		Item[] result = new Item[this.position];
		int j = 0;
		int length = 1;
		for (int index = 0; index != this.position; index++) {
			if (items[index] != null && items[index].getName().equals(key)) {
				System.arraycopy(items, index, result, j++, length++);
			}
		}
		return result;
	}
	
	public Item findById(String id) {
		Item result = null;
		for (Item item : items) {
			if (item != null && item.getId().equals(id)) {
				result = item;
				break;
			}
		}
		return result;
	}
}