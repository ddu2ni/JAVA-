package class1;

//클래스(ex, 붕어빵틀) 를 사용해서 객체생성 new를 하면
//int, String과 같은 타입을 만들 수 있음 

//이때 실제 메모리에 만들어진 실체 = 객체 / 인스턴스 (ex,붕어빵)

public class Class {
    public static void main(String[] args) {

        Student student1; //클래스 + 변수: 학생을 담아둘 수 있는 변수
        student1 = new Student(); //Student 클래스 안에 있는 3개 변수를 student1에 담아서 메모리에 올려 쓸 수 있게 함

        student1.name = "학생1";
        student1.age = 15;
        student1.grade = 90;

        Student student2 = new Student(); //Student 타입 3개의 객체를 사용 할 수 있음
        student2.name = "학생2";
        student2.age = 20;
        student2.grade = 80;

        System.out.println("이름: "+student1.name+", 나이: "+student1.age+", 점수: "+student1.grade);
        System.out.println("이름: "+student2.name+", 나이: "+student2.age+", 점수: "+student2.grade);
    }
}

class Student {

    //클래스에 정의한 변수 = (멤버변수,필드:데이터항목)
    String name;
    int age;
    int grade;
}

