import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class CreateHouseTask {

	public void createTask(ArrayList<Task> listaZadataka, ArrayList<Task> listaSvihKreiranihZadataka) throws Exception {
		try {
			System.out.println("\nUnesite opis zadatka:  ");
			String description = MainTask.input.nextLine();
			System.out.println("\nDa li je zadatak izvrsen? true ili false:  ");
			boolean completed = MainTask.input.nextBoolean();
			SimpleDateFormat myFormat = new SimpleDateFormat("dd-MM-yyyy");
			MainTask.input.nextLine();
			System.out.println("\nUpisite dan kreiranja zadatka (dd-MM-gggg):  ");
			String creationDate1 = MainTask.input.nextLine();
			Date creationDate = myFormat.parse(creationDate1);

			CategoryHome zadatak = new CategoryHome(description, completed, creationDate);
			listaZadataka.add(zadatak);
			listaSvihKreiranihZadataka.add(zadatak);

			System.out.println("\nZadatak je uspjesno kreiran.");
		} catch (Exception e) {
			System.out.println("Unijeli ste krivu vrijednost. Vrijednost mora biti True ili False.");
		}
	}

}
