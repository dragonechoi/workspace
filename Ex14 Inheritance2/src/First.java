
public class First {
   //접근제한자 적용
	private int a;
	
	//멤버값 출력하는기능
	public void showFirst() {
		System.out.println("a: "+a);
		
	}
	//객체를 생성(new)할때 자동으로 발동하는 특별한 메소드-생성자 메소드
	public First() {
		System.out.println("First 객체가 생성");
	}
	
	public First(int a) {
		this.a=a;
		System.out.println("First 객체 생성");
	}
}
