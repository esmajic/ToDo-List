
public class CategoryWork extends Task {

	CategoryWork(String description, boolean completed) {
		super(description, completed);

	}

	@Override
	public String toString() {
		return "CategoryWork [getDescription()=" + getDescription() + ", isCompleted()=" + isCompleted() + "]";
	}

}
