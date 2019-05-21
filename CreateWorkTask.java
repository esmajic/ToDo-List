import java.util.ArrayList;

public class CreateWorkTask {

	public void createTask(ArrayList<Task> listaZadataka, ArrayList<Task> listaSvihKreiranihZadataka) throws Exception {
		try {
			System.out.println("\nUnesite opis zadatka:  ");
			String description = MainTask.input.nextLine();
			System.out.println("\nDa li je zadatak izvrsen? true ili false:  ");
			boolean completed = MainTask.input.nextBoolean();
			MainTask.input.nextLine();
			System.out.println("\nUpisite dan kreiranja zadatka (dd-MM-gggg):  ");
			String creationDate = MainTask.input.nextLine();

			CategoryWork zadatak = new CategoryWork(description, completed, creationDate);
			listaZadataka.add(zadatak);
			listaSvihKreiranihZadataka.add(zadatak);

			System.out.println("\nZadatak je uspjesno kreiran.");
		} catch (Exception e) {
			System.out.println("Unijeli ste krivu vrijednost. Vrijednost mora biti True ili False.");
		}
	}

}
