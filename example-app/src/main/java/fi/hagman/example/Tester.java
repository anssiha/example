package fi.hagman.example;

import java.util.Date;

import javax.xml.bind.JAXBException;

import com.google.gson.Gson;

import fi.hagman.example.json.JSONParser;
import fi.hagman.example.json.XMLParser;
import fi.hagman.example.model.Employee;
import fi.hagman.example.model.WorkOrder;

/**
 * Hello world!
 *
 */
public class Tester 
{
    public static void main( String[] args ) throws JAXBException
    {
    	
    	Employee emp = new Employee.EmployeeBuilder("john", "doe").setContractDate(new Date()).build();
        System.out.println( "JSON: " + JSONParser.getEmploeeAsJson(emp) );
       System.out.println( "XML: " + XMLParser.getWorkOrderAsXML(new WorkOrder(1l, "Testi", new Date())));
       
       Gson gson = new Gson();
       String json = gson.toJson(emp);  
       System.out.println(json);
       
       Employee employee = gson.fromJson(json, Employee.class);
       System.out.println(employee);
    }
}
