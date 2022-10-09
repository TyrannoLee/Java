package ch08.sec05;

public class Television implements RemoteControl {
	
	private int volume;//티비 볼륨 필드 

	@Override
	public void turnOn() {System.out.println("티비를 켭니다.");}

	@Override
	public void turnOff() {System.out.println("티비를 끕니다.");}

	@Override
	public void setVolume(int volume) {
		//소리가 최대볼륨보다 크거나 0보다 작지 않게 설정
		if(volume>RemoteControl.MAX_VOLUME) {
			this.volume = RemoteControl.MAX_VOLUME;
		}else if(volume<RemoteControl.MIN_VOLUME) {
			this.volume = RemoteControl.MIN_VOLUME;
		}else {
			this.volume = volume;
		}
		System.out.println("현재 tv 볼륨: " + volume);

	}

}
