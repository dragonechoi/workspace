
public class Main {

	public static void main (String[]args) {
		
		//메소드가 왜 필요한지에 대해 알아봤으니 
		//클래스의 메소드를정의 하는 4가지의 문법적 모습 [리턴타입 ox,파라미터 ox]
	  
		Test t =new Test();
	  
		t.aaa();//1)
	 
		t.bbb(50);//2)
	 
		int k= t.ccc();//3)--함수의 리턴값은 대입 연산자로 받아야만 함,
	    System.out.println("k:"+k);
	   

		int n=t.ddd(5, 3);//4)
    	System.out.println("n : "+n);
    	////////////////////////////////////
    	
    	System.out.println();
	  
    	//사칙 연산을 해주는 계산기 객체 생성 (기능만 [메소드]있는 클래스)
    	Calculator cal=new Calculator();
    	
    	int a=10;
    	int b=5;
    	
    	int sum=cal.sum(a, b);
    	System.out.println(sum);
    	
    	int sub=cal.subtract(a,b);
    	System.out.println(sub);
    	
    	int mul=cal.multiply(a, b);
    	System.out.println(mul);
    	
    	int div=cal.divide(a, b);
    	System.out.println(div);
    	
    	//실수형 숫자들의 사칙연산 의뢰...
    	double c=3.5;
    	double d=4.6;
    	
    	double sum2=cal.sum(c, d);
    	System.out.println(sum2);
    	System.out.println(cal.subtract(c, d));
    	System.out.println(cal.multiply(c, d));
    	System.out.println(cal.divide(c, d));
    	
    	//이런식으로 같은 기능인데 자료형이 다를때 활용하는 문법 -오버로딩
    	
    	//좀더 확장하면 GUI환경에서는 모든데이터가 문자열 타입임/
    	//문자열로 숫자 데이터가 입력되어도 산술된 결과가 나오도록
    	System.out.println(cal.sum("245", "487"));
    	
    	
    	System.out.println();
    	
    	//가변인자 ...연산자
    	
    	//메소드를 호출할떄 파라미터의 개수가 가변적으로 사용되는 경우
    	cal.add();
    	cal.add(2);
    	cal.add(2,3);
    	cal.add(2,3,4);
    	cal.add(2,3,4,5);
    	cal.add(2,3,4,5,6);
    	
    	
    	
    	
 
    	
	}
	
	
	
}
