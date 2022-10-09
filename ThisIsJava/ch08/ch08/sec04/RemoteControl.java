package ch08.sec04;

public interface RemoteControl {
	int MAX_VOLUME = 40;
	int MIN_VOLUME = 0;
	
	//추상 메서드 
	
	void turnOn();
	void turnOff();
	void setVolume(int volume);

}



//추상 메서드는 public abstract를 생략하더라도 컴파일 과정에서 자동으로 붙게 된다.
