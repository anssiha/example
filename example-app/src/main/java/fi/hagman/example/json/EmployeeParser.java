package fi.hagman.example.json;

import java.io.StringWriter;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

import org.json.JSONObject;

import fi.hagman.example.model.Employee;

public class EmployeeParser {
	
	public static JSONObject getEmploeeAsJson(Employee employee){
		JSONObject employeeJson = new JSONObject();
		employeeJson.put("firstname", employee.getFirstname());
		employeeJson.put("lastname", employee.getLastname());
		return employeeJson;
	}
	
	public static String getEmployeeAsXML(Employee employee) throws JAXBException{
		JAXBContext jaxbContext = JAXBContext.newInstance(Employee.class);
		Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
		// output pretty printed
		jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

		StringWriter sw = new StringWriter();
		jaxbMarshaller.marshal(employee, sw);
		return sw.toString();
	}
	
	
}
