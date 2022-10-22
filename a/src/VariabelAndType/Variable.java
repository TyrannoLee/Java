package VariabelAndType;

import java.util.Scanner;

public class Variable {
	public static void main(String[]args) {
	
	/*1. 변수를 선언하고 연산 결과를 콘솔에 출력 */
	int a = 10;
	int result = a + 30;
	System.out.println(result);
	System.out.println();
	/*만약 변수를 선언하고 값을 입력해 주지 않은 상태에서 연산을 한 결과를 콘솔에 출력하려고 하면 에려 발생
	 * ==>The local variable a may not have been initialized
	 * */
	
	
	/*2. 시간을 분으로 고치기*/
	int hour = 3;
	int min = 5;
	System.out.println("총 " + (hour*60)+ min +" 분 입니다.");
	System.out.println();
	
	
	/*3. 두 변수의 값을 교환하는 방법 ##################3
	 * 1)변수 선언
	 * 2)임시 공간 만들어주기
	 * 3)임시 공간에 값을 교환*/
	int v1 = 10;
	int v2 = 20;
	System.out.println("[초기값] \n v1: "+v1+" ,v2: "+v2);
	int imsi = v1; /*imsi=10*/
	v1=v2; /*v1=20*/
	v2=imsi; /*v2=10(임시 변수에 옮겨진 v1 10의 값*/
	System.out.println("[변경값] \n v1: "+v1+ " ,v2: "+v2);
	System.out.println();
	
	
	/*4. 논리 타입 */
	int me = 20;
	boolean result1 = (me == 20);
	if(result1) { // result1이 true(20)이면 출력
		System.out.println(result1+ " ! 20살입니다.");
	}else {System.out.println("미성년자입니다."); //result1이 false면 (20이 아니면) 출력
	}
	System.out.println();
	
	
	/*5.printf  */
	int value4 = 123;
	System.out.printf("상품의 가격:%d원\n", value4); //상품의 가격:123원
	System.out.printf("상품의 가격:%6d원\n", value4); //상품의 가격:   123원 (왼쪽 공백6)
	System.out.printf("상품의 가격:%-10d원\n", value4); //상품의 가격:123       원 (오른쪽 공백10)
	
	
	/*6. while 반복문에서 "종료"를 입력 받으면 "종료합니다"를 출력하고 반복문 종료하기*/
	Scanner scanner = new Scanner(System.in);	
	while(true) {
		System.out.println("입력하세요>");
		String input = scanner.nextLine();
		if(input.equals("종료")){//문자열 비교는 equals()
			System.out.println("종료합니다.");
			break; //반복문 종료 break;
		}else {
			System.out.println("입력한 내용: " + input);
			System.out.println();
		}
	}
	
	

	
	
	}
}
