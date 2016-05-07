package info.notsalty.springtutorial;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainSpring {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
		Application app = context.getBean("aplikacja", Application.class);
		
		System.out.println(app.getUserRepository().exists("adame³"));
		System.out.println(app.getDictionaryRepository().getMapValue());

	}

}
