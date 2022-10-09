package sec010;

public class CastingExample {

	public static void main(String[] args) {
		Vehicle vehicle = new Bus();
		//인터페이스 타입의 참조 변수에 버스 객체를 대입했다.
		
		vehicle.run(); 
		//인터페이스를 통해 run메소드를 호출하면 Bus의 메소드엔 접근할 수 없다.
		
		Bus bus = (Bus) vehicle;
		//상제 타입 변환 후 호출
		bus.run();
		bus.checkFare();

	}

}
