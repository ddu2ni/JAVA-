package variable;

import java.util.Scanner;

public class ScannerWhile2 {

	public static void main(String[] args) {

		// Ex1
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println("������ �Է��ϼ���.");
			int num1 = sc.nextInt();
			int num2 = sc.nextInt();

			if (num1 == 0 || num2 == 0) {
				System.out.println("���α׷��� �����մϴ�.");
				break;
			}

			int sum = num1 + num2;
			System.out.println("�Է��� ��� ������ ��: " + sum);

		}

		// Ex2
		
		int sum = 0;

		while (true) {
			System.out.println("������ �Է��ϼ���.(0 �Է��ϸ� ����)");
			int number = sc.nextInt();

			if (number == 0) {
				System.out.println("���α׷��� �����մϴ�.");
				break;
			}

			// sum = sum + number
			// �Է��� number�� ���� ���ؼ� sum�� ������ * 
			sum += number; 
		}
		
		System.out.println("�Է��� ��� ������ ��: " + sum);

	}

}
