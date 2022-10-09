package ch08.sec05;

public interface RemoteControl {
	int MAX_VOLUME = 30;
	int MIN_VOLUME = 0;
	
	void turnOn();
	void turnOff();
	void setVolume(int volume);
	
	default void setMute(boolean mute) {
		if(mute) {
			System.out.println("무음 처리합니다.");
			setVolume(MIN_VOLUME);
		}else {System.out.println("무음 해제합니다.");
	}
		//디폴트 메소드는 구현 객체가 필요한 메소드이다.

}
}
