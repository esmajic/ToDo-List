
public class CategoryHome extends Task {

	CategoryHome(String description, boolean completed) {
		super(description, completed);
	}

	@Override
	public String toString() {
		return "CategoryHome [Opis zadatka =" + getDescription() + ", Da li je zadatak izvrsen? =" + isCompleted()
				+ "]";
	}

}
