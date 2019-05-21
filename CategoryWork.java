
public class CategoryWork extends Task {

	CategoryWork(String description, boolean completed, String creationDate) {
		super(description, completed, creationDate);

	}

	@Override
	public String toString() {
		return "CategoryWork [Opis zadatka =" + getDescription() + ", Da li je zadatak izvrsen? = " + isCompleted()
				+ ", Datum kreiranja zadatka =" + getCreationDate() + "]";
	}

}
