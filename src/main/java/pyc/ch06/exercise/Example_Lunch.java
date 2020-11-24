package pyc.ch06.exercise;

//һ��Java�ļ���ֻ����һ��public �࣬�ҷ���Ȩ��Ϊpublic������Ҫ���ļ���һ��
//���������Ϊ������Ȩ��
//��ķ���Ȩ��ֻ��Ϊpublic ���� ������Ȩ�ޣ�Ĭ�ϲ����κ��ַ�/friendly��ʾ��
class Soup1{
	private Soup1(){}	//���캯��������Ȩ��Ϊprivate�������޷�ֱ���ù��캯�������¶���
	
	public static Soup1 makeSoup(){
		return new Soup1();
	}
	
	public String toString(){
		return "����Soup1����";
	}
}
	
//����ģʽ
class Soup2{
	private Soup2(){}	//�����캯������Ϊprivate
		
	private static Soup2 ps1 = new Soup2(); 	//����һ������ֵ�����ã����������������Ϊprivate
	
	public static Soup2 access(){		//�ɹ����õĺ��������ش����Ĵ���Ψһ���������
		return ps1;
	}	
	
	public void f(){
		System.out.println("ͨ�������ĵ������󣬵��÷�����");
	}
}


//һ��Java�ļ���ֻ����һ��public ��
public class Example_Lunch {
	void testPrivate(){
		//�޷��������󣬹��캯��Ϊprivate
		//Soup1 soup = new Soup1();
	}
	
	void testStatic(){
		Soup1 soup = Soup1.makeSoup();
		System.out.println(soup);
	}
	
	void testSingleton(){
		Soup2.access().f();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Example_Lunch test = new Example_Lunch();
		test.testStatic();
		test.testSingleton();
	}

}
