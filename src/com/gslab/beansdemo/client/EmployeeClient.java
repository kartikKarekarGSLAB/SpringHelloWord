package com.gslab.beansdemo.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

import com.gslab.beansdemo.model.Employee;

public class EmployeeClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//1.classPathXmlApplicationContext
		System.out.println("loading ClassPathXmlApplicationContext : ");
		ApplicationContext applicationContext =new ClassPathXmlApplicationContext("employee.xml");
		System.out.println(applicationContext.getBean(Employee.class));
		System.out.println("closing ClassPathXmlApplicationContext : ");
		((ClassPathXmlApplicationContext)applicationContext).close();
		//2 FileSystemXmlApplicationContext
		System.out.println("loading FileSystemXmlApplicationContext : ");
		ApplicationContext fileAppContext = new FileSystemXmlApplicationContext("resources\\xml\\employee.xml");
		System.out.println(fileAppContext.getBean(Employee.class));
		System.out.println("closing FileSystemXmlApplicationContext : ");
		((FileSystemXmlApplicationContext)fileAppContext).close();
	}

}
