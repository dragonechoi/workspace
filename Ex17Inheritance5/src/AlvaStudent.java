
public class AlvaStudent extends Student {

	private String task="";
	
	public AlvaStudent() {
		// TODO Auto-generated constructor stub
	}

	public AlvaStudent(String name, int age, String major,String task) {
		super(name, age, major);
		// TODO Auto-generated constructor stub
		this.task=task;
		
	}
@Override
public void show() {
	// TODO Auto-generated method stub
	super.show();
	System.out.println("task : "+task);
}
}
