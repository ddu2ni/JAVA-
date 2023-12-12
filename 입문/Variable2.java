package variable;

//변수를 선언하면 컴퓨터의 메모리공간을 확보해서 RAM에 데이터를 저장할 수 있음
//데이터를 보관할 수 있는 공간을 만들고 변수를 통해 그곳의 이름을 부여함

public class Var2 {

	public static void main(String[] args) {

		int a;
		int b;

		int c, d; // 여러개 선언 가능

		// 변수초기화 :
		// 변수를 선언했을 때 원래 기존의 공간을 차지하고 사용하는거라 기존에 쓰레기값이 있었을 수도 있음
		// 지역변수 : 개발자가 꼭 초기화 해줘야함 -> 나머지는 자바가 자동으로 해줌
		// 선언한 변수에 처음으로 값을 지정하는 것

		// 1. 변수 선언 + 초기화 따로
		int e;
		e = 1;
		System.out.println(e);

		// 2. 변수 선언과 동시에 초기화하기
		int f = 2;
		System.out.println(f);

		// 3. 여러변수 선언과 초기화를 한번에
		int g = 3, p = 4;
		System.out.println(g);
		System.out.println(p);

		// 제일 좋은 에러 : 컴파일에러 (눈으로 확인 / 오류 빨리 잡아줘서 빨리 버그 찾아서 고칠 수 있음)
		// 나쁜 에러 : 런타임에러

	}

}
