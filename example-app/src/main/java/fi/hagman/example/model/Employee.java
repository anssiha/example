package fi.hagman.example.model;

import java.util.Date;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Employee {
	
	private String firstname;
	
	private String lastname;
	
	private EmployeeTitle title;
	
	private Date contractDate;
	
	private Employee(EmployeeBuilder builder){
		this.firstname = builder.firstname;
		this.lastname = builder.lastname;
		this.title = builder.title;
		this.contractDate = builder.contractDate;
	}
	
	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public EmployeeTitle getTitle() {
		return title;
	}

	public void setTitle(EmployeeTitle title) {
		this.title = title;
	}

	public Date getContractDate() {
		return contractDate;
	}

	public void setContractDate(Date contractDate) {
		this.contractDate = contractDate;
	}
	
	public static class EmployeeBuilder {
		private String firstname;
		
		private String lastname;
		
		private EmployeeTitle title;
		
		private Date contractDate;
		
		public EmployeeBuilder (String firstname, String lastname){
			this.firstname = firstname;
			this.lastname = lastname;
		}
		
		public EmployeeBuilder setTitle(EmployeeTitle title){
			this.title = title;
			return this;
		}
		
		public EmployeeBuilder setContractDate(Date contractDate){
			this.contractDate = contractDate;
			return this;
		}

		
		public Employee build(){
			return new Employee(this);
		}
		
	}

	
	
}
