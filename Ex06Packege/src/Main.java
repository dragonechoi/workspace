//bbb 패키지 안에있는 Student 클래스를 편하게 사용하도록 미리 불러오기
//import bbb.Student;
//import bbb.Nice;
//import bbb.Good;

//bbb 패키지 안에 있는 모든 클래스들 한번에 import 하기
import bbb.*;



//import aaa.Student;//error

import java.util.Random;

public class Main {

	public static void main(String[] args) {
	
		//기본적인 class를 설계하고 객체를 생성하여 사용하는 모습
		Test t=new Test();
		t.a=10;   //멤버 변수 호출
		t.show(); //멤버 함수 호출
		
		
		//같은 이름의 class를 사용하게 되는 문제가 발생할 수도 있음 
		//이때 사용 하는 것이 package 라는 개념
		//물리적인 폴더 구분을 통해 같은 이름의 class를 구별 
		
		//사용자 저의 클래스로 Student 객체를 생성 해보기 
		//즉 ,학생의 정보 [이름 ,나이,주소] 를 가진 클래스 
		
		aaa.Student stu=new aaa.Student();
		
		stu.name="sam";
		
		
		// 또다른 학생에 대한 정보가 필요할수 있음 
		//[이름,국어,영어] 데이터를 가진 클래스

		bbb.Student stu2=new bbb.Student();
		stu2.name= "robin";
		stu2.kor=80;
		stu2.eng=90;
		
		//bbb패키지의 Student클래스 객체가 또 필요하다면?
		//패키지 명을 매번 작성하는 것이 은근 짜증...
		//그래서 이 .java 문서 안에서는 bbb.패키지를 마음대로 
		//인식 할수 있도록 미 클래스를 가져오기 import
		Student stu3=new Student ();
		Student stu4=new Student ();
        //2000여개의 java System API 클래스들은 모두 패키지가 있음.
		
	   java.util.Random rnd=new java.util.Random();
	   //즉 , Random클래스 앞에 쓴느 java.util.이 패키지명 이였던 것임.
	   //java.util 패키ㅣ명쓰는 것이 번거로워 보여서 import 했던것임
	   Random rnd2=new Random();
	   
	   java.util.Scanner sca =new java.util.Scanner(System.in);
	   
	   //패키지 중에서 특별한 패키지 하나가 존재함.
	  //String .System ....이런 클래스들이 있는 java.lang클래스
	   //원래는 패키지명을 같이 써야 하기에 아래처럼 써야하지만
	   
	  java.lang. String s= new java.lang.String("Hello");
	  //java.lang은 워낙 기본적인 클래스들만 있어서 자바언어에서 자동 import합니다
	   String s2=new String ("nice");
		
		
	   aaa.Person p =new aaa.Person();
	   
	  bbb.Nice n;
	  bbb.Nice n2;
	  //가만 보니 .java System API클래스들의 패키지명이 모두 
	  //XXX.XXX라는 식으로 두 단어 이상으로 구성됨
	  //패키지명을 가급적 유의미한 단어 (마치 카테고리 같은 )를 사용 하고
	  //두단어 이상으로 사용하기를 권장함.
	  // 보통은 클래스를 만든 회사명의 도메인을 역으로 사용(작성)함.
	  //예를 들어 .. 지도 클래스.. Map클래스 
	  //이를 만드는 회사가 3개... Google,naver,kakao
	  //com.google.Map
	  //com.naver.Map
	  //com.kakao.Map
	  
	  // kr.or.mrhi.android.map
	  // 이때 패키지명은 반드시 소문자로만 작성할것 강제로 권장.(헷갈리지 않기 위해)
	  //여러 단어를 구분할 때 사용하는 .은 하위 폴더임을 의미
	  mrhi.dev.Frist f=new mrhi.dev.Frist();
	  mrhi.dev.android.Second ss=new mrhi.dev.android.Second();
	System.out.print ("aaa");		  
	}
}
