
public class Comp1 {

	public static void main(String[] args) {
		//비교연산자
		int a = 2;
		int b = 3;

		System.out.println(a == b);
		System.out.println(a != b);
		System.out.println(a > b);
		System.out.println(a < b);
		System.out.println(a >= b);
		System.out.println(a <= b);
		System.out.println("------");
		//결과를 boolean의 변수에 담을 수 있음
		boolean result = a==b;
		System.out.println(result);
		
		//문자열 비교 (.equals 메서드 사용해야함)
		String str1 = "문자열1";
		String str2 = "문자열2";
		
		System.out.println("------");
		boolean result1 = "hello".equals("hello");
		boolean result2 = str1.equals("문자열1");
		boolean result3 = str1.equals(str2);
		
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
	}

}
