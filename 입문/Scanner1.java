package variable;

import java.util.Scanner;

public class Scanner1 {
	public static void main(String[] args) {
		
		//�� ū ���� ����ϱ� 
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("ù��° ���� �Է��ϼ���");
		int num1 = sc.nextInt();
		System.out.print("�ι�° ���� �Է��ϼ���");
		int num2 = sc.nextInt();
		
		if(num1>num2) {
			System.out.println("�� ū ���ڴ� "+num1);
		}else if(num2>num1){
			System.out.println("�� ū ���ڴ� "+num2);
		}else {
			System.out.println("�� ���ڴ� �����ϴ�.");
		}
		
	}
}
