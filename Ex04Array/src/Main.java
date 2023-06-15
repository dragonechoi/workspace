import java.util.Scanner;
public class Main {

	public static void main(String[]args) {
		
		//Java 언어에서 배열은 객체다.
		
		//int형 3개 짜리 배열 객체 생성
		int[] aaa=new int[3];  // 배열의 요소들은 자동 0에 해당하는 값으로 초기화
		
		System.out.println(aaa);//배열객체의 .tostring()기능이 자동 발동
		System.out.println(aaa[0]);
		System.out.println(aaa[1]);
		System.out.println(aaa[2]);
		//System.out.println(aaa[3]);//error -인덱스 범위를 넘어가면 에러
		
		//배열 요소에 값 대입
		aaa[0]=10;
		aaa[1]=20;
		aaa[2]=30;
		
		//배열객체에게 배열 요소의 개수(길이)를 가진 멤버변수가 존재함.
		int len=aaa.length;
		
		
		//배열 요소 값을 반복문을 이용 하여서 출력해보기
		
		for(int i=0;i<len;i++) {
		System.out.println(aaa[i]);
		
		}
		System.out.println();
		
		//배열객체를 생성 하면서 배열 요소값들을 초기화해보기
		int []bbb=new int[] {10,20,30};//초기화시 int 배열갯수를 명시하면X
		int[] ccc= {100,200,300};//자동으로 new int[] 생략
		System.out.println(ccc[0]);
		System.out.println(ccc[1]);     //배열을 초기화 하여 만드는 기본적인 문법
		System.out.println(ccc[2]);
		
		//배열생성할떄 개수 지정을 상수가 아니라변수로 지정할 수 있음.
		int n=30;
		
		//배열 개수 n의 값을 키보드로 입력받을 수도 있겠군요.
		Scanner scan=new Scanner(System.in);
//		System.out.print("배열 갯수 입력 : ");
//		n =scan.nextInt();
		
		
		int []ddd=new int[n];
		for(int i=0;i<ddd.length;i++) {
			System.out.print(ddd[i]+",");
			
		}
		System.out.println();
		
		//배열 객체의 초기화 할떄 도 변수로 값 지정 가능함
		int k=10;
		int []eee=new int[] {k,k+1,k+2};//변수 입력과 연산도 가능
		
		for(int i=0; i<eee.length ;i++) {
			System.out.println(eee[i]+",");
		}
System.out.println();

//배열 요소의 개수가 0개 짜리인 배열 갲체도 존재할 수 있음.

int [] fff = new int[0];
System.out.println("배열길이 :"+fff.length);
		System.out.println();
		
		
		//배열참조변수 끼리의 대입
		
		double [] ggg=new double[] {3.14 ,2.48 ,7.23};
		
		double []hhh=ggg; //객체 대입이 아니라 주소값 복사 - 하나의 객체를 공유
		
		for(int i=0;i<ggg.length;i++) {
			System.out.print(ggg[i]+",");
		}
		
		System.out.println();
		
		for(int i=0;i<hhh.length;i++) {
			System.out.print(hhh[i]+",");
		}
		System.out.println();
		
		//공유된 객체를 참조하는 참조변수 중 하나를 이용하여 요소값 변경하면 다른 참조변수의 값도 영향을 받음.
		hhh[1]=6.49;
		System.out.println(hhh[1]);
		
		//배열 객체를 copy 해보기[배열요소값들을 복사하기]
		int[]mmm=new int[] {50,60,70};
	    int[]nnn=new int[mmm.length];//mmm배열과 같은 개수의 값이 0인 배열객체를 생성
	    
	    for(int i=0;i<nnn.length;i++) {
	    	nnn[i]=mmm[i];
	    }
	    
	    //mmm과 nnn이 참조하는 배열객체는 서로 다른 객체임
	    //배열은 참조변수만 여러개 보유
		System.out.println("---------------------------------");
		System.out.println();
		System.out.println();
		
		//참조형 자료의 배열객체 생성해보기
		
		String[] sss=new String[3];//String 참조변수 3개짜리 배열 객체를 생성
		System.out.println(sss);//저동.tostring()기능 발동
        System.out.println(sss[0]); //참조형 변수의 초기값은 null입니다.
        System.out.println(sss[1]);
        System.out.println(sss[2]);
		
        //배열객체의 요소들(참조변수)들에 값 대입
        sss[0]=("sam");
        sss[1]=("robin");
        sss[2]= ("hong"); //자동 new String
        
        System.out.println(sss[0]);
        System.out.println(sss[1]);
        System.out.println(sss[2]);
        System.out.println();
        
        //각 배열 요소 (String참조변수)의 기능 메소드 사용해보기
        System.out.println("배열의 길이 : "+sss.length);
		System.out.println( sss[0].length());
		System.out.println( sss[1].length());
		System.out.println( sss[2].length());
		System.out.println();
		
		char ch=sss[1].charAt(2);
	    System.out.println(ch);
	
	ch = sss[2].charAt(3);
	System.out.println(ch);
	
	// 참조형 배열객체 생성하면서 배열요소들 초기화 해보기
	int[] xxx= new int[] {10,20,30};
	String[]uuu=new String[] {new String("android"),new String("ios"),new String("web")};
	uuu=new String[] {"android","ios","web"}; //new String() 축약표현
	String[] ttt ={"android","ios","web"};// 배열 참조변수 초기화 하면서 배열객체 초기화할떄는 축약표현 가능함
	
	for(int i= 0 ; i<ttt.length;i++) {
		System.out.println(ttt[i]);
	}
	System.out.println();
	
	//개발자가 만든 class도 배열로 만들수 있음.
	Person p=new Person();
	p.name="sam";
	p.age=20;
	p.show();
	
	Person[]people=new Person[3];
	people[0]=new Person();
	people[1]=new Person();
	people[2]=new Person();
	
	people[0].show();
	people[1].show();
	people[2].show();
	System.out.println();
	
	//배열처럼 여러개의 요소를 가진 객체의 요소제어를 위한 반복문을 쉽게사용하기 위해 등장한 새로운 for문법
	//확장된 for문 [for each문 이라고도 부름]
	
	int[]nums=new int [] {10,20,30};
	
	//반복문 이용하여 요소값들 출력
	
	for(int i=0;i<nums.length;i++){
		int t=nums[i]; //임시 보관소
		
		System.out.println(t);
	}
	System.out.println();
	//확장된 for 문법으로 배열의 요소값을 간결하게 출력 해보기
	for(int t : nums ) {//정순부터 끝까지만 반복가능
		System.out.println(t);
	}
	System.out.println();
	
	double[]www=new double[] {3.14,2.56,8,79};
	for (double t : www) {
		System.out.println(t);
	}
	System.out.println();
	
	String[]rrr=new String[] {new String("aaa"),"android","react"};
	
	for(String t : rrr) {
	System.out.println( t  + ":" +t.length() );
	
	}
	System.out.println(  );
	
	
	
	
	
	}
}


//사용자 정의 class
class Person{
	String name;
	int age;
	
	void show() {
		System.out.println(name+":"+age);
	}
}
