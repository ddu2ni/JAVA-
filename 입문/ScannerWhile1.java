package variable;

import java.util.Scanner;

public class ScannerWhile1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.print("���ڿ��� �Է��ϼ���");
			String str = sc.nextLine();

			if (str.equals("exit")) {
				break;
			}

			System.out.print("�Է��� ���ڿ� : " + str);
			System.out.println();
		}
		System.out.println("���α׷��� �����մϴ�");
	}

}
