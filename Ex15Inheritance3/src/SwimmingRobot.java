
public class SwimmingRobot extends Robot{

	//이미 hp 이동 공격 기능을 보유한 상태
	
	//새로운 기능만 추가
	void SwimmRobot() {
		System.out.println("음파~~ 음파~~");
	}
	
	
	//상속 받은 기능 변경
	//Override
	void attack() {
		System.out.println("어뢰 발사~~!");
	}
}
