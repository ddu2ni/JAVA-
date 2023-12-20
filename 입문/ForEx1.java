package cond;

public class ForEx1 {
    public static void main(String[] args) {
        // Test 1: 구구단 출력하기
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                System.out.println(i + " * " + j + " = " + (i * j));
            }
        }

        // Test 2: 피라미드 출력하기
        int rows = 5;

        for(int k=1;k<=rows;k++){
            for (int m = 1; m <= k; m++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
