
public class Logical1 {

	public static void main(String[] args) {
		//논리연산자
		// && : 두 피연산자가 참 - true / 하나라도 거짓이면 - false
		// || : 하나가 거짓이더라도 - true / 둘 다 거짓이면 - false
		// ! : 부정 (반대 결과)

		System.out.println("&& and 연산");
		System.out.println(true && true); // true
		System.out.println(true && false); // false
		System.out.println(false && false); // false

		System.out.println("|| or 연산");
		System.out.println(true || true); // true
		System.out.println(true || false); // true
		System.out.println(false || false); // false

		System.out.println("!연산");// 반대의 결과가 나오게 함
		System.out.println(!true);
		System.out.println(!false);

		System.out.println("변수 활용");
		boolean a = true;
		boolean b = false;
		System.out.println(a && b);// false
		System.out.println(a || b);// true
		System.out.println(!a);// true
		System.out.println(!b);// false

		System.out.println("-------");

		int c = 15;
		boolean result = c > 10 && c < 20;
		System.out.println("result : " + result);

	}

}
