import java.util.ArrayList;

public class CreateWorkTask {

	public void createTask(ArrayList<Task> listaZadataka) {
		System.out.println("\nUnesite opis zadatka:  ");
		String description = MainTask.input.nextLine();
		System.out.println("\nDa li je zadatak izvrsen? true ili false:  ");
		boolean completed = MainTask.input.nextBoolean();

		CategoryWork zadatak = new CategoryWork(description, completed);
		listaZadataka.add(zadatak);

		System.out.println("\nZadatak je uspjesno kreiran.");
	}

}
