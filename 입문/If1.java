package cond;

public class If1 {
    public static void main(String[] args) {
        //if문으로만 쓰면 불필요한 다음 조건을 계속 검색함
        //그래서 else if를 사용함 (if문 조건이 거짓일 때 다음 조건을 검사함 / 참이면 else if 실행하지 않음)

        int age = 14;

        if (age <= 7) {
            System.out.println("미취학");
        } else if (age <= 13) {// age >= 8 && age <= 13 (X), 앞에서 이미 7살보다 작지 않다는걸 체크하고 넘어왔으므로
            System.out.println("초등학생");
        } else if (age <= 16) {
            System.out.println("고등학생");
        } else if (age <= 19) {
            System.out.println("성인");
        }
    }
}