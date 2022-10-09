package ch08.sec02;

public class RemoteControlExample {

	public static void main(String[] args) {
		RemoteControl rc = null;
		rc = new Television();
		//RemoteControl rc = new Television();
		rc = new Nintendo();
		rc.turnOn();
		//Television에서 재정의된 메소드가 호출된다.
		
		rc = new Nintendo();

		rc.turnOn();
		//닌텐도를 켭니다!
	}

}
