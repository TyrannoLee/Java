package sec08;

public class MultiInterfaceImplelExample {

	public static void main(String[] args) {
		RemoteControl rc = new SmartTelevision();
		rc.turnOn();
		rc.turnOff();
		//인터페이스에 구현 객체 대입 후 인터페이스에 선언된 추상 메소드 호출
		Searchable searchable = new SmartTelevision();
		searchable.search("http://www.naver.com");

	}

}
