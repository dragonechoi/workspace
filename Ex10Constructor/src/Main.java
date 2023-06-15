
public class Main {
	public static void main(String[]args) {
		
		// 사용자정보[이름,나이] 데이터를 설계한 Person클래스를 객체로 생성
				Person p= new Person();
				//멤버변수에 값을 대입해주는 기능사용 - 메소드 호출
				p.setMembers("sam", 20);		
				//Person객체의 멤버변수값들을 출력해주는 기능사용 - 메소드호출
				p.show();
				
				// 2번째 사용자정보 객체 생성
				Person p2= new Person();
				p2.setMembers("robin", 25);
				p2.show();
				
				// 이런식으로 객체를 만들면 항상 이어서 멤버값을 대입해주는 기능호출문이
				// 있어야함. 그러니.. 항상 2줄의 코딩이 필요함. 이게 은근 짜증.
				// 변수도 만들면서 초기화 할 수 있듯이
				// 객체도 생성하면서 멤버값을 전달하여 초기화할 수 있음.
				// 이때 사용되는 아주 특별한 메소드 : 생성자 Constructor
				
				// Person클래스에 적용하기전에 먼저 생성자의 문법연습
				First f= new First();
				
				// 생성자메소드는 객체를 생성할때 마다 발동함
				First f2= new First();
				
				// 생성자메소드에 값을 파라미터로 전달해보기
				First f3= new First(10);
				System.out.println();
				
				// Person클래스에 생성자메소드 만들고 객체생성해보기
				Person p3= new Person();
				p3.show();
				
				// Person 객체를 생성하면서 멤버값들을 전달해보기
				// 생성자메소드에 값을 파라미터로 전달해보기
				Person p4= new Person("hong", 30);
				p4.show();
				
				// 객체를 생성하면서 이름만 전달해보기
				Person p5= new Person("park");
				p5.show();
				
				// 객체를 생성하면서 나이만 전달해보기
				Person p6= new Person(23);
				p6.show();
				
				// 주의! 생성자도 클래스의 멤버함수이기에 접근제한의 영향 있음.
				// default 접근제한의 생성자메소드로 인해 객체생성이 불가한 상황도 있을 수 있음.
				// aaa 패키지의 Test클래스를 객체로 생성
				//aaa.Test t= new aaa.Test();
				//t.a= 10; //public 멤버는 접근 가능
				//t.b= 20; //error : default 멤버는 다른 패키지에서는 접근 불가
				
				
				// this()생성자 호출문법 - 멤버변수가 많을때 값대입을 매번하기 번거로워서 사용하는 문법
				Second s= new Second(10, 20);		
				Second s2= new Second();
				Second s3= new Second(100);
				
				System.out.println();
				
				// 초기화 4단계 확인실습
				InitialTest obj= new InitialTest();
				System.out.println( obj.a );
	}

}
