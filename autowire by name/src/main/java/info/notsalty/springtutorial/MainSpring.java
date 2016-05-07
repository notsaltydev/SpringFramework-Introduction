package info.notsalty.springtutorial;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainSpring {

	public static void main(String[] args) {
		//autowire wyszukuje za pomoca setterów
		ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
		SomeBean someBean = context.getBean("someBean", SomeBean.class);
		
		System.out.println(someBean.getInjectedBean1().getName());
		System.out.println(someBean.getInjectedBean2().getName());
		
		
	}

}
