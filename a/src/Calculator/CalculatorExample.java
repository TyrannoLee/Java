package Calculator;

import java.util.Scanner;

public class CalculatorExample {

	public static void main(String[] args) {
		Calculator c = new Calculator();
		
		int 곱 = c.곱하기(10, 20);
		
		int 합 = c.더하기(10, 20);
		System.out.println("10과 20을 곱한 값은 " + 곱 +" 더한 값은 " +합);
		
		/*값을 입력받아서 Calcutator 메소드의 곱하기 메소드 실행*/
		Scanner scanner = new Scanner(System.in);
		System.out.println("첫 번째 값을 입력하세요.");
		int values1 = scanner.nextInt();
		System.out.println("두 번째 값을 입력하세요.");
		int values2 = scanner.nextInt();
		
		int 입력곱 = c.곱하기(values1, values2);
		
		System.out.println(입력곱);
		
		/*
		 * 10과 20을 곱한 값은 200 더한 값은 30첫 번째 값을 입력하세요.
		 * 10
		 * 두 번째 값을 입력하세요.
		 * 20
		 * 200
		 */

	}

}
