
public class CategoryHome extends Task {

	CategoryHome(String description, boolean completed) {
		super(description, completed);
	}

	@Override
	public String toString() {
		return "CategoryHome [getDescription()=" + getDescription() + ", isCompleted()=" + isCompleted() + "]";
	}

}
