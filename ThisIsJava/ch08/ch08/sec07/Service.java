package sec07;

public interface Service {
	//디폴트메소드
	default void defaultMehot1() {
		System.out.println("defaultMethod1 종속 코드");
		defaultCommon();
	}
	//private 메소드 
	private void defaultCommon() {
		System.out.println("defaultMethod 중복 코드A");
		System.out.println("defaultMethod 중복 코드B");
	};
	
	default void defaultMehot2() {
		System.out.println("defaultMethod2 종속 코드");
		defaultCommon();
	}
	//정적 메소드
	//private 메소드 접근 불가
	static void staticMehot1() {
		System.out.println("staticMethod1 종속 코드");
		staticCommon();
	}
	
	static void staticMehot2() {
		System.out.println("staticMethod2 종속 코드");
		staticCommon();
	}
	static void staticCommon() {
		System.out.println("staticMethod 중복 코드C");
		System.out.println("staticMethod 중복 코드D");
	}
}
