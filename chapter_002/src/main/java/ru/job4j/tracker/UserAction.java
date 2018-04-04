package ru.job4j.tracker;

	/**
     * @author Alexandr Sedykh
     * @version $Id$
     * @since 24.03.18
     */

public interface UserAction {
	
	int key();
	
	void execute(Input input, Tracker tracker);
	
	String info();
}