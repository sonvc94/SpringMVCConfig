package com.journaldev.spring.model;

import com.journaldev.spring.aspect.Loggable;
import org.springframework.stereotype.Component;

@Component
public class Employee {

    private String name;

    @Loggable
	public String getName() {
		return name;
	}

	@Loggable
	public void setName(String nm) {
		this.name=nm;
	}

	@Loggable
	public void writeLog(){
        System.out.println("Nobita in Employee");
    }
	
	public void throwException(){
		throw new RuntimeException("Dummy Exception");
	}
	
}
