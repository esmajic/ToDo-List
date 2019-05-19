
public class CategoryWork extends Task {

	CategoryWork(String description, boolean completed) {
		super(description, completed);

	}

	@Override
	public String toString() {
		return "CategoryWork [Opis zadatka =" + getDescription() + ", Da li je zadatak izvrsen? =" + isCompleted()
				+ "]";
	}

}
