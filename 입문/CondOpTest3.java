package cond;

import com.sun.org.apache.bcel.internal.generic.SWITCH;

import java.sql.SQLOutput;

public class CondOpTest3 {
    public static void main(String[] args) {
        //Test1 : 평점에 따른 추천영화 출력하기
        double rating = 7.5;

        // 세 개 영화를 만족하는 식을 출력해야하니까, if / else if문으로 묶는 것 X
        if (rating <= 9) {
            System.out.println("어바웃타임을 추천합니다.");
        }
        if (rating <= 8) {
            System.out.println("토이 스토리를 추천합니다.");
        }
        if (rating <= 7) {
            System.out.println("고질라를 추천합니다.");
        }

        //Test2 : 학점에 따른 성취도 출력하기
        String grade = "B";

        switch (grade) {
            case "A":
                System.out.println("탁월한 성과입니다!");
                break;

            case "B":
                System.out.println("좋은 성과입니다!");
                break;

            case "C":
                System.out.println("준수한 성과입니다!");
                break;

            case "D":
                System.out.println("향상이 필요합니다.");
                break;

            case "F":
                System.out.println("불합격입니다.");
                break;

            default:
                System.out.println("잘못된 학점입니다.");
        }

        //Test3 : 더 큰 숫자 찾기
        int a = 10;
        int b = 20;

        int vaule = a > b ? a : b;
        System.out.println("더 큰 숫자는 " + vaule + "입니다");

        //Test4 : 홀수 짝수 찾기
        int x = 15;

        String str = x % 2 == 0 ? "짝수" : "홀수";
        System.out.println("x = " + x + ", " + str);
    }
}
