package cond;

import java.util.Scanner;

public class ScannerEx1 {
    public static void main(String[] args) {
        //Test1: 이름 나이 입력받고 출력하기
        //자바,30살

       Scanner sc = new Scanner(System.in);

        System.out.print("당신의 이름을 입력하세요.");
        String name = sc.nextLine();
        System.out.print("당신의 나이를 입력하세요.");
        int age = sc.nextInt();

        System.out.println("당신의 이름은 "+name+"이고, 나이는 "+age+"살입니다.");

        System.out.println("----------------------------------------------------");

        //Test2: 홀수, 짝수
       Scanner scanner = new Scanner(System.in);

        System.out.print("하나의 정수를 입력하세요.");
        int num = scanner.nextInt();

        if (num % 2 == 0) {
            System.out.println("입력한 숫자 " + num + "는 짝수입니다.");
        } else {
            System.out.println("입력한 숫자 " + num + "는 홀수입니다.");
        }

        System.out.println("----------------------------------------------------");

        //Test3: 음식점 주문
        Scanner input = new Scanner(System.in);

        String foodName;
        int foodPrice, foodQuantity;

        System.out.print("음식 이름을 입력해주세요.");
        foodName = input.nextLine();
        System.out.print("음식 가격을 입력해주세요.");
        foodPrice = input.nextInt();
        System.out.print("음식 수량을 입력해주세요.");
        foodQuantity = input.nextInt();

        int totalPirce = foodPrice * foodQuantity;

        System.out.println(foodName+foodQuantity+"개를 주문하셨습니다. 총 가격은 "+totalPirce+"입니다.");

        System.out.println("----------------------------------------------------");

        //Test4: 구구단출력
        Scanner scn = new Scanner(System.in);
        System.out.println("구구단의 단 수를 입력해주세요.");
        int dan = scn.nextInt();

        System.out.println(dan+"단의 구구단 :");
        for (int i=1;i<=9;i++) {
            System.out.println(dan+" x "+i+" = "+ dan*i);
        }
    }
}
