import java.util.ArrayList;

public class ManipulateTasks {

	ManipulateTasks() {

	}

	public void printAllTasks(ArrayList<Task> tasks) {
		System.out.println("Ispis svih zadataka...");
		System.out.println("");
		if (tasks.size() == 0) {
			System.out.println("Lista zadataka je prazna.");
		} else {
			for (int i = 0; i < tasks.size(); i++) {
				if (tasks.get(i).isCompleted() == true) {
					continue;
				} else {
					System.out.println((i + 1) + ". " + tasks.get(i));
				}
			}
		}
		System.out.println("");
	}

	public void printCompletedTasks(ArrayList<Task> tasks) {
		System.out.println("Ispis svih izvrsenih zadataka...");
		System.out.println("");
		if (tasks.size() == 0) {
			System.out.println("Lista izvrsenih zadataka je prazna.");
		} else {
			for (int i = 0; i < tasks.size(); i++) {
				if (tasks.get(i).isCompleted() == true) {
					System.out.println((i + 1) + ". " + tasks.get(i));
				}
			}
		}
		System.out.println("");
	}

	public void deleteTask(ArrayList<Task> tasks) {
		System.out.println("Brisanje zadatka...");
		System.out.println("");
		if (tasks.size() == 0) {
			System.out.println("Ne mozete brisati jer je lista zadataka prazna.");
		} else {
			System.out.println("Unesite redni broj zadatka koji zelite izbrisati:  ");
			int index = MainTask.input.nextInt();

			for (int i = 0; i < tasks.size(); i++) {
				if (index - 1 == i) {
					tasks.remove(i);
				}
			}
		}
	}

	public void changeStatus(ArrayList<Task> tasks) {
		System.out.println("Oznacavanje zadatka zavrsenim...");
		System.out.println("");
		if (tasks.size() == 0) {
			System.out.println("Ne mozete oznaciti jer je lista zadataka prazna.");
		} else {
			System.out.println("Unesite redni broj zadatka koji zelite oznaciti uradjenim:  ");
			int index = MainTask.input.nextInt();

			for (int i = 0; i < tasks.size(); i++) {
				if (index - 1 == i) {
					if (tasks.get(i).isCompleted() == false) {
						tasks.get(i).setCompleted(true);
					} else {
						tasks.get(i).setCompleted(false);
					}
				}
			}
		}
	}

	public void printPendingTasks(ArrayList<Task> tasks) {
		System.out.println("Ispis svih neizvrsenih zadataka zadataka...");
		System.out.println("");
		if (tasks.size() == 0) {
			System.out.println("Lista neizvrsenih zadataka je prazna.");
		} else {
			for (int i = 0; i < tasks.size(); i++) {
				if (tasks.get(i).isCompleted() == false) {
					System.out.println((i + 1) + ". " + tasks.get(i));
				}
			}
			System.out.println("");
		}
	}

}
