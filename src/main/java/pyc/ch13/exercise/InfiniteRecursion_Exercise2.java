package pyc.ch13.exercise;

import java.util.*;

public class InfiniteRecursion_Exercise2 {

	//��ӡ��������ڴ��ַ
	public String toString() {
		//��������,��Ϊ��+��,�������Ὣthisת����һ��String,����this�ϵ�toString()�����������ݹ���ã�����java.lang.StackOverflowError
		//return "InfiniteRecursion address:"+ this  +"\n";  		
		 
		//����Object�ϵ�toString����
		return "InfiniteRecursion address:"+ super.toString()  +"\n";  
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<InfiniteRecursion_Exercise2> v = new ArrayList<InfiniteRecursion_Exercise2>();
		for(int i = 0;i<10;i++) {
			v.add(new InfiniteRecursion_Exercise2());
		}
		System.out.println(v);
	}

}
