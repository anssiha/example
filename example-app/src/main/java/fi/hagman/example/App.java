package fi.hagman.example;

import java.util.Date;

import fi.hagman.example.json.EmployeeParser;
import fi.hagman.example.model.Employee;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	
    	Employee emp = new Employee.EmployeeBuilder("john", "doe").setContractDate(new Date()).build();
        System.out.println( "Hello Github " + EmployeeParser.getEmploeeAsJson(emp) );
    }
}
