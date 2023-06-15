//
//public class Ex01Print {
//public static void main(String[] args){
//	
//   //출력 기능 (함수 ->method)을 가진 객체에게 출력을 요청!
//	System.out.print("Hello");
//	System.out.print("Nice\n");
//	
//	System.out.print(10);
//	System.out.print("\n");
//    
//	System.out.print(3.14);
//    System.out.print("\n");
//   
//    System.out.print('G');
//    System.out.print("\n");
//
//    System.out.print(true);
//    System.out.print("\n");
//    //println 자동 줄 바꿈 출력 기능
//    
//    System.out.println(10+3);
//    System.out.println("10+3");
//    
//    
//    //c언어 처럼 서식문자를 이용하여 출력 모양을 만들수도 있다.
//    System.out.printf("%2d + %2d = %2d\n",5,10,5+10);
//    
//    //덧샘연산에 대한 특이점
//    System.out.println(5+3); //+:산술 연산자
//    System.out.println(10+3.14);//int+double[작은걸-> 큰것으로 자동 형면환]
//    System.out.println('G'+1);//한문자+1;
//    
//    //문자열 데이터의 덧셈연산.[문자열 붙히기]
//    System.out.println("aaa"+"bbb");// +:산술 연산x 결합연산O
//    System.out.println("hello"+" world");
//   
//    //문자열 + 다른자료형[문자열 결합]
//    System.out.println("aaa"+10); //"aaa"+"10"
//    System.out.println("bbb"+3.14);
//    System.out.println("aaa"+10+"bbb"+3.14);
//    
//    //Java 는 출력 형식을 만들때 printf보다는 문자열의 결합 + 결합연산으로 처리하는 경우가 많음.
//    System.out.println(5 + "+" + 3+"="+5+3);
//    System.out.println(5 + "+" + 3+"="+(5+3));
//    
//    System.out.println();
//    System.out.println();
//    
//    
//    //자료형(Data Type) 과 변수(Variable)
//    // 자료형의 2가지 종류
//    // 1)primitive(원시)자료형-boolean,byte,char,short,int,long,float,double
//    //2)reference(참조) 자료형-String,Scanner,Random...등 [Class로 만든 자료형]
//    
//    //변수를 만드는 문법이 있다-자료형 변수명;
//    int a=10;
//    //출력 기능을 가진 객체 에게 출력을 요청
//    System.out.println(a);
//    
//    //C언어와 다르게 값을 대입할때 주의점. 
//    int b;
//  //b=3.14;//error : 자료형이 큰것을 작은 변수에 대입할수 없다.
//    
//    //자료형별로 담을 수 있는 값의 크기가 제한됨
//    byte c=127;//~128~127
//    System.out.println(c);
//   //c=128; //error -범위를 넘어간 숫자는 에러 
//   
//    short d =32767;//양수와 음수 : 각 32768개씩 가능
//    System.out.println(d);
//    
//    int e=2100000000;//양수와/음수 : 각 21억 까지 가능
//    System.out.println(e);
//    
//    long f;//양수/음수 : 900경
//    f=230000000000000L;//정수형 상수를 Long으로 만드는 L키워드가 접미어로 있어야 함.
//    System.out.println(f);
//    
//    float g;//error - 실수형 상순느 기본으로 double형.
//    g=3.14f;//실수형 상수를 float으로 만드는 f 키워드가 접미어로 있어야함.
//    System.out.println(g);
//    
//    double h=3.14;
//    System.out.println(h);
//
//    char i='G';
//    System.out.println(i);
//   i=65; 
//    System.out.println(i);
//   
//    boolean j=true;
//    System.out.println(j);
//    j=5<3;
//    System.out.println(j);
//
//   //작은 값은 큰 변수에 대입이 가능함. [자동 형변환]
//    double k=10;
//    System.out.println(k);
//    
//    //long m=3.14f;//error - 무조건 실수가 정수보다 자료형!
////Long +float 연산하면 .. Long을 float으로 변환하여 연산함
//    System.out.println(100L+3.14f);
//    
//
//    //byte. short은 별도의 접미어 없이도 int형 상수값을 대입가능함
//    byte n=10;
//    short r=100;
//    
//    
//    //byte나 short 변수끼리의 연산은 자동 int로 변환되어 계산됨 
//   short x=10;
//    short y=50;
//   short t;
// //t= (x+y);/error
//   t=(short)(x+y);
//    t=10+50;
//    System.out.println(t);
//    
//    
//    System.out.println();
//    System.out.println();
//    //자바의 상수 - 2가지 종류
//    //1)literal 상수-값 자체를 의미 : [10,3.14,'G',"aaa",true]
//    //2)final 상수- 상수화된 변수 
//    
//    final int z=10; //final 상수 [상수의 이름은 대문자로만 .. 스네이크 표기법 권장]
//  // z=20;//error - 상수는 값 변경 불가
//    
////    final int USER_MAX=3;
//    
//    
//    //참조형에 대한 맛보기
//    String s;
//    s=new String("Hello");
//    System.out.println(s.toString());
//    
//    s=new String("Nice");
//    System.out.println(s); //자동 .toString()해줌
//    
//    s="Android";//자동 new String (android);
//    System.out.println(s);
//    
//    char u;
//    u='한';
//    
//    System.out.println(u);
//    
//    
//    
//    
//    
//    
//    
//}
//
//
//}
