package com.javalec.XML_JAVA_DI;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		
		/* xml + java DI (xml-based)
		 * We can use both xml and java file at the same time by deciding the base container you want between xml and java. 
		 * Here, java file is included in the xml file. */
		AbstractApplicationContext ctx = new GenericXmlApplicationContext("classpath:applicationCTX.xml");	//container
		
		//student1 (java resource): ApplicationCTX.xml -> ApplicationConfig.java -> Student.java
		Student student1 = ctx.getBean("javaStudent", Student.class);	  
		System.out.println("Name: " + student1.getName());
		System.out.println("Age: " + student1.getAge());
		System.out.println("Hobbies: " + student1.getHobbies());
		System.out.println("Height: " + student1.getHeight());
		System.out.println("Weight: " + student1.getWeight());
		System.out.println();
		
		//student2 (xml resource): ApplicationCTX.xml -> Student.java
		Student student2 = ctx.getBean("xmlStudent", Student.class);	
		System.out.println("Name: " + student2.getName());
		System.out.println("Age: " + student2.getAge());
		System.out.println("Hobbies: " + student2.getHobbies());
		System.out.println("Height: " + student2.getHeight());
		System.out.println("Weight: " + student2.getWeight());
		System.out.println();
		
		ctx.close();

	}

}
