
public class Main {

	public static void main(String[] args) {
		
		//지역변수에 final을 붙히면 상수화된 변수
		final int a=10;
		//a=20; //error :a의 값 변경불가!
		
		//자바의 특이한점.
		final int b;
		b=50; //처음 값을 대입할때 상수화 됨 - 권장하지 않음
		//b=20;//error
		
		//멤버변수에 final 당연가능
		
		System.out.println(Test.COUNT);
        //Test.COUNT=20; error 값 변경 불가
		
		//final 을 멧드에서 적용가능 - 오버라이드 금지
		
		//class에도 final 키워드 적용가능 - 상속이 불가능한 클래스
		
	}

}
