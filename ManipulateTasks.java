import java.util.ArrayList;

public class ManipulateTasks {

	public void printAllTasks(ArrayList<Task> tasks) {
		System.out.println("\nIspis svih zadataka...");
		if (tasks.size() == 0) {
			System.out.println("\nLista zadataka je prazna.");
		} else {
			for (int i = 0; i < tasks.size(); i++) {
				System.out.println((i + 1) + ". " + tasks.get(i));
			}
		}
	}

	public void printCompletedTasks(ArrayList<Task> tasks) {
		System.out.println("\nIspis svih izvrsenih zadataka...");
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
		System.out.println("\nBrisanje zadatka...");
		if (tasks.size() == 0) {
			System.out.println("\nNe mozete brisati jer je lista zadataka prazna.");
		} else {
			System.out.println("\nUnesite redni broj zadatka koji zelite izbrisati:  ");
			int index = MainTask.input.nextInt();

			for (int i = 0; i < tasks.size(); i++) {
				if (index - 1 == i) {
					tasks.remove(i);
				}
			}
		}
	}

	public void changeStatus(ArrayList<Task> tasks) {
		System.out.println("\nOznacavanje zadatka zavrsenim...");
		if (tasks.size() == 0) {
			System.out.println("\nNe mozete oznaciti jer je lista zadataka prazna.");
		} else {
			System.out.println("\nUnesite redni broj zadatka koji zelite oznaciti uradjenim:  ");
			int index = MainTask.input.nextInt();

			for (int i = 0; i < tasks.size(); i++) {
				if (index - 1 == i) {
					if (tasks.get(i).isCompleted()) {
						tasks.get(i).setCompleted(false);
					} else {
						tasks.get(i).setCompleted(true);
					}
				}
			}
		}
	}

	public void printPendingTasks(ArrayList<Task> tasks) {
		System.out.println("\nIspis svih neizvrsenih zadataka zadataka...");
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

}
