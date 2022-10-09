package ch08.sec02;

public class Television implements RemoteControl {

	@Override
	public void turnOn() {
		System.out.println("티비를 켭니다.");

	}

}


//RemoteControl인터페이스에 정의된 turnOn추상 메소드에 대한 실행 내용을 구현했다.
//Television 구현 클래스
