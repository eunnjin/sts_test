package ex03.di.annot;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.GenericApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainEntry {
	public static void main(String[] args) {
		// annotation 이용한 방법
//		AnnotationConfigApplicationContext ctx = 
//				new AnnotationConfigApplicationContext(ApplicationContext.class);
//		
//		Cats catsInfo = (Cats) ctx.getBean("catsInfo"); 
//		catsInfo.catsInfoPrint();
//		
//		MyCats cat2 = (MyCats) ctx.getBean("cat2"); 
//		catsInfo.setMyCats(cat2);
//		catsInfo.catsInfoPrint();

		
		
		//xml 설정파일 이용한 방법
//		ApplicationContext context = 
//				new ClassPathXmlApplicationContext("ex03/di/annot/appContext.xml");
		
		String configcontext = "classpath:ex03/di/annot/appContext.xml";
		AbstractApplicationContext context = new GenericXmlApplicationContext(configcontext);
		// bean을 가져온다. - getBean()
		// 직접 객체 생성이 아닌, 생성되어 있는
		// 객체를 외부에서 얻어옴(주입시켜줬음)
		
		MyCats myCats = (MyCats) context.getBean("cat3");
		
		Cats cats = (Cats) context.getBean("catInfo");
		
		cats.setMyCats(myCats);
		cats.catsInfoPrint();
		
	}
}
