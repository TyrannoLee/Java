package sec11;

public class CarExample {

	public static void main(String[] args) {
		Car myCar = new Car(); //차 객체 생성
		myCar.run(); // 한국타이어가 굴러가요x2
		
		//타이어1을 교체한다.
		myCar.tire1 = new KumhoTire();
		
		myCar.run();

		//금호타이어가 굴러가요
		//한국타이어가 굴러가요
	}

}
