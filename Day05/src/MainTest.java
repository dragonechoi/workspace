
public class MainTest {

	public static void main(String[]args) {
		Main main1=new Main();
		Main main2=new Main();
		Main main3=new Main();
		
		main1.setName("mark6");
		main1.setHeight(180);
		
		main2.setName("mark16");
		main2.setHeight(220);
		
		main3.setName("mark38");
		main3.setHeight(200);
		
		System.out.println(main1.getName()+ ":" +main1.getHeight());
		System.out.println(main2.getName()+ ":" +main2.getHeight());
		System.out.println(main3.getName()+ ":" +main3.getHeight());
	
	}
}
