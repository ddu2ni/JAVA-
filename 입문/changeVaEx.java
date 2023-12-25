package cond;

import java.util.Scanner;

public class changeVaEx {
    public static void main(String[] args) {
        //Test1: 변수값 교환
        int a = 10;
        int b = 20;
        int temp;

        temp = a;
        a = b;
        b = temp;

        System.out.println("a : " + a + ", b : " + b);

        System.out.println("-------------------------------");

        //Test2 : 사이 숫자 출력하기
        int num1, num2, empty;

        Scanner sc = new Scanner(System.in);
        System.out.print("첫 번째 숫자를 입력하세요.");
        num1 = sc.nextInt();
        System.out.print
                ("두 번째 숫자를 입력하세요.");
        num2 = sc.nextInt();

        if (num1 > num2) {
            empty = num1;
            num1 = num2;
            num2 = empty;
        }

        for (int i = num1; i <= num2; i++) {
            System.out.print(i);
            if (i != num2) {
                System.out.print(",");
            }
        }

    }
}
