package cond;

public class If2 {
    public static void main(String[] args) {
        int price = 10000;
        int age = 10;
        int discount = 0;

        if (price >= 10000) {
            discount += 1000;
            System.out.println("10000원 이상 구매, 1000원 할인");
        }

        if (age <= 10) {
            discount += 1000;
            System.out.println("어린이 1000원 할인");
        }
        System.out.println("총 할인금액: "+discount+"원");

        //if문을 쓰면 해당하는 모든 할인을 적용함
        //그러나 else if문을 쓰면, 첫번째로 충족하는 조건만 만족하고 나머지는 무시됨
        //사용자는 나머지 할인을 놓치게 됨

        //if문에서 중괄호 { } 생략 가능 - 단, 1개의 실행명령이 있을 때만
    }
}
