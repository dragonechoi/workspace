
public class FlyRobot extends Robot {

	//이미 ,Hp,이동,공격 기능을 보유한 상태
	
	void fly() {
		System.out.println("오~ 난다!");
	}
	//상속받은 공격 기능 메소드의 기능을 변경
	//메소드 Override
	void attack() {
		System.out.println("미사일 발사!!");	
		}
}
