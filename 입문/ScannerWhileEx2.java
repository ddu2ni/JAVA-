package cond;

import java.util.Scanner;

public class ScannerWhileEx2 {
    public static void main(String[] args) {

        //Test1: 숫자들의 합계, 평균 출력하기
        Scanner sc = new Scanner(System.in);

        int sum = 0;
        int count = 0;

        System.out.println("숫자를 입력하세요. 입력을 중단하려면 -1을 입력하세요");
        while (true) {
            int num = sc.nextInt();
            if (num == -1) {
                break;
            }
            sum += num;
            count++; //평균을 구하기위해선 개수를 알아야함
        }

//          while((num= sc.nextInt())!=-1){
//            sum+=num;
//            count++;
//        }

        double average = (double) sum / count; //
        System.out.println("입력한 숫자들의 합계: " + sum);
        System.out.printf("입력한 숫자들의 평균: %.2f ", average);
        //원하는 소수점까지 얻으려면 %f 사이에 [.원하는 자리수] 를 넣으면 됨


        System.out.println("------------------------------------");


        //Test2: 상품 구매
        String product = "";
        int gasu = 0;
        int price = 0;
        int total = 0;

        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("1:상품입력, 2:결제, 3:프로그램 종료");
            int option = scanner.nextInt();

            switch (option) {
                case 1:
                    scanner.nextLine();
                    System.out.print("상품명을 입력하세요:");
                    product = scanner.nextLine();
                    System.out.print("상품의 가격을 입력하세요:");
                    price = scanner.nextInt();
                    System.out.println("구매 수량을 입력하세요:");
                    gasu = scanner.nextInt();
                    scanner.nextLine(); //개행문자 \n 삭제

                    total += price * gasu; //누적값 -> 2번에 사용
                    System.out.println("상품명: " + product + ", 가격: " + price + ", 수량:" + gasu + ", 합계: " + price * gasu);
                    break;

                case 2:
                    System.out.println("총 비용: " + total);
                    total = 0;
                    break;

                case 3:
                    scanner.nextLine();
                    System.out.println("프로그램을 종료합니다.");
                    System.exit(0); //JVM 강제 종료
                    break;

                default:
                    System.out.println("올바른 옵션을 선택해주세요.");
                    break;
            }

        }
    }
}
