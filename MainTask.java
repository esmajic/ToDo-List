import java.util.ArrayList;
import java.util.Scanner;

public class MainTask {

	public static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		ArrayList<Task> tasks = new ArrayList<>();

		int option;

		do {
			System.out.println("\n==================================================");
			System.out.println("Upisite 1 za unos zadatka");
			System.out.println("Upisite 2 za upis promjene stanja zadatka");
			System.out.println("Upisite 3 za izlistavanje svih zadataka");
			System.out.println("Upisite 4 za izlistavanje svih izvrsenih zadataka");
			System.out.println("Upisite 5 za izlistavanje svih neizvrsenih zadataka");
			System.out.println("Upisite 6 za brisanje zadatka iz liste");
			System.out.println("Upisite 0 za izlaz iz aplikacije");
			System.out.println("==================================================");
			System.out.println("\nMolimo, upisite zeljenu opciju:  ");

			option = input.nextInt();

			if (option == 1) {
				System.out.println("\n==============================");
				System.out.println("Upisite 1 za kucni zadatak");
				System.out.println("Upisite 2 za poslovni zadatak");
				System.out.println("==============================");
				System.out.println("\nIzaberite opciju:  ");
				int option2 = input.nextInt();
				if (option2 == 1) {
					System.out.println("\nKucni zadatak:  ");
					CreateHouseTask task = new CreateHouseTask();
					task.createTask(tasks);
				} else if (option2 == 2) {
					System.out.println("\nPoslovni zadatak:  ");
					CreateWorkTask task = new CreateWorkTask();
					task.createTask(tasks);
				}

			} else if (option == 2) {
				ManipulateTasks task2 = new ManipulateTasks();
				task2.changeStatus(tasks);

			} else if (option == 3) {
				ManipulateTasks task3 = new ManipulateTasks();
				task3.printAllTasks(tasks);

			} else if (option == 4) {
				ManipulateTasks task4 = new ManipulateTasks();
				task4.printCompletedTasks(tasks);

			} else if (option == 5) {
				ManipulateTasks task5 = new ManipulateTasks();
				task5.printPendingTasks(tasks);

			} else if (option == 6) {
				ManipulateTasks task6 = new ManipulateTasks();
				task6.deleteTask(tasks);
				System.out.println("");
			}

		} while (option != 0);

		System.out.println("Hvala na koristenju nase aplikacije.");

		input.close();

	}
}