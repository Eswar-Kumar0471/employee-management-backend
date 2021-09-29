package tech.ek.employeemanagementspringboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import tech.ek.employeemanagementspringboot.model.Employee;
import tech.ek.employeemanagementspringboot.repository.EmployeeRepo;

@RestController
@RequestMapping("/api/v1")
public class EmployeeController {
	
	@Autowired
	private EmployeeRepo empRepo;
	
	//get All Employees
	@GetMapping("/employees")
	public List<Employee> getAllEmployees() {
		return empRepo.findAll();
		
	}

}
