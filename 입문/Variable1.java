package variable;

//변수 : 변할 수 있는 값 
//변수를 사용함으로써 많은 양의 값을 한번에 변경할 수 있음
public class Var1 {
	public static void main(String[] args) {

		// 변수 선수 => 숫자를 저장할 수 있는 int
		int a;

		// 변수 초기화 (오른쪽값 왼쪽에 대입 / a <- 10에 대입)
		a = 10;

		// 변수값 읽기 (반복해서 읽을 수 있음)
		System.out.println(a);
		System.out.println(a);

		a = 50;// 변수 값 변경 a(10 -> 50)
		// 기존값은 삭제됨
		System.out.println(a);

	}
}
