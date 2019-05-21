import java.util.ArrayList;
import java.util.Collections;

public class ManipulateTasks {

	public void printAllActiveTasks(ArrayList<Task> tasks) {
		if (tasks.size() == 0) {
			System.out.println("\nLista zadataka je prazna.");
		} else {
			for (int i = 0; i < tasks.size(); i++) {
				System.out.println((i + 1) + ". " + tasks.get(i));
			}
		}
	}

	public void printCompletedTasks(ArrayList<Task> tasks) {
		if (numberOfCompletedTasks(tasks) == tasks.size()) {
			System.out.println("\nLista izvrsenih zadataka je prazna.");
		} else {
			for (int i = 0; i < tasks.size(); i++) {
				if (tasks.get(i).isCompleted()) {
					System.out.println((i + 1) + ". " + tasks.get(i));
				}
			}
		}

	}

	public void deleteTask(ArrayList<Task> tasks) {
		if (tasks.size() == 0) {
			System.out.println("\nNe mozete brisati jer je lista zadataka prazna.");
		} else {
			System.out.println("\nUnesite redni broj zadatka koji zelite izbrisati:  ");
			int index = MainTask.input.nextInt();

			int i = index - 1;
			if (tasks.get(i).isCompleted() == false) {
				System.out.println("Zadatak ne mozete obrisati jer zadatak nije izvrsen!");
			} else if (index - 1 == i) {
				tasks.remove(i);
				System.out.println("Zadatak broj " + index + ". je izbrisan iz liste.");
			}
		}
	}

	public void changeStatus(ArrayList<Task> tasks) {
		if (tasks.size() == 0) {
			System.out.println("\nNe mozete oznaciti jer je lista zadataka prazna.");
		} else {
			System.out.println("\nUnesite redni broj zadatka koji zelite oznaciti uradjenim:  ");
			int index = MainTask.input.nextInt();

			for (int i = 0; i < tasks.size(); i++) {
				if (index - 1 == i) {
					if (tasks.get(i).isCompleted()) {
						tasks.get(i).setCompleted(false);
						System.out.println("Stanje zadatka je uspjesno promijenjeno u neizvrseni zadatak.");
					} else {
						tasks.get(i).setCompleted(true);
						System.out.println("Stanje zadatka je uspjesno promijenjeno u izvrseni zadatak.");
					}
				}
			}
		}
	}

	public void printPendingTasks(ArrayList<Task> tasks) {
		if (tasks.size() == 0) {
			System.out.println("\nLista neizvrsenih zadataka je prazna.");
		} else {
			for (int i = 0; i < tasks.size(); i++) {
				if (!tasks.get(i).isCompleted()) {
					System.out.println((i + 1) + ". " + tasks.get(i));
				}
			}
		}
	}

	public int numberOfCompletedTasks(ArrayList<Task> tasks) {
		int counter = 0;
		for (int i = 0; i < tasks.size(); i++) {
			if (tasks.get(i).isCompleted() == false) {
				counter++;
			}
		}
		return counter;
	}

	public void printAllCreatedTasks(ArrayList<Task> alltasks) {
		Collections.sort(alltasks);
		if (alltasks.size() == 0) {
			System.out.println("\nLista kreiranih zadataka je prazna.");
		} else {
			for (int i = 0; i < alltasks.size(); i++) {
				System.out.println((i + 1) + ". " + alltasks.get(i));
			}
		}
	}
}
