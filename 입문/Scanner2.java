package variable;

import java.util.Scanner;

public class Scanner2 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.print("ù��° ���� �Է��ϼ���");
			int num1 = sc.nextInt();
			System.out.print("�ι�° ���� �Է��ϼ���");
			int num2 = sc.nextInt();

			if (num1 == 0 && num2 == 0) {
				System.out.println("���α׷��� �����մϴ�.");
				break;
			}

			System.out.print(num1 + num2);
		}

	}

}
