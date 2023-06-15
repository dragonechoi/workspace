package baseball;
import java.util.Random;
import java.util.List;
import java.util.ArrayList;

public class Main {

	public int random() {
		Random rnd=new Random();
		return rnd.nextInt(9)+1;
		
		
	}
	public List<Integer> create(){
		List<Integer> computerNumber=new ArrayList<>();
		while (computerNumber.size()<3) {
			int randomNumber=random();
			if(computerNumber.contains(randomNumber)) {
				continue;
				
			}else{
				computerNumber.add(randomNumber);
			}
		}
		return computerNumber;
	}
}
