package cond;

public class CondOp1 {
    public static void main(String[] args) {
        int age = 18;
        String status = (age >= 18) ? "성인" : "미성년자";
        System.out.println("age: "+age+", status: "+status);

        //삼항 연산자 ( =조건연산자)
        //조건 ? 참(표현식) : 거짓(표현식)
        //항이 3개, 조건에 만족하면 참 실행 / 아니면 거짓 실행
    }
}
