package pyc.ch02.exercise;

/** 
 * @author PiYicheng
 * ����һ���࣬������һ��int���һ��char�����Ƕ�û�б���ʼ���������ǵ�ֵ��ӡ����������֤Javaִ����Ĭ�ϳ�ʼ����
 *
 */

public class Exercise1_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Exercise1_2 test = new Exercise1_2();
		System.out.println(test.getTestField1());
		System.out.println(test.getTestField1());
	}
	
	private int testField1;
	private char testField2;
	
	public void setTestField1(int testField1) {
		this.testField1 = testField1;
	}
	
	public int getTestField1() {
		return this.testField1;
	}
	
	public void setTestField2(char testField2) {
		this.testField2 = testField2;
	}
	
	public char getTestField2() {
		return this.testField2;
	}

}
