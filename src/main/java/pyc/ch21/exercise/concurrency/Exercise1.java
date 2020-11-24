package pyc.ch21.exercise.concurrency;
/****************** Exercise 1 *****************
* Implement a Runnable. Inside run(), print a
* message, and then call yield(). Repeat this
* three times, and then return from run(). Put
* a startup message in the constructor and a
* shutdown message when the task terminates. Create
* a number of these tasks and drive them using
* threads.
***********************************************/

public class Exercise1 implements Runnable{
	private static int taskCount = 0;
	private final int id = taskCount++;
	
	public Exercise1() {
		System.out.println("����ʼ��id:"+id);
	}

	
	public void run() {
		for(int i = 0; i < 3;i++) {
			System.out.println("����id:"+id+",����һ������_���"+i+"!");
			Thread.yield();
		}
		System.out.println("����ִ�н�����id:"+id);		

	}
	
	public static void main(String[] args) {
		for(int i = 0 ;i < 5;i++) {
			Thread t = new Thread(new Exercise1());
			t.start();			
		}
		
		
	}
}
