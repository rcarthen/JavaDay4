package com.javaday4.employee.controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.javaday4.employee.model.*;
import com.javaday4.employee.service.EmployeeService;


@RestController
public class EmployeeController {
	@Autowired
private EmployeeService employeeService;

//Display all employees
	@GetMapping("/employees")
public List<Employee> reteriveEmployeeList(){
		return employeeService.retrieveAllEmployees();
	}
	
	
}

