
//사용자 정의 Class
public class Second {
   //클래스는  멤버 변수(필드)와 멤버 함수(메소드) 구성
	
	//멤버 변수
	int a;
	
	//멤버 함수
	void aaa() {
		System.out.println("Second aaa ,method...");
	
		//함수 안에 다른 class를 설계
	 class nice{
		 int a;
		 void show() {
			 System.out.println("Nice show method");
		 }
	 }
		
	}//aaa method...
	
	//다른클래스 설계하기
	// inner class 라고 부름
	class hello{
		int a;
		void show() {
			System.out.println("hello show method");
		}
		
		
	}
	
}//Second class...

//또 다른 class를 선언할 수 있음

class Third{
	int a;
	void show() {
		System.out.println("Third show method....");
	}
}
