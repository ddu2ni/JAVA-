package cond;

import java.util.Scanner;

public class ArrayEx3 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int scores [][] = new int [4][3];
        String subject[] = {"국어","영어","수학"};



        for (int i = 0; i < 4; i++) {
            System.out.println((i+1)+"번 학생의 성적을 입력하세요.");
            for (int j = 0; j < 3; j++) {
                System.out.print(subject[j]+"점수 : ");
                scores[i][j] = input.nextInt();
            }
        }

        for(int i = 0; i < 4; i++){
            int total = 0;
            for (int j = 0; j < 3; j++) {
                total += scores[i][j];
            }
            double ave = (double)total / 3.0; //과목3개
            System.out.println((i+1)+"번 학생의 총점 : "+ total+", 평균 : "+ ave);
        }

        System.out.println("-----------------------------------------");

        Scanner scanner = new Scanner(System.in);

        System.out.print("학생수를 입력하세요.");
        int count = scanner.nextInt();

        int ints [][] = new int[count][3];
        String str[] = {"국어","영어","수학"};

        for (int i = 0; i < count; i++) {
            System.out.println((i+1)+"번 학생의 성적을 입력하세요.");
            for (int j = 0; j < 3; j++) {
                System.out.print(str[j]+"점수 : ");
                ints[i][j] = scanner.nextInt();
            }
        }

        for(int i = 0; i < count; i++){
            int total = 0;
            for (int j = 0; j < 3; j++) {
                total += ints[i][j];
            }
            double ave = (double)total / 3.0; //과목3개
            System.out.println((i+1)+"번 학생의 총점 : "+ total+", 평균 : "+ ave);
        }
    }
}
