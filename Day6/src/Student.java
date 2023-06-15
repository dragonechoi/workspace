
public class Student {

	private String name ="";
	private int age;
	
	
	public Student() {
		name="no name";
		age=0;
		
	}
	public Student(String name,int age) {
		this.age=age;
		this.name=name;
	}
	public void show() {
		System.out.println("name: "+name);
		System.out.println("age: "+age);
	}
}
