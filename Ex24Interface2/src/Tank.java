
public class Tank implements Unit ,LevelUpAble{

	@Override
	public void move() {
		// TODO Auto-generated method stub
		System.out.println("전차 이동");
	}
	@Override
	public void attack() {
		// TODO Auto-generated method stub
		System.out.println("포격 개시");
	}
	@Override
	public void levelup() {
		// TODO Auto-generated method stub
		System.out.println("전차 강화");
	}
}
