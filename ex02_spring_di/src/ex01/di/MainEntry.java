package ex01.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainEntry {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("ex01//di/ctx.xml");
		
		MessageBeanImpl bean = (MessageBeanImpl) context.getBean("messageBeanImpl");
		bean.sayHello();
		
		MessageBeanImpl bean2 = (MessageBeanImpl) context.getBean("m1");
		bean2.sayHello();
		
		MessageBeanImpl bean3 = (MessageBeanImpl) context.getBean("xyz");
		bean3.sayHello();
	}
}
