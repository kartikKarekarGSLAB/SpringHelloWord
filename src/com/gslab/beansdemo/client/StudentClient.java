package com.gslab.beansdemo.client;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import java.net.URISyntaxException;
import java.nio.file.*;
import com.gslab.beansdemo.model.Student;

public class StudentClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Resource resource = new ClassPathResource("student.xml");
		BeanFactory beanFactoryRef = new XmlBeanFactory(resource);
		Object object = beanFactoryRef.getBean("student");
		if (object != null) {
			Student sobj = (Student) object;
			System.out.println("Name : "+sobj.getName());
		}
		System.out.println(beanFactoryRef.getBean("mandar", Student.class));
		
		System.out.println(beanFactoryRef.getType("shivaji"));
		String[] alisesArray = beanFactoryRef.getAliases("mandar");
		for (String string : alisesArray) {
			System.out.println(string);
		}
		//generate exception  org.springframework.beans.factory.NoUniqueBeanDefinitionException
		//work for single bean only of that class
//		Student testStudent = beanFactoryRef.getBean(Student.class);
//		System.out.println(testStudent);
	}

}
