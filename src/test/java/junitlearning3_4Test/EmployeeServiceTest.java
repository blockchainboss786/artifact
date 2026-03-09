package junitlearning3_4Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

import junitlearning3_4.Employee;
import junitlearning3_4.EmployeeService;


public class EmployeeServiceTest {
	
	 	@Test
	    void testGetEmployeesByDepartment() {
	        List<Employee> employees = Arrays.asList(
	                new Employee(1, "Alice", "IT", 50000),
	                new Employee(2, "Bob", "IT", 60000)
	        );
	        EmployeeService service = new EmployeeService(employees);

	        List<Employee> itEmployees = service.getEmployeesByDepartment("IT");

	        // Failing case because of case sensitivity bug
	        assertEquals(2, itEmployees.size());
	    }

}
