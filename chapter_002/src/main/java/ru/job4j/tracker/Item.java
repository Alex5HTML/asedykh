package ru.job4j.tracker;

public class Item {
	
	private String name;
	private String description;
	private String id;
	private long create;
	
	public Item(String name, String description, long create) {
		this.name = name;
		this.description = description;
		this.create = create;
	}
	
	public String getName() {
		return this.name;
	}
	
	public String getDescription() {
		return this.description;
	}
	
	public String getId() {
		return this.id;
	}
	
	public long getCreate() {
		return this.create;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
	public void setCreate(long create) {
		this.create = create;
	}
}