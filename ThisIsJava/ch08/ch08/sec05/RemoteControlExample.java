package ch08.sec05;

public class RemoteControlExample {

	public static void main(String[] args) {
		RemoteControl rc = null;
		rc = new Television();
		
		rc.turnOn();
		rc.turnOff();
		
		//디폴트 메서드 호출
		rc.setMute(true);
		rc.setMute(false);
		
		//오디오 재정의한 디폴트 메서드------------------
		System.out.println("------------------");
		rc = new Audio();
		rc.turnOn();
		rc.setVolume(12);
		
		rc.setMute(true);
		rc.setMute(false);
		
		

	}

}
