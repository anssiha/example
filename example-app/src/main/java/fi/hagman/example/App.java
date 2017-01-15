package fi.hagman.example;

import java.util.Date;

import javax.xml.bind.JAXBException;

import fi.hagman.example.json.EmployeeParser;
import fi.hagman.example.model.Employee;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws JAXBException
    {
    	
    	Employee emp = new Employee.EmployeeBuilder("john", "doe").setContractDate(new Date()).build();
        System.out.println( "JSON: " + EmployeeParser.getEmploeeAsJson(emp) );
     //   System.out.println( "XML: " + EmployeeParser.getEmployeeAsXML(emp));
    }
}
