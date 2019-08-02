package com.javalec.XML_JAVA_DI;

import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;


@Configurable
public class ApplicationConfig {

	@Bean
	//public Student javaStudent() {} == <bean id="javaStudent" class="com.javalec.XML_JAVA_DI.Student">
	public Student javaStudent() {
		
		ArrayList<String> hobbies = new ArrayList<String>();
		hobbies.add("JAVA Programming");
		hobbies.add("Sleeping");
		
		Student student = new Student("Kyu", 20, hobbies);
		student.setHeight(177);
		student.setWeight(77);
		
		return student;	//the method(ID) javaStudent() returns the java-based instance student into Student class
		
	}
}