package variable;

import java.util.Scanner;

public class Scanner2 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.print("첫번째 수를 입력하세요");
			int num1 = sc.nextInt();
			System.out.print("두번째 수를 입력하세요");
			int num2 = sc.nextInt();

			if (num1 == 0 && num2 == 0) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}

			System.out.print(num1 + num2);
		}

	}

}
