package com.journaldev.spring.main;

import com.journaldev.spring.config.AppConfig;
import com.journaldev.spring.model.Employee;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.journaldev.spring.service.EmployeeService;

public class SpringMain {

	public static void main(String[] args) {
//		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
		EmployeeService employeeService = ctx.getBean("employeeService", EmployeeService.class);

		System.out.println(employeeService.getEmployee().getName());

		employeeService.getEmployee().setName("Pankaj");

		employeeService.writeEmployee();

		Employee employee = ctx.getBean("employee", Employee.class);
		employee.setName("Nobita");
		employee.writeLog();

		ctx.close();
	}

}
