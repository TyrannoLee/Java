package ch07.secHM.exam07;

public class Child extends Parent {
	public String name;
	
	public Child () {
		this("홍길동");
		System.out.println("Child() call");
	}

	
	public Child(String name) {
		this.name = name;
		System.out.println("Child(Stirng name) call");
	}
}
