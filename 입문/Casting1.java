package cond;

public class Casting1 {
    public static void main(String[] args) {
        //같은 타입끼리의 계산 = 같은 타입의 결과를 출력
        //다른 타입끼리의 계산 = 큰 범위로 자동 형변환됨
        int div1 = 3/2;
        System.out.println("div1 = "+div1); //1

        double div2 = 3/2; // (double = int / int) ,  1 (int) -> 1.0 (double)
        System.out.println("div2 = "+div1); //1.0

        double div3 = 3.0/2;// (double = double / int) , double / double ( <- 2.0 (double)) = 1.5 double
        System.out.println("div3 = "+div1); //1.5

        double div4 =(double) 3/2; //명시적 형변환
        System.out.println("div4 = "+div1); //1.5

    }

}
