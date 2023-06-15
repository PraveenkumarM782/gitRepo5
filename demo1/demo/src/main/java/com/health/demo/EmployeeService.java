package com.health.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {
	
	@Autowired
	EmployeeRepository er;
	
	//List<Employee> empList = new ArrayList<> ( Arrays.asList(new Employee("111","praveen","Sales"), new Employee("222","Virkant","Accounts"),new Employee("333","Sachin","marketing")));


	public List<Employee> getallEmployee() {
		List<Employee> elist = new ArrayList();
		
		er.findAll().forEach(elist::add);
		return elist;
		
	//	return empList;
	}


	public Employee getEmp(String eid) {
	
//		 Employee empresult = empList.stream().filter(b->b.getEid().equals(eid)).findFirst().get();
//		
//		return empresult;
		
		return er.findById(eid).get();
		
	}


	public void addEmp(Employee e) {
				
		//empList.add(e);
		er.save(e);
		
	}
	
	public void updateEmp(Employee e, String eid) {
		
//			for(int i=0 ;i<empList.size();i++) {
//			
//			  Employee res = empList.get(i);
//			   
//			   
//				   if(res.getEid().equals(eid))
//				   {
//					  empList.set(i,e);
//				   }
//			
//			}
		
		er.save(e);
		
		
	}


	public void deleteEmp(String eid) {
			
	//	empList.removeIf(t->t.getEid().equals(eid));
		
		er.deleteById(eid);
		
	}
	
	
	

}
