package sec09;

public class ExtendsExample {

	public static void main(String[] args) {
		InterfaceImpl impl = new InterfaceImpl();
		
		InterfaceA ia = impl;
		ia.methodA();
		System.out.println();
		
		InterfaceB ib = impl;
		ib.methodB();
		System.out.println();
		
		InterfaceC ic = impl;
		ic.methodA();
		System.out.println();
		//상속한 c는 a 메소드에도 접근이 가능합니다.
		ic.methodC();
		ic.methodB();

	}

}
