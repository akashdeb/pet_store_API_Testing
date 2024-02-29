package payloads;

import java.util.List;

public class Pets {
	private long id;
	private Category category;
	private String name;
	private List<String> photoUrls;
	private List<Tag> tags;
	private String status;

	// Constructors
	public Pets() {
	}

	public Pets(long id, Category category, String name, List<String> photoUrls, List<Tag> tags, String status) {
		this.id = id;
		this.category = category;
		this.name = name;
		this.photoUrls = photoUrls;
		this.tags = tags;
		this.status = status;
	}

	// Getters and Setters
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<String> getPhotoUrls() {
		return photoUrls;
	}

	public void setPhotoUrls(List<String> photoUrls) {
		this.photoUrls = photoUrls;
	}

	public List<Tag> getTags() {
		return tags;
	}

	public void setTags(List<Tag> tags) {
		this.tags = tags;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	// toString method for easy printing
	@Override
	public String toString() {
		return "{" + "id=" + id + ", category=" + category + ", name='" + name + '\'' + ", photoUrls=" + photoUrls
				+ ", tags=" + tags + ", status='" + status + "}";
	}
}




