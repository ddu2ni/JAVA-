
public class Logical1 {

	public static void main(String[] args) {
		//��������
		// && : �� �ǿ����ڰ� �� - true / �ϳ��� �����̸� - false
		// || : �ϳ��� �����̴��� - true / �� �� �����̸� - false
		// ! : ���� (�ݴ� ���)

		System.out.println("&& and ����");
		System.out.println(true && true); // true
		System.out.println(true && false); // false
		System.out.println(false && false); // false

		System.out.println("|| or ����");
		System.out.println(true || true); // true
		System.out.println(true || false); // true
		System.out.println(false || false); // false

		System.out.println("!����");// �ݴ��� ����� ������ ��
		System.out.println(!true);
		System.out.println(!false);

		System.out.println("���� Ȱ��");
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
