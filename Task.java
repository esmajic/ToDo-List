public class Task {

	private String description;
	private boolean completed;

	Task(String description, boolean completed) {
		this.description = description;
		this.completed = completed;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public boolean isCompleted() {
		return completed;
	}

	public void setCompleted(boolean completed) {
		this.completed = completed;
	}

	@Override
	public String toString() {
		return "List [description=" + description + ", completed=" + completed + "]";
	}

}
