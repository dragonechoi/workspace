
public class Main {

	public static void main (String[]args) {
		
		
		//추상 클래스의 문법적 특징 알아보기.
		//추상클래스는 곧바로 객체 생성이 불가능
		//Test t=new Test();//error
		
		//추상클래스를 사용하려면... 상속한 클래스를 섥계하여 객체로 생성하여 사용함
		//Test 추상 클래스를 상속하는 Nice 라는 클래스를 설계해보기
	    Nice nice=new Nice();
	    nice.aaa();
	    
	    //추상클래스를 상속한 클래스들은 반드시 추상 메소드를 구현 해야하기에
	    //특정 메소드를 반드시 보유하게끔 강제할 수 있다는 특징이 있음.
	    
	    //Test 클래스를 상속하는 또다른 클랙스를 설계해보기
	    Hello h=new Hello();
	    h.aaa(); 
	}
}
