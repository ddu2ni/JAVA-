package cond;

public class WhileEx1 {
    public static void main(String[] args) {
       //Test1: 10까지 출력
        int count1 = 1;
        while (count1 <= 10) {
            System.out.println(count1); // 마지막에 있으면 1이 출력이 안됨
            count1++;
        }

        //Test2: 10개의 짝수 출력 (1)
        int num=2;
        for(int count2 = 1;count2 <= 10;count2++){ //안에 변수를 다 넣을 수 있음
            System.out.println(num);
            num+=2;
        }
        //Test2: 10개의 짝수 출력 (2)
        int num1=2;
        int count=1;
        while (count <= 10) {
            System.out.println(num1);
            num1+=2;
            count++;
        }

        //Test3: 누적 합 계산 (1)

        int sum=0;
        int max=100;
        int i=1;
        while (i<=max) {
            sum += i;
            i++;
        }
        System.out.println(sum);


        //Test3: 누적 합 계산 (2)
        int sum1 = 0;
        for (int j = 1; j <= max; j++) {
            sum1 += j;
        }
        System.out.println(sum1);
    }
}
