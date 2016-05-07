package info.notsalty.springtutorial;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import info.notsalty.springtutorial.implementation.SomeBean;

public class MainSpring {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("konfiguracja.xml");
		
		SomeBean bean = context.getBean("someBean", SomeBean.class);
	}

}
