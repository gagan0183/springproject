package com.knights;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class KnightMain {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext contexts = new ClassPathXmlApplicationContext("knights.xml");
		Knight knight = contexts.getBean(Knight.class);
		knight.embarkOnQuest();
		contexts.close();
	}
}
