package variable;

public class Var3 {

	public static void main(String[] args) {

		// 변수 = type(타입)
		// ex. int타입 = int형식 = int형  

		// 리터럴(literal) : 코드에서 개발자가 직접적은 값 ex. 100 / 10.5 /'A'
		// 정수 리터럴 / 실수 리터럴 / 불리언 리터럴 / 문자 하나 리터럴 등
		// 변수의 값은 변할 수 있지만, 리터럴 자체는 변하지않음(사용자가 정한값이므로)

		int a = 100; // 정수 (마이너스 가능)
		double b = 10.5; // 실수 (마이너스 가능)
		boolean c = true; // 불리언 true,false 중 반환
		char d = 'A'; // 문자 하나
		String e = "Hello Java"; // 문자열, *String[클래스] : 첫글자가 대문자로 시작하는 특별한 타입

		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);

	}

}
