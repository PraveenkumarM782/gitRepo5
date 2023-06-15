package com.health.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class EmployeeController {
	
	@Autowired
	EmployeeService es;	
	
	@RequestMapping("/employee")
	public List<Employee> getAllEmployee()
	{
		return es.getallEmployee();
	}
	
	@RequestMapping("/employee/{data}")
	public Employee getEmp(@PathVariable("data")String eid) {
		
	 	return es.getEmp(eid);
	}
	
	@PostMapping("/employee")
	public void addEmp(@RequestBody Employee e) {
		es.addEmp(e);
	}
	
	@PutMapping("/employee/{eid}")
	public void updateEmp(@RequestBody Employee e, @PathVariable String eid) {
		es.updateEmp(e, eid);
	}
	
	@DeleteMapping("/employee/{eid}")
	public void deleteEmployee(@PathVariable("eid") String eid) {
		es.deleteEmp(eid);
	}

}
	

