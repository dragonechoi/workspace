//
//  import java.util.Random; import java.util.Scanner; public class Main3 {
//  
//  public static void main(String[]args) { //랜덤한 값을 만들어 내는 능력(기능)을 가진 class :
//  Random Random rnd=new Random();
//  
//  //랜덤한 정수값 얻어오기 int a; a=rnd.nextInt(); System.out.println("a : "+a);
//  
//  //0~9 10개의 숫자 중에 하나가 랜덤하게 나오도록 ... int b; b=rnd.nextInt(10);
//  System.out.println("b:"+b);
//  
//  //0~99 int c; c=rnd.nextInt(100); System.out.println("c : "+c);
//  
//  //5~15 int d=rnd.nextInt(11) + 5; System.out.println("d:"+d);
//  
//  //-5~5 int e=rnd.nextInt(11)-5; System.err.println("e:"+e);
//  
//  //실수형 랜덤값 얻어오기 double f=rnd.nextDouble(); System.out.println("f : "+f);
//  
//  //0.0~9.999 double g=rnd.nextDouble()*10; System.out.println("g:"+g);
//  
//  //0.0~14.9999 double h=rnd.nextDouble()*15; System.out.println("h:"+h);
//  
//  System.out.println();
//  
//  //논리값 랜덤 boolean i=rnd.nextBoolean(); System.out.println("i:"+i);
//  
//  if(i)System.out.println("GOOD"); else System.out.println("BAD");
//  
//  System.out.println("==========================="); System.out.println();
//  
//  //컴퓨터가 생성한 랜덤한 숫자를 맞추는 게임 만들기
//  
//  
//  // 컴퓨터가 생성한 숫자를 저장 할 변수 int com=rnd.nextInt(501)+500;//범위 : 500~1000
//  
//  System.out.println("500부터 1000사이의 숫자를 맞춰보세요. "); System.out.println(); //키보드
//  입력을 편하게 받아주는 객체 생성 Scanner scan=new Scanner(System.in);
// 
//  //사용자 입력을 정답 맞출떄까지 반복해야 하기에.. while(true) { int user;//사용자가 입력한 숫자를 저장할 변수
//  System.out.print("숫자 입력 :"); user=scan.nextInt();
//  
//  //정답값(com변수)과 입력된 값 (user변수)를 비교 if(user<com) {
//  System.out.println(user+"보다큽니다"); }else if(user<com) {
//  System.out.println(user+"보다 작습니다"); }else {
//  System.out.println("축하합니다.\n정답입니다."); }
//  
// 
// }
//  
//  
//  
// } }
//  
//  
// /