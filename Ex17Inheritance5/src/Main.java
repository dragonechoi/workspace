
public class Main {

	public static void main(String[]args) {
		
		// 어떤 대학교의 정보제공 앱 제작 - 회원가입 기능
		// 회원의 종류 : 일반,학생,교수,근로학생
		
		//1. 일   반: 이름,나이
		//2. 학   생: 이름,나이 , 전공
		//3. 교   수: 이름,나이 , 연구과제,
		//4. 근로학생: 이름, 나이 ,전공 ,업무
		
		//일반회원
		Person p=new Person("sam",20);
		p.show();
		System.out.println();
		
		//학생회원 
		Student s=new Student("robin",23,"android");
		s.show();
		System.out.println();
		
		Professer pro=new Professer("park",45,"mobile");
		pro.show();
		System.out.println();
		
		AlvaStudent alva=new AlvaStudent("hong",27,"ios","pcmanager");
		alva.show();
		
		
	}
}
