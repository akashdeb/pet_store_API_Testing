package payloads;

public class Tag {
	private long id;
	private String name;

	// Constructors
	public Tag() {
	}

	public Tag(long id, String name) {
		this.id = id;
		this.name = name;
	}

	// Getters and Setters (generated automatically)
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	

	// toString method for easy printing
	@Override
	public String toString() {
		return "{" + "id=" + id + ", name='" + name + '\'' + "}";
	}

	
}