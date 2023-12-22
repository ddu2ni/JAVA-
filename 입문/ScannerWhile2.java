package variable;

import java.util.Scanner;

public class ScannerWhile2 {

	public static void main(String[] args) {

		// Ex1
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println("정수를 입력하세요.");
			int num1 = sc.nextInt();
			int num2 = sc.nextInt();

			if (num1 == 0 || num2 == 0) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}

			int sum = num1 + num2;
			System.out.println("입력한 모든 정수의 합: " + sum);

		}

		// Ex2
		
		int sum = 0;

		while (true) {
			System.out.println("정수를 입력하세요.(0 입력하면 종료)");
			int number = sc.nextInt();

			if (number == 0) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}

			// sum = sum + number
			// 입력한 number의 값을 더해서 sum에 누적함 * 
			sum += number; 
		}
		
		System.out.println("입력한 모든 정수의 합: " + sum);

	}

}
