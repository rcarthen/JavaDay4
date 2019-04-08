package com.javaday4.employee.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.springframework.stereotype.Service;

import com.javaday4.employee.model.Employee;


@Service

public class EmployeeService {

	Employee emp1 = new Employee(101, "Selam", "Ethiopia");
	Employee emp2 = new Employee(102, "Njoki", "Kenya");
	Employee emp3 = new Employee(103, "Idil", "Somalia");
	Employee emp4 = new Employee(104, "Sera", "Uganda");
	Employee emp5 = new Employee(105, "Sainabou", "Gambia");
	List<Employee> employeeList = new ArrayList<Employee>(Arrays.asList(emp1, emp2, emp3, emp4, emp5));

	public List<Employee> retrieveAllEmployees() {
		return employeeList;
	}

}
