//import java.util.Scanner;
//
//public class Main {
//
//	public static void main(String[]args) {
//		
//		//학생성적관리 프로그램 
//		//이름,국어,영어,평균
//        String name;
//        int kor;
//        int eng;
//        double aver;
//        
//        name="same";
//        kor=80;
//        eng=70;
//        aver=(double)(kor+eng)/2;
//        
//        //만약, 이런 학생이 여러명이라면
//        // 위 변수 4개를 매번 만드는 작업이 매우 번거로움 
//        // 여러개의 데이터를 관리하는 배열객체를 이용해보기 
//        
//        String[]arrName=new String[10];
//        int[]arrKor=new int[10];
//        int[] arrEng=new int[10];
//        double[]arrAver=new double[10];
//        
//        arrName[0]="sam";
//        arrKor[0]=80;
//        arrEng[0]=70;
//        arrAver[0]=(double)(arrKor[0]+arrEng[0])/2;
//        
//        //위처럼 자료형별로 배열객체로 묶어서 사용하는 것도
//        //은근 짜증나고 가독성도 떨어짐.
//        //학생 1명의 데이터가 서로다른 배열객체에 나누어져 있어서
//        
//        //그래서 서로 연관있는 데이터끼리 (이름,국어,영어,평균)묶어서
//        //관리 하는것이 더 효과적임...
//        
//        //연관있는 데이터끼리의 묶음을 설계하는 class정의
//        //별도의 .java문서에 새로운 클래스를 설계해보기
//        
//        //새로 설계한 Student 클래스로 객체를 생성
//        Student stu =new Student();
//        stu.name="sam";
//        stu.kor=80;
//        stu.eng=70;
//        stu.aver=(double)(stu.kor+stu.eng)/2;
//        
//        Student stu2=new Student();
//        stu2.name="robin";
//        stu2.kor=90;
//        stu2.eng=95;
//        stu2.aver=(double)(stu2.kor+stu2.eng)/2;
//        
//        
//        //화면출력
//        System.out.println(stu);//참조변수를 출력하면 자동 .toString()발동[클래스명 @해시코드]
//        System.out.println("name:" + stu.name);
//        System.out.println("kor:"+ stu.kor);
//        System.out.println("eng:"+stu.eng);
//        System.out.println("aver:"+stu.aver);
//        System.out.println();
//	
//	
//        System.out.println("name:" + stu2.name);
//        System.out.println("kor:"+ stu2.kor);
//        System.out.println("eng:"+stu2.eng);
//        System.out.println("aver:"+stu2.aver);
//        System.out.println();
//	
//        //객체의 멤버값을 변경해보기
//        int k=80;
//        stu2.kor=k;
//        System.out.println("변경된 국어성적 : "+stu2.kor);
//        System.out.println();
//        
//        
//        //3번째 학생의 데이터는 키보드로 입력받기
//        
//        Scanner scan=new Scanner(System.in);
//        
//        Student stu3=new Student();
////        stu3.name=scan.next();
////        stu3.kor=scan.nextInt();
////        stu3.eng=scan.nextInt();
//        stu3.aver=(double)(stu3.kor+stu3.eng)/2;
//        
//        //입력이 잘 되었ㅁ는지 확인 멤버값들 출력해보기
//        System.out.println("name"+stu3.name);
//        System.out.println("name"+stu3.kor);
//        //이런식으로 멤버값을 일일이 출력하는 코드를 작성하는거 은근짜증
//        //그래서 객체라는 녀석이 스스로 본인의 멤버값을 출력하는 기능!! 이 있다면
//        //편하게 그 기능을 사용하면 되겠다!!
//        //stu3.출력해(); 이런 기능이있다면
//        
//        
//        //객체가 기능을 가질 수 있도록class 안에 기능 (함수)를 설계하고 사용하기
//        // 객체의 기능을 사용하기-메소드 호출
//        stu3.show();
//        
//        //이런식으로 객체안에 기능을 만들면 편하게 코딩할수있다
//        Student stu4=new Student();
//        stu4.name="hong";
//        stu4.kor=75;
//        stu4.eng= 77;
//        //가만보니 평균 계산하는 것도 직접 매번 작성하기 짜증
//        //그러니 평균을 계산하는 기능이 객체안에 있다면 코드가
//        //더 간결하다
//        stu4.calAverage();
//        //객체의 값출력은 객체의 출력기능을 이용!
//        stu4.show();
//        
//        //이런식으로 특정한 기능들을 미리 class에 설계해놓으면
//        //훨씬 코드가 간결해기 시작함
//        
//        Student stu5=new Student();
//        stu5.name="kim";
//        stu5.kor=80;
//        stu5.eng=75;
//        stu5.calAverage();
//        stu5.show();
//        
//        //6번쨰 학생데이터를 넣을때도 멤버값들을 한줄씩 넣기가
//        //은근짜증남 그러면 입력 기능도 있다면
//        //코드가 더 간결해진다
//        
//        Student stu6=new Student();
//        stu6.setMembers("park",50,60);//이런 기능이 있다면 .
//        stu6.calAverage();
//        stu6.show();
//        
//        //7번째 학생 데이터를 기능을 이용하여 입력하고 출력해보기
//        Student stu7=new Student();
//        stu7.setMembers("lee", 90, 75);
//        stu7.calAverage();
//        stu7.show();
//        
//        //결국 메소드의 존재 이유는 코드보다 간결하게 하고
//        //객체의 멤버는 객체 스스로 제어하도록 하기위함
//        
//        //정리, 객체는 변수+메소드 를 가진 녀석을 지칭함.
//        
//        //메소드만 있는 객체도 있을 수 있음 . (사실많음)
//        
//	}
//}
