import java.util.Date;

public class Task implements Comparable <Task>{

	private String description;
	private boolean completed;
	private Date creationDate;

	Task(String description, boolean completed, Date creationDate) {
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

	public Date getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}

	 @Override
	  public int compareTo(Task k) {
	    if (getCreationDate() == null || k.getCreationDate() == null) {
	      return 0;
	    }
	    return getCreationDate().compareTo(k.getCreationDate());
	  }

}
