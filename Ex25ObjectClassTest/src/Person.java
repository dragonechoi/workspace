
public class Person {
	
	private String name;
	private int age;
	private String adress;
	
	
	//멤버변수 하나하나의 값을 별도로 설정하는 기능메소드들 필요
	//setter method 라고부름 - 가급적 만들어놓을 것을 권장 (무조건적으로 권장)
	public void setName(String name) {
		this.name=name;
	}
	
	public void setAge(int age) {
		this.age=age;
	}
	
	public void setAdress(String adress) {
		this.adress = adress;
	}
	
	//멤버변수 하나하나의 값을 리턴해주는 기능메소드들
	public String getName(String name) {
		return this.name=name;
	}
	public int getAge(int age) {
		return this.age=age;	
	}
	
	public String getAdress() {
		return adress;
	}
	
	
	//생성자 : 객체가 생성(new) 될떄 자동으로 발동하는 특별한 메소드
	public  Person() {
		System.out.println("Person 객체 생성자");
	}
	
	//생성자메소드 오버로딩
	public Person(String name,int age ,String adress) {
		this.name=name;
		this.age=age;
		this.adress=adress;
		System.out.println("Persond객체 생성자2");
	}

	
	

}
