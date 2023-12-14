package variable;

public class Var4 {

	public static void main(String[] args) {

		// 변수 선언 표현 범위가 크면 메모리 공간 많이 차지함
		// 변수 선언 표현 범위가 작으면 메모리 공간 조금 차지함

		// 정수 4가지
		byte b = 127; // -128~127
		short s = 32767; // -32,768~32,767
		int i = 2147483647; // (*기본 - 4byte) ~약 20억 ~ 약 20억
		long l = 9223372036854775807L; // L 필수로 붙여줘야함 !

		// 실수
		float f = 10.0f; // f 필수로 붙여줘야함!
		double d = 10.0; // (*기본 - 8byte) float보다 정밀도가 높음

		// boolean : 1byte
		// char:1byte
		// String : 문자열의 길이에 따라 상이

	}

}
