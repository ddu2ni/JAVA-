package cond;

import java.util.Scanner;

public class ArrayEx2 {
    public static void main(String[] args) {
        ////Test1 : 합계,평균구하기
        Scanner sc = new Scanner(System.in);
        int sum = 0;

        System.out.print("입력받을 숫자의 개수를 입력하세요.");
        int num = sc.nextInt();

        int su[] = new int [num]; // num 개수
        System.out.println(num+"개의 정수를 입력하세요.");
        for(int i=0;i<num;i++){
            su[i] = sc.nextInt();
            sum += su[i];
        }

        double ave = (double)sum / num;
        System.out.println("입력한 정수의 합계: "+ sum);
        System.out.println("입력한 정수의 평균: "+ ave);


        System.out.println("----------------------------------------");

        //Test2 : 가장 큰 수, 가장 작은 수 구하기
        Scanner scanner = new Scanner(System.in);
        int minNumber, maxNumber;

        System.out.print("입력받을 숫자의 개수를 입력하세요 : ");
        int count = scanner.nextInt();

        int number[] = new int[count];
        System.out.println(count + "개의 정수를 입력하세요.");
        for (int i = 0; i < count; i++) {
            number[i] = scanner.nextInt();
        }

        minNumber = maxNumber = number[0];

        for (int i = 1; i < count; i++) {
            if (number[i] < minNumber) { // su[1] < su[0]
                minNumber = number[i]; // 가장 작은 수: su[1]
            }

            if (number[i] > maxNumber) { //su[1] > su[0]
                maxNumber = number[i];
            }
        }

        System.out.println("가장 작은 정수: " + minNumber);
        System.out.println("가장 큰 정수: " + maxNumber);






    }
}
