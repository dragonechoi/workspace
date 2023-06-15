
public class LocalClassTest {
	
	int g= 10; //일반 멤버변수
	int b;
	
	//멤버 메소드
	void aaa() {	
		
		g= 100;
		b= 500;
		k= 200;
		
		final int a= 50; //지역변수 - 다른 지역에서는 인식불가		
		
		// 메소드영역안에 클래스 설계 /////////////////////
		// Local class [지역클래스, 내장클래스, 내부클래스 ]
		// 설계된 지역안에서만 인식가능한 설계도(클래스)
		class Good{
			int n=10;
			void show() {
				System.out.println("Good.. show ");
				System.out.println(n);
				System.out.println(g);
				System.out.println(a);
			}
		}//////////////////////////////////////////
		
		Good good= new Good();
		good.show();
		
				
		// local class 사용하는 이유
		//1. 그 메소드가 실행중일때만 잠시 1회용처럼 사용하는 객체를 만들고 싶을때..
		//2. 나중에 배울 '익명클래스'라는 것을 사용할때...
		
	}//aaa method..
	
	String s; //멤버변수
	
	void bbb() {
		g= 100;
		//a= 200; //error
		
		double k;
		
		//Good good= new Good(); //error -- 인식불가
	}
	
	int k; //멤버변수

}//class...
