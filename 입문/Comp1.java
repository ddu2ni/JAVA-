
public class Comp1 {

	public static void main(String[] args) {
		//�񱳿�����
		int a = 2;
		int b = 3;

		System.out.println(a == b);
		System.out.println(a != b);
		System.out.println(a > b);
		System.out.println(a < b);
		System.out.println(a >= b);
		System.out.println(a <= b);
		System.out.println("------");
		//����� boolean�� ������ ���� �� ����
		boolean result = a==b;
		System.out.println(result);
		
		//���ڿ� �� (.equals �޼��� ����ؾ���)
		String str1 = "���ڿ�1";
		String str2 = "���ڿ�2";
		
		System.out.println("------");
		boolean result1 = "hello".equals("hello");
		boolean result2 = str1.equals("���ڿ�1");
		boolean result3 = str1.equals(str2);
		
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
	}

}
