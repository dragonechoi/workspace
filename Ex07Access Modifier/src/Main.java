
public class Main {

	public static void main(String[] args) {
		//OOP는 객체의 멤버들을 외부에서 마음대로 사용하는 것에대해 제한한다
		//그래서 존재하는 접근 제한자 라는 문법이 존재함 . 
		
		//멤버접근을 제한하는 제한자의 4개자 종류[보안 강-->약]
		//1.private   : 본인 클래스 안에서만 접근이 가능한 제한자
		//2.default   : 같은 패키지 안에서는 .연산자로 멤버 접근이 가능,다른 패키지에서는 접근불가 
		//3.protected : 같은 패키지 안에서는 .연산자로 멤버 접근이 가능,다른 패키지에서는 접근불가,단,상속관계라면 접근 가능함
		//4.public    : 어디서든 .연산자로 접근 가능 
		
		
		// 같은 패키지의 클래스 객체 생성 
		
		Frist f=new Frist();
//		f.a=10 //error : private 멤버는 사용불가
				f.b=20;
				f.c=30;
				f.d=40;
				
				f.aaa();
				
				//다른 패키지의 클래스 객체 생성 
			aaa.Second s=new aaa.Second();
//			s.a=10;//error
//			s.b=20;//error
//			s.c=30;//error
			s.d=40;//public만 사용가능
			
			//멤버함수 호출-함수도 멤버에 대한 접근제한 영향 받음
			//s.show();//error
			 s.output();
		
			
			
	}
}
