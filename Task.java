

public class Task {

	private String description;
	private boolean completed;
	private String creationDate;

	Task(String description, boolean completed, String creationDate) {
		this.description = description;
		this.completed = completed;
		this.creationDate = creationDate;
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

	public String getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(String creationDate) {
		this.creationDate = creationDate;
	}

	@Override
	public String toString() {
		return "Task [Opis zadatka =" + description + ", Da li je zadatak izvrsen? = " + completed
				+ ", Datum kreiranja zadatka =" + creationDate + "]";
	}

}
