
public class Main {

	public static void main (String[]args) {
		
		First f=new First();
		f.showFirst();
		System.out.println();
		
		Second s= new Second();
		s.show();
		
		//객체를 생성하면서 값을 전달 해보기.. 생성자 메소드의 값 전달
		Second s2=new Second(10,20);
		s2.show();
		
		Second s3=new Second(50,60);
		s3.show();
		
		//상속의 상속도 가능 [조부모 - 부모 - 자식]
		//Second를 상속한 Third
		
			Third t=new Third();
			System.out.println();
			//상속해준 클래스를 다른 클래스가 다시 상속도 가능
			//First를 상속한 Test
			
		new Test();
		
		//여러 클래스를 동시에 상속받는 다중 상속은 자바에서는 안됨!
		//Second 와 Test를 다중 상속하려는 Nice클래스 설계
		
		//상속은 부모클래스의 기능, 변수 들을 편리하게 사용할수있어
		//아주 편한 문법임.
		//다만,상속을 받아 기능을 사용하다 보면 살짝 원하는 기능과 
		//다른 상황이 있을수 도 있음
		// 상속 받은 기능 (메소드)를 원하는 동작으로 수정 하고 싶을 떄 
		//사용하는 문법-메소드 오버라이드 라고 부름
		//알아보기 위해 다음 프로젝트
		
	}
}
