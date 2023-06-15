import java.util.Random;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//동물캐릭터 3종류 [Dog,Cat,Pig]를 만들어내는 기능을 가진 
		//애니멀공장 객체를 생성해보기
		
		AnimalFactory af=new AnimalFactory();
		
		Dog d=(Dog)af.makeAnimal(1);
		d.say();//오버라이드된 기능
		d.guardhouse();
		System.out.println();
		
		Cat c=(Cat)af.makeAnimal(2);
		c.say();
		c.handleButler();
		System.out.println();
		
		Pig p=(Pig)af.makeAnimal(3);
		p.say();
		p.eatAndEat();
		System.out.println();
	
		//Animal 참조변수 1개로 여러객체 제어하기도 가능 나중에 배열로 적용
		Animal ani=null;
		ani=af.makeAnimal(1);
		ani.say();
		//자식객체의 고유기능을 사용불가
		//error ani.guardHouse 
		//자식객체의 고유기능을 사용하려면 down casting 해야만함
		Dog dog=(Dog)ani;
		dog.guardhouse();
		
		ani=af.makeAnimal(2);
		ani.say();
		((Cat )ani).handleButler();
		
		ani=af.makeAnimal(3);
		ani.say();
		((Pig)ani).eatAndEat();
		System.out.println();
		
		//마지막 응용
		
		//동물캐릭터 5마리를 랜덤하게 만들어서 공룡기능과 고유기능을 사용해보기
		
		//랜덤값을 만들어 내는 능력을 가진 객체 생성 
		Random rnd=new Random();
		
		//동물참조변수 5개를 가진 배열만들기
		
		Animal[] anis=new Animal[5];
		for(int i=0 ;i<anis.length;i++) {
			int n=rnd.nextInt(3+1);//1.2.3중에 하나값
			
			anis[i]=af.makeAnimal(n);
		}
		
		//각 객체들의 기능 호출
		for(int i =0; i <anis.length;i++) {
			//동물들의 공통기능
			//anis[i].say(); //오버 라이드된 메소드 발동
			
			//anis[i] 참조변수가 어떤 클래스의 객체인지 부터알아야
			//다운캐스팅을 하고 고유 기능을 사용할수있음
			// 참조변수가 어떤 클래스이 객체를 참조하고 있는지 알려주는 연산자 :instanceof
			System.out.println();
			if(anis[i] instanceof Dog) {
			 Dog ddd=(Dog)anis[i];
			 ddd.guardhouse();
				
			
			}
			else if (anis[i] instanceof Cat) {
				((Cat)anis[i]).handleButler();
			}
			else if (anis[i] instanceof Pig) {
				((Pig)anis[i]).eatAndEat();
			}
				
			
		}
		//Animal 클래스는 객체생성용이 아니라 오로지 상속을 위해 서만 존재하는
		//추상적인 개냠의 클래스임 즉 객체를 만들면 안되는 클래스임.
		//하지만 그냥 class로 만들어 버리면 시룻로 객체를 생성시키는 오류를 범활수있음
		//그래서 이렇게 객체를 생성하지 못하도록 설계한 클래스를 실수로 new 하지못하도록 
		// 문법적으로 막는 문법이 등장함. : 추상클래스 - a
		
	//	Animal animal=new Animal(); //error
		//animal.say();
		//추상 클래스에 대한 문법적학습을위해 다음
		
	}

}
