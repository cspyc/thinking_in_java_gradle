package pyc.ch13.exercise;

public class Immutable {
	//�ַ���ת��д
	public static String upcase(String s) {
		return s.toUpperCase();
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String q = "howdy";
		System.out.println(q);		
		
		String qq = upcase(q);	//֤����������ԭ�ַ���ת���������½���һ����
		System.out.println(qq);
		System.out.println(q);
		
	}

}
