
public class Second extends Student{

	private String company="";
	
	public Second() {
		super();
		company="non class";
	}
	public Second(String name,int age,String company) {
		super(name,age);
		this.company=company;
	}
	public void show() {
		super.show();
		System.out.println("company: "+company);
	}
	
	
}
