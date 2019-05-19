import java.util.ArrayList;

public class CreateHouseTask {

	public void createTask(ArrayList<Task> listaZadataka) {
		System.out.println("\nUnesite opis zadatka:  ");
		MainTask.input.nextLine();
		String description = MainTask.input.nextLine();
		System.out.println("\nDa li je zadatak izvrsen? true ili false:  ");
		boolean completed = MainTask.input.nextBoolean();

		CategoryHome zadatak = new CategoryHome(description, completed);
		listaZadataka.add(zadatak);

		System.out.println("\nZadatak je uspjesno kreiran.");
	}

}
