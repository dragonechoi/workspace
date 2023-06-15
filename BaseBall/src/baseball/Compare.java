package baseball;

import java.util.List;

public class Compare {

	public int howmany(List<Integer> computer, List<Integer>palers) {
		int result =0;
		List<Integer> player = null;
		for(int i=0;i<player.size();i++) {
			if(computer.contains(player.get(i))) {
				result+=1;
			}
		}
		return result;
	}
	public int counStrike(List<Integer>computer,List<Integer>) {
		int strike =0;
	}
}
