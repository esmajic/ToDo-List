import java.util.ArrayList;

public class CreateWorkTask {

	public void createTask(ArrayList<Task> listaZadataka) {
		System.out.println("Unos opisa zadatka... ");
		System.out.println("");
		System.out.println("Unesite opis zadatka:  ");
		TestTask.input.nextLine();
		String description = TestTask.input.nextLine();
		System.out.println("Da li je zadatak izvrsen? true ili false:  ");
		boolean completed = TestTask.input.nextBoolean();
		System.out.println("");

		CategoryWork zadatak = new CategoryWork(description, completed);
		listaZadataka.add(zadatak);

		System.out.println("Zadatak je uspjesno kreiran.");
		System.out.println("");
	}

}
