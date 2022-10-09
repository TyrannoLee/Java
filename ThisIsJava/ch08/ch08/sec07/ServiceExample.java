package sec07;

public class ServiceExample {

	public static void main(String[] args) {
		//인터페이스 변수 선언과 구현 객체 대입
		Service service = new ServiceImp1();
		
		service.defaultMehot1();
		System.out.println();
		service.defaultMehot2();
		System.out.println();
		
		Service.staticMehot1();
		System.out.println();
		Service.staticMehot2();
		
		//디폴트 메소드와 정적 메소드 호출 방식이 다르다.

	}

}
