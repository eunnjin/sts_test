package ex03.di.annot;

import java.util.ArrayList; 

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;

@Configurable // spring 설정에 사용되는 클래스임을 명시 <-- ctx.xml
public class ApplicationContext {

	@Bean // 객체(bean) 생성을 어노테이션으로 했음
	public MyCats cat1() {
		ArrayList<String> hobbys = new ArrayList<String>();
		hobbys.add("꾹꾹이");
		hobbys.add("뒹굴기");
		
		MyCats myCats = new MyCats("쿠키", 13, hobbys);
		myCats.setWeight(15.3);
		myCats.setColor("brown");
		
		return myCats;
	}
	
	@Bean
	public MyCats cat2() {
		ArrayList<String> hobbys = new ArrayList<String>();
		hobbys.add("앞발들기");
		hobbys.add("간식먹기");
		
		MyCats myCats = new MyCats("보리", 6, hobbys);
		myCats.setWeight(7.3);
		myCats.setColor("white");
		
		return myCats; // MyCats 객체 리턴
	}
	
	@Bean
	public Cats catsInfo() {
		Cats cats = new Cats(this.cat1());
		
		return cats;
	}
}
