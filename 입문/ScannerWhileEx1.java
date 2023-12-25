package cond;

import java.util.Scanner;

public class ScannerWhileEx1 {
    public static void main(String[] args) {

        //Test1: 이름, 나이 반복문 출력
        while (true){
            Scanner sc = new Scanner(System.in);
            System.out.print("이름을 입력하세요 (종료를 입력하면 종료)");
            String name = sc.nextLine();

            if(name.equals("종료")){
                System.out.print("프로그램을 종료합니다.");
                break;
            }

            // age를 받으면 ex)10\n이 되는데, 이때 nextInt는 10만 가져감 그래서 남은 \n는 이름으로 가게됨
            // 그래서 ""\n이 되므로 빈문자를 출력하고, 다음 age로 넘어가게됨
            // 이럴땐, sc.nextLine();으로 한번 읽어줌
            System.out.print("나이를 입력하세요");
            int age = sc.nextInt();
            sc.nextLine();
        }

        System.out.println("-------------------");

        //Test2: 상품 가격 계산

        Scanner input = new Scanner(System.in);
        while (true) {

            System.out.print("상품의 가격을 입력하세요(-1을 입력하면 종료)");
            int price = input.nextInt();

            if (price == -1) {
                System.out.println("프로그램을 종료합니다");
                break;
            }

            System.out.print("구매하려는 수량을 입력하세요");
            int quantity = input.nextInt();
            input.nextLine();

            int total = price * quantity;
            System.out.println("총 비용: "+total);
        }
    }
}
