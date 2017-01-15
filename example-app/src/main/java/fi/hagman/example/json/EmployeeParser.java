package fi.hagman.example.json;

import org.json.JSONObject;

import fi.hagman.example.model.Employee;

public class EmployeeParser {
	
	public static JSONObject getEmploeeAsJson(Employee employee){
		JSONObject employeeJson = new JSONObject();
		employeeJson.put("firstname", employee.getFirstname());
		employeeJson.put("lastname", employee.getLastname());
		return employeeJson;
	}
	
	
}
