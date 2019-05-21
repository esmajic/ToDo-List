import java.util.Date;

public class CategoryHome extends Task {

	CategoryHome(String description, boolean completed, Date creationDate) {
		super(description, completed, creationDate);
	}

	@Override
	public String toString() {
		return "CategoryHome [Opis zadatka : " + getDescription() + ", Da li je zadatak izvrsen? : " + isCompleted()
				+ ", Datum kreiranja zadatka : " + getCreationDate() + "]";
	}

}
