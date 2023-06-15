
public class Student2 extends Student {

	private String company="";
	private int cm;
	public Student2() {
		super();
	company="no name";
	cm=0;
		
	}
	public Student2(String name,int age,String company,int cm) {
		super(name,age);
		this.cm=cm;
		this.company=company;
	}
	public void show() {
		super.show();
		System.out.println("company :"+company);
		System.out.println("cm :"+cm);
	}
}
