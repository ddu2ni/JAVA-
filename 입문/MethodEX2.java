package cond;

import java.util.Scanner;

//입출금액 구하기
public class MethodEX2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int ch = 0;
        int balance = 0;
        int deposit = 0;

        while (true) {

            do {
                System.out.println("-------------------------------------");
                System.out.println("1.입금 ㅣ 2.출금 ㅣ 3.잔액 확인 ㅣ 4.종료");
                System.out.println("--------------------------------------");

                ch = sc.nextInt();
                sc.nextLine();

            } while (ch < 1);

            int depositAmount = 0;
            int withdrawAmount = 0;

            switch (ch) {

                case 1:
                    System.out.print("입금액을 입력하세요: ");
                    depositAmount = sc.nextInt();

                    balance = deposit(balance, depositAmount);
                    break;

                case 2:
                    System.out.print("출금액을 입력하세요: ");
                    withdrawAmount = sc.nextInt();

                    balance = withdraw(balance, withdrawAmount);
                    break;

                case 3:
                    System.out.println("현재 잔액: " + balance + "원");
                    break;

                case 4:
                    System.out.println("시스템을 종료합니다.");
                    System.exit(0);
                    break;

                //System.exit(0); break; 대신 return으로도 받아도 됨

                default:
                    System.out.println("올바른 선택이 아닙니다. 다시 선택해주세요.");
            }
        }
    }

    //1.입금
    public static int deposit(int balance, int depositAmount) {

        balance += depositAmount;

        System.out.println(depositAmount + "원을 입금하였습니다. 현재 잔액: " + balance);
        return balance;
    }

    //2.출금
    public static int withdraw(int balance, int withdrawAmount) {

        if (balance >= withdrawAmount) {
            balance -= withdrawAmount;
            System.out.println(withdrawAmount + "원을 출금하였습니다. 현재잔액: " + balance);
        } else {
            System.out.println("잔고가 부족해서 출금할 수 없습니다.");
        }
        return balance;
    }
}
