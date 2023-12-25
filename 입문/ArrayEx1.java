package cond;

import java.util.Scanner;

public class ArrayEx1 {
    public static void main(String[] args) {

        //Test1 : 배열로 변경
        int student[] = {90, 80, 70, 60, 50};
        int total = 0;

        /* 향상된 for문으로 풀기 [고급형]
        for(int st : student){
            total += st;
        }
        */

        for (int i = 0; i < student.length; i++) {
            total += student[i];
        }
        System.out.println("점수 총합: " + total);

        double average = (double) total / student.length;
        System.out.println("점수 평균: " + average);


        System.out.println("---------------------------------");


        //Test2 : 배열의 입력과 출력
        Scanner sc = new Scanner(System.in);
        int num[] = new int[5];
        System.out.println("5개의 정수를 입력하세요");

        for (int i = 0; i < num.length; i++) {
            num[i] = sc.nextInt();
        }

        System.out.println("출력");
        for (int print : num) {
            System.out.print(print);
            if (print != num[num.length - 1]) {
                System.out.print(", ");
            }
        }


        System.out.println("---------------------------------");


        //Test3 : 배열의 역순 출력
        Scanner input = new Scanner(System.in);
        int number[] = new int[5];

        System.out.println("5개의 정수를 입력하세요.");

        for (int i = 0; i < number.length; i++) {
            number[i] = input.nextInt();
        }

        System.out.println("출력");
        for(int i = number.length-1; i >= 0; i--){
            System.out.print(number[i]);

            if(i>0){
                System.out.print(", ");
            }
        }


        System.out.println("---------------------------------");


        //Test4 : 합계와 평균 구하기
        Scanner scanner = new Scanner(System.in);
        int numbers[] = new int[5];
        int sum = 0;

        System.out.println("5개의 정수를 입력하세요.");

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt();
            sum += numbers[i];
        }

        double ave = (double)sum / numbers.length;
        System.out.println("입력한 정수의 합계: "+ sum);
        System.out.println("입력한 정수의 평균: "+ ave);

    }
}

