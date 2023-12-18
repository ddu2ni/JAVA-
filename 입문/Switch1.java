package cond;

public class Switch1 {
    public static void main(String[] args) {
//        int grade = 3;
//        int coupon;
//
//        if (grade == 1) {
//            coupon = 1000;
//        }else if (grade == 2) {
//            coupon = 2000;
//        }else if (grade == 3) {
//            coupon = 3000;
//        }else {
//            coupon = 500;
//        }
//        System.out.println("발급받은 쿠폰: "+coupon);

//        if문은 비교연산자를 사용할 수 있지만, switch문은 값이 같은지만 비교가능
//        switch + break 짝꿍
        int grade=2;

        int coupon;
        switch (grade) {
            case 1 :
                coupon = 1000;
                break;

            case 2 :
                coupon = 2000;
                break;

            case 3 :
                coupon = 3000;
                break;

            default :
                coupon = 500;
                break;
        }
        System.out.println("발급받은 쿠폰: "+coupon);


//        자바14부터 - 새로운 switch문
//
//        int grade = 2;
//
//        int coupon = switch (grade1){
//          case 1 -> 1000;
//            case 2 -> 1000;
//            case 3 -> 1000;
//            default -> 1000;
//        };
//        System.out.println("발급받은 쿠폰: "+coupon);
    }
}
