package ru.job4j.tracker;

    /**
     * @author Alexandr Sedykh
     * @version $Id$
     * @since 24.03.18
     */

public class StartUI {

	private final Input input;
	private final Tracker tracker;
	
	public StartUI(Input input, Tracker tracker) {
		this.input = input;
		this.tracker = tracker;
	}
	public void init() {
		MenuTracker menu = new MenuTracker(this.input, tracker);
		menu.fillActions();
		do {
			menu.show();
			int key = Integer.valueOf(input.ask("Выбор: "));
			if (key == 6) {
				break;
			}
			menu.select(key);
		} while (!"6".equals(this.input.ask("Выйти? (6): ")));
	}

	public static void main(String[] args) {
		new StartUI(new ConsoleInput(), new Tracker()).init();
	}
}