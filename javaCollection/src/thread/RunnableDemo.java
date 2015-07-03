package thread;
/*
 * run()호출하는 것은 클래스 내부의 메소드 인 start()이다.
 * 이것을 호출하는 것으로 쓰레드가 작업을 실행하는데
 * 필요한 호출스택(call stack)를 생성한 다음
 * run()을 호출해서 생성된 호출스택에 
 * run()을 저장시킨다.
 * 즉 스레드를 구현한 클래스는 start()을 통해 시작해야 한다.
 */
public class RunnableDemo {
	public static void main(String[] args) {
		Runnable r = new RunnableImpl();
		Thread thr = new Thread(r); // r 이 파라미터 로 던져진 형태
		thr.start();
		//SCJP 에서 잘나오는 문제
	}
}
