package fi.hagman.example.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class WorkOrder {
	
	private Long id;
	private String description;
	
	
	public WorkOrder() {}
	
	public WorkOrder(Long id, String description) {
		super();
		this.id = id;
		this.description = description;
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	@Override
	public String toString() {
		return "WorkOrder [id=" + id + ", description=" + description + "]";
	}
	
}
