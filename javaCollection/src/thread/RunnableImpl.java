package thread;

public class RunnableImpl implements Runnable {

	@Override
	public void run() {
		 for (int i = 0; i < 5; i++) {
			 /*
			  * Thread는 쓰레드를 구현한 클래스 이다.
			  */
			System.out.println(Thread.currentThread().getName());
		}
		
	}

}
