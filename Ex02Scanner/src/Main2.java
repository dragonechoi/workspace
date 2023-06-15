//import java.util.Scanner;
//
//public class Main2 {
//
//	public static void main(String[]args) {
//		
////		//사용자로부터 2개의 정수를 입력받아 덧셈하는 프로그램
////		Scanner scan=new Scanner(System.in);
////		
////		int a,b;
////		
////		System.out.print("숫자 입력 : ");
////		a=scan.nextInt();
////		
////		System.out.print("숫자 입력 : ");
////	  b=scan.nextInt();
////
////	  int c=a+b;
////	  System.out.println("");
////	  System.out.println(a+"+"+ b + "=" +c);
////	  
//	  
//	  //연산자 - C언어와 동일함.
//	  //새로 추가된 연산자 [비트연산자 : (<<,>>)좌우로 밀기 (>>>-부호 비트까지 밀어버림) <sign bit>]
//	  
//	  
//	  //주소나 메모리 사이즈 보는 연산자 없음.
//	  //System.out.println(&n);//error-주소연산자 없음
//	  //System.out.println(Sizeof(n)); //error 자바에는 없음
//	  
//	  //제어문 -C언어와 동일함.
//	  //조건문 : if,if else,switch,case
//	  //다른점.Switch문에 문자열변수 사용이 가능함 
//	  
//	  //문자열의 비교에 대한 의미파악- 아주중요!!!
//	  //Java의 문자열은 Data 가 아닌 객체이다 Java의 문자열은 자동으로 객체가 된다
//	  //new 라는 키워드를 이용해 똑같은걸 새로이 만들어냄
//	  String s1=new String ("Hello");
//	  String s2=new String("Hello");
//	  System.out.println(s1==s2); //참조형 변수는 비교연산시 값을 비교하는게 아닌 주소끼리 비교
//	  System.out.println(s1.equals(s2));//String 객체의 값비교 가능 함수를 사용 Java에서는 equals대입으로 값비교
//	  //문자열 비교할때 == 절대금지 .equals()무조건
//	  
////	  int x=10;
////	  int y=10;
////	  System.out.println(x==y);
////	  반복문 : while,for,do~while
//	  //무한반복 
//	  while(true) {//ok
//	  }
//	  
//	}
//}
