//import java.io.IOException;
//
//import java.util.Scanner;
//
//public class Main {
//
//	public static void main(String[]args) {
//		
////		키보드 입력 받기
////		int a;
////		
////	  //키보드로 부터 입력된 값을 받아서 리턴 해주는 기능을 가진 객체[System.in]를 이용
////		try {
////		a= System.in.read(); //read는 한문자의 값의 결과만 계산하고 Ascii값만 나옴
////			System.out.println(a);
////			
////			//입력받은 숫자에 50을 더해서 출력해보기
////			a=a-48; //숫자모양의 문자를 숫자로 변환
////			System.out.println("덧샘결과 : "+(a+50));
////			
////			
////			
////		} catch (IOException e) {
////			// TODO Auto-generated catch block
////			e.printStackTrace();
////		}
//		
//		//3자리 숫자 입력 받기
////		int num=0;
////		try {
////			
////		int n;
////		n=System.in.read( );
////		num = num + (n-48)*100;
////		
////		num=System.in.read();
////		num = num + (n-48)*10;
////		
////		num=System.in.read();
////		num = num + (n-48)*1;
////		System.out.println("num : "+ (num+10) );
////		
////		} catch (IOException e) {
////			// TODO Auto-generated catch block
////			e.printStackTrace();
////		}
//		
////Scanner ascii값을 원하는 자료형으로 변환(자료형 별 변환 기능 method) (next intr값을 자료형으로 변환해 return해준다)
//
//		//next(정수,실수,논리값,문자열(띄어 쓰기가 없는 문자열), (nestLine띄어쓰기를 받아들일때 쓰는거)) (char는x)
//		
//		
//		
//		//위처럼 입력 받아서 자료형으로 변화 하는 코드를 직접 작성하는 것은 매우 번거로움.
//		//이 작업을 편히 하기 위해 만들어진 class 가 Scanner 클래스이다.
//		//이 Scanner 클래스를 사용 하려면 객체로 생성하여 사용해야 함.
//	    //Java언어는 모든 객체를 반드시 Heap 메모리영역에 만들어야함.
//		//Heap메모리에 객체를 생성하는 키워드 사용 : new.
//		//Heap메모리의 기능은 이름을 붙힐수없기에 new 참조 변수(리모컨)를 만들어야함
//	  Scanner scan =new Scanner(System.in);
//		
//	  //정수형 숫자 입력
//	  int a;
//	  System.out.println("정수 입력 :");
//	 a=scan.nextInt();
//		System.out.println("a : "+a);
//		
//		//실수형 숫자 입력
//		double b;
//		System.out.println("실수 입력 :");
//		b=scan.nextDouble();
//		System.out.println("b : " +b);
//		
//		//논리값
//		System.out.println("논리값 입력 : ");
//		boolean c=scan.nextBoolean();
//		System.out.println("c : "+c);
//		
//		//문자열 입력
//		System.out.print("문자열 입력 : ");
//		String s=scan.next();//띄어쓰기 없는 문자열 입력[단어입력]
//		System.out.println("s:"+s);
//
//		//띄어쓰기 포함한 문자열 입력
//		System.out.print("문자열 입력 :");
//		String s2=scan.nextLine();//띄어 쓰기 포함 문자열 [문장을 입력 하는 기능] - 이전 입력에 의한 Enter키를 입력으로 받아들임.해결-한번더 한줄 입력받기
//	    s2=scan.nextLine();
//		System.out.println("s2 : "+s2);
//		
//		
//	}
//}
