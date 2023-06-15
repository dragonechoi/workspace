
public class Student extends Person {
    //이미 name,age를 보유한 상태
	
	private String major; //전공
	
	public Student() {
		super();
		major="";
	}
	
	public Student(String name , int age ,String major) {
		super(name,age);
		this.major=major;
		
	}
	//상속 받은 기능 show()는 name,age만 출력함
	//그래서 기능을 개선 - Override
	public void show() {
		super.show();
		System.out.println("major : "+major);
	}
	}
