
public class Second extends First{

	//아무것도 없어보이지만 First를 상속했기에 이미 First의
	//멤버를 보유한 상태
	
	//본인만의 멤버변수 추가
	int b;
	
	//본인의 멤버변수를 출력하는 기능메소드
	void showSecond() {
		System.out.println("b: "+b );
	    
	}
	
	// 상속받은 멤버 a와 본인 멤버 b모두를 출력하는 기능 메소드
	void show() {
		//System.out.println("a: "+a);
		//객체지향은 객체의  멤버 제어는 객체 스스로 하도록 권장
		//a변수를 가진 First 객체가 스스로 출력하도록 요청
		//First(부모객체)의 멤버를 내것인양 사용할수 있기에 부모 메소드도 그냥 호출가능
		showFirst();
		
		
		
		System.out.println("b: "+b);
	    System.out.println();
	}
	
	//멤버변수에 값을 대입해주는 기능 메소드
	void setMembers(int a, int b) {
	    //this.a=a;
		//this.는 Second를 의미하므로 ..First 의 멤버인 a를 사용하기에는 
	    //적합하지 않아보임
		//부모객체를 지칭하는 특별한 키워드 : super.
		//super.a=a;
		//객체지향을 니껀 니가.. super의 멤버값입력은 First가 직접하도록 요청
		setA(a);  // 꼭 super을 사용할 필요가없음
		
		this.b=b;
		
	}
	
	
}
