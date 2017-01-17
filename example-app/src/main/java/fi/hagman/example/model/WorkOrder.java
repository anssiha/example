package fi.hagman.example.model;

import java.util.Date;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class WorkOrder {
	
	private Long id;
	private String description;
	private Date orderDate;

	private Date deliveryDate;
	
	public WorkOrder() {}
	
	public WorkOrder(Long id, String description, Date orderDate) {
		super();
		this.id = id;
		this.description = description;
		this.orderDate = orderDate;
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
	
	public Date getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}

	public Date getDeliveryDate() {
		return deliveryDate;
	}

	public void setDeliveryDate(Date deliveryDate) {
		this.deliveryDate = deliveryDate;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("WorkOrder [id=");
		builder.append(id);
		builder.append(", description=");
		builder.append(description);
		builder.append(", orderDate=");
		builder.append(orderDate);
		builder.append("]");
		return builder.toString();
	}


	
}
