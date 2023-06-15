
public class JoinTest {

	public static void main(String[]args) {
		JThread j=new JThread();
		j.start();//5초정도 소요되는 작업 시작
		
		//J작업이 완료된 후에 아래작업을 하고 싶을떄
		//synchronized 동기화 문법으로는 처리할 수 없을떄.
		// 어떤 스레드의 작업이 끝날때까지 무조건 어떤스레드도 무조건
		//대기시키는 기능
		try {
			j.join();
		} catch (InterruptedException e1) { }
		
		//main Thread가 다른작업 수행
		for(int i=0 ;i<10;i++) {
			System.out.println("main..");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {}
		}
	}
}

 class JThread extends Thread{
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0;i<10;i++) {
			System.out.println("aaa");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {}
		}
	}
}
