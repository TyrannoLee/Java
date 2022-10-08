package ch07.secHM.exam08;

public class SnowTireExample {

	public static void main(String[] args) {
		SnowTire snowTire = new SnowTire(); //스노우타이어 객체 생성
		Tire tire = snowTire; //부모타입 객체에 자동 타입 변환해서 저장
		
		snowTire.run(); //SnowTire가 굴러갑니다.
		tire.run(); //SnowTire가 굴러갑니다. -> 
		
	}
}

//부모 타입으로 자동 타입 변환된 이후에는 부모 클래스에 선언된 필드와 메소드만 접근이 가능하다.
//자식 클래스에서 오버라이딩된 메소드가 있다면 부모 메소드 대신 오버라이딩된 메소드가 호출된다. (다형성)