
public class Second extends First{
  //이미 First의 a변수를 보유한 상태
	private int b;
	
	//멤버값을 출력하는 기능메소드 [ 상속 받은 a변수도 출력할 의무가있음 ]
	//상속받은 출력 기능 show는 a변수만 출력하니 이를 개선
	//Override
	public void show() {
		//System.out.println(a);//error -부모의 private멤버 사용불가
        //First에게 출력을 요청
		//show();//부모의 show()메소드 호출 재귀호출이 됨
		super.show();
		System.out.println("b: "+b);
		System.out.println();
		
	}
}
