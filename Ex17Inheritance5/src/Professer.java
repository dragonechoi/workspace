
public class Professer extends Person {

	private String subject="";
	
	public Professer() {
		//super();
		
	}
	
	public Professer(String name,int age,String subject) {
		super(name ,age );
		this.subject=subject;
		
	}
	
	 @Override
	public void show() {
		// TODO Auto-generated method stub
		super.show();
		System.out.println("subject : "+subject);
	}
	
}
