
public class Main {

	public static void main(String[]args) {
		
		//상속에 대한 이해.
		//상속은 부모의 멤버만 가져오는 것이 아니라 
		//부모객체도 같이생성하는 개념.
		//즉, 객체 안에 객체가 있는 모습(러시아의 마트료 시카 를 연상)
		
		
		Second s=new Second();
		s.a=10; //상속받은 클래스의 멤버를 내것인양 사용가능
		s.b=20;
		
		System.out.println("a: "+s.a);
		System.out.println("b: "+s.b);
		System.out.println();
		
		//객체지 향은 멤버면수의 제어를 직접 . 연산자로 하는것을 권장하지 않음
	    // 멤버값을 출력하는 기능을 만들어서 사용하는 것을 권장
		
		s.showFirst();
		System.out.println("b: "+s.b);
		System.out.println();
		
		//이런식이면 .. Second도 본인의 멤버변수를 출력하는 기능이 있어야 함
		s.showFirst();
		s.showSecond();
	    System.out.println();
	    
	    //가만보니.. Second 객체는 a,b 모두를 사용하려고 만든 객체이니까
	    //출력기능도 a,b 모두를 출력해주는 기능이 있는것이 더합리적
	    s.show();
	    
	    //이런식이면 .. 값을 대입하는 기능도 있으면 좋을듯
	    s.setMembers(50, 60);
	    s.show();
	    
	    //2번째 객체 생성및 값대입과 출력
	    Second s2=new Second();
	    s2.setMembers(100, 200);
	    s2.show();
	    
	    //객체도 생성하면서 값을 전달하면 더 간결하다
	    //객체를 생성하면 자동으로 발동하는 특별한 메소드 - 생성자 메소드 를
	    //이용하여 값을 초기화 해보기.
	    
	    
	    
	}
}
