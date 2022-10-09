package ch08.sec04;

public class RemoteControlExample4 {

	public static void main(String[] args) {
		RemoteControl rc = null;
		rc = new Audio();
		rc.turnOn();
		rc.setVolume(20);
		rc.turnOff();
		
		rc = new Television();
		rc.turnOn();
		rc.setVolume(5);
		rc.turnOff();

	}

}
