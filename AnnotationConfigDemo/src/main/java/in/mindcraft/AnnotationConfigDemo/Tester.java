package in.mindcraft.AnnotationConfigDemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Tester {

	public static void main(String[] args) {
		
		ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml"){
			
			MobilePhone m1=(MobilePhone)context.getBean("mobilephone");
			m1.show();
			
		}

}
