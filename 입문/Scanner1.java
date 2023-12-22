package variable;

import java.util.Scanner;

public class Scanner1 {
	public static void main(String[] args) {
		
		//더 큰 숫자 출력하기 
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫번째 수를 입력하세요");
		int num1 = sc.nextInt();
		System.out.print("두번째 수를 입력하세요");
		int num2 = sc.nextInt();
		
		if(num1>num2) {
			System.out.println("더 큰 숫자는 "+num1);
		}else if(num2>num1){
			System.out.println("더 큰 숫자는 "+num2);
		}else {
			System.out.println("두 숫자는 같습니다.");
		}
		
	}
}
