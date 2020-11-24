package pyc.ch21.exercise.concurrency;

public class MoreBasicThreads {

	public static void main(String[] args) {		
		for(int i = 0 ;i < 5;i++) {
			new Thread(new LiftOff()).start();		//��ʼ������������߳�			
		}
		
		System.out.println("Waiting for LiftOff");
	}

}
