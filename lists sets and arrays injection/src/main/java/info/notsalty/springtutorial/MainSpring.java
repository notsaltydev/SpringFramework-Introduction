package info.notsalty.springtutorial;

import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainSpring {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
		SomeBean bean = context.getBean("someBean", SomeBean.class);
		
		System.out.println(bean.getIntegerList());
		System.out.println(bean.getStringsList());
		System.out.println(Arrays.toString(bean.getLongArray()));
	}

}
