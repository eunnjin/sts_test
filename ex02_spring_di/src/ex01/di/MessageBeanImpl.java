package ex01.di;

public class MessageBeanImpl implements MessageBean {
	
	private String name;
	private String greeting;
	
	// 1. 생성자 이용
	public MessageBeanImpl() { }

	public MessageBeanImpl(String name, String greeting) {
		this.name = name;
		this.greeting = greeting;
	}

	//setter 메소드 이용
	public void setName(String name) {
		this.name = name;
	}

	public void setGreeting(String greeting) {
		this.greeting = greeting;
	}
	
	
	@Override
	public void sayHello() {
		System.out.println(greeting + " / " + name);

	}


}
