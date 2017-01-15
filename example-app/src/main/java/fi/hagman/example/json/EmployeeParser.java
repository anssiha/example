package fi.hagman.example.json;
import java.io.StringWriter;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

import org.json.JSONObject;

import fi.hagman.example.model.Employee;

public class EmployeeParser {
	
	private static final String DATE_FORMAT = "dd.MM.yyyy";
	
	public static JSONObject getEmploeeAsJson(Employee employee){
		JSONObject employeeJson = new JSONObject();
		employeeJson.put("firstname", employee.getFirstname());
		employeeJson.put("lastname", employee.getLastname());
		
		if (employee.getContractDate()!=null){
			DateFormat df = new SimpleDateFormat(DATE_FORMAT);
			employeeJson.put("contractDate", df.format(employee.getContractDate()));
		}
		
		
		return employeeJson;
	}
	
	
}
