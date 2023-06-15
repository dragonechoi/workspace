
public class Main {

	public static void main(String[]args) {
		
		
		//Thread( 스레드 ): 작성된 코드를 실행하는 객체 - 동시에 여러 작업을 처리하는 기법
		//용어소개
		//1)Process : 실행중인 하나의 자바 프로그램        --프로세스간에는 자원공유가 불가능
		//2)Thread : 하나의 프로세스 안에서 동작하는 직원의 개념 --스레드간에는 자원공유가 가능
		
		//하나의 프로세스에는 적어도 하나의 스레드가 기본적으로 존재하야 그 스레드를 Main Thread라고 부름
		//스레드 혼자 오래걸리는 작업(코드)을 수행하면 다른 코드드들(작업들)이 대기상태로 
		//오랫동안 실행되지 못할 수 있기에 동시에 여러작업을 하려면
		//별도의 스레드객체를 생성하여 요청해야함.
		
		//동시에 했으면 하는 작업 2개 구현!
		
		//작업 1. 20개의 파일을 다운로드 하는 작업
//		for(int i =0 ;i<20; i++) {
//			System.out.println((i+1)+"번째 파일 다운로드 중");
//			
//			//강제로 잠시 시간을 벌기..
//			for(long k=0;k<40000000000L;k++) {
//				new String("aaa");
//			}
//		}
//		//작업 2. 20개의 음악을 재생하는 작업
//		for(int i =0 ;i<20; i++) {
//			System.out.println((i+1)+"번째 음악 재생 중");
//			
//			for(long k=0;k<40000000000L;k++) {
//				new String("aaa");
//				
//				
//			}
//			
//		}
		
		
		//별도의 직원(Thread:코드를 실행하는 녀석)객체 생성항뎌 각각의 코드(작업) 를 실행하도록 요청
		//Thread객체를 그냥 new로 만들어 쓰는 것이 아니라
		//Thread가 해야할 작업을 별도로 설계하여 작성해 놓아야함.
		//즉, 별도의 class를 설계하여 그 class가 Thread의 능력을 가지도록 하며
		//해야할 작업들을 작성해 놓아야함

		ThreadA a=new ThreadA();
		//스레드가 해야할 작업을 작성해 놓은 run()메소드는 절대로 직접 호출하면 안됨.
		//a.run(); X금지 error은 안나지만 자동으로 발동시키는 시작 명령어가있음 
		a.start();//자동 run()이 발동함
		
		ThreadB b=new ThreadB();
		b.start();
		
		//main Thread 도 별도의 추가작업을 할 수 있음.
		for(int i=100;i<120;i++) {
			//현재 이 코드를 읽고 있는 스레드가 누군지 알려주는 기능
			String name =Thread.currentThread().getName();
			System.out.println(name+":"+i);
			
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {}
		}
		
		
	}//Main method..
	
}//Main class

//파일다운로드 작업을 수행하는 직원 클래스 (Thread를 상속하는)
class ThreadA extends Thread{
	//모든 Thread는 이 메소드 안에 작정한 것만 스스로 실행함.
	//Thread클래스 안에 있는 run()메소드를 오버라이드 해서 사용해야만 함.
	@Override
	public void run() {
		// TODO Auto-generated method stub
		String name =Thread.currentThread().getName();
		for(int i=0;i<20;i++) {
			
			System.out.println(name+":"+i+"번째 파일 다운로드중...");
			
			//잠시대기... 500ms -- 0.5초
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}

//음악 재생 작업을 수행하는 직원클래스를 설계
class ThreadB extends Thread{
	@Override
	public void run() {
		String name=Thread.currentThread().getName();
		for(int i=0;i<20;i++) {
			System.out.println(name+":"+i+"번째 음악 재생중...");
			
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {}
		}
	}
}
