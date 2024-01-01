package cond;

public class MethodEx1 {
    public static void main(String[] args) {

        //Test3 : 입출금 메서드
        int balance = 10000;

        //입금1000
        balance = deposit(balance,1000);

        //출금2000
        balance = withdraw(balance,2000);
        System.out.println("최종잔액 : "+balance+"원");
    }

    public static int deposit(int balance, int depositAmount) { //return값 중요! 출금할때 남은잔액에서 출금하니까
        balance += depositAmount;
        System.out.println(depositAmount + "원을 입금하였습니다. 현재 잔액: " + balance + "원");
        return balance;
    }

    public static int withdraw (int balance, int withdrawAmount) {
        if (balance >= withdrawAmount) {
            balance -= withdrawAmount;
            System.out.println(withdrawAmount + "원을 출금하였습니다. 현재 잔액: " + balance);
        } else {
            System.out.println(withdrawAmount + "원을 출금하려했으나 잔액이 부족합니다.");
        }
        return balance;
    }




//        //Test2: 반복 출력 메서드
//        printMessage("Hello, world!",3);
//        printMessage("java",5);
//        printMessage("bye",7);
//    }
//
//    public static void printMessage(String message, int time) {
//
//        for (int i = 0; i < time; i++) {
//            System.out.println(message);
//        }
//    }

//        System.out.println("평균값: " + average(1, 2, 3));
//        System.out.println("평균값: " + average(15, 25, 35));
//    }
//        public static double average (int a, int b, int c){
//            int sum = a+b+c;
//            return sum/3.0;
//    }
//
}
