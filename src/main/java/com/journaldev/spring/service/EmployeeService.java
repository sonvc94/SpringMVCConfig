package com.journaldev.spring.service;

import com.journaldev.spring.aspect.Loggable;
import com.journaldev.spring.model.Employee;
import org.springframework.stereotype.Component;

@Component
public class EmployeeService {

	private Employee employee;

	public Employee getEmployee(){
		Employee employee = new Employee();
		employee.setName("Son");
		return employee;
	}

	@Loggable
	public void writeEmployee(){
		System.out.println("CSVN");
	}
	
	public void setEmployee(Employee e){
		this.employee=e;
	}
}
