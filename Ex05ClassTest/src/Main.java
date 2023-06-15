
public class Main {

	public static void main(String[]args) {
		
		//객체지향프로그램(OOP) - 객체 위주로 프로그래밍을 한다.
		//객체 : 고유한 기능과 값을 가진 녀석 (변수+함수)
		//class : 객체의 종류
		
		//OOP는 이런 객체들을 필요할떄 만들어서 기능을 사용하여 프로그래밍 하는 방식
		//java에서는 자주 사용될 기능들을 이미 만들어 설계해 놓았음..
		//이런 설계도 파일들을 Class 라고 부르며 2000여개 정도 존재함.
		//이런 Class 들을 Java System Library AIP 라고 부름.
		
		//아무리 2000여개가 있더라도 내가 원하는 모든 기능이  있을수가 없음
		//그래서 개발자가 필요한 기능을 만들어야 하는 경우도 생김.
		//이를 사용자 정의 Class라고 부름
		
		//Class를 만든느 방법 - 4가지 위치.
		//1) 별도의 . java문서에 만들기
		//2) 하나의 .java문서안에 여려개의 class를 설계하기 
		//3) class 안에 또 다른 class 설계하기
		//함수(메소드)안에 class를 설계하기
		
		//개발자가 정의한 class를 이용하여 객체 생성
	Second s =new Second();
		
	s.a=10;//  멤버변수 사용
	s.aaa();// 멤버함수 사용
	
	Third t=new Third();
	t.a=100;
	t.show();
		
	//Second 클래스 안에 설계한 hello inner 클래스
//   Second.hello h=new Second.class();이너클래스는 객체 생성 불가 
   
	
	}
}
