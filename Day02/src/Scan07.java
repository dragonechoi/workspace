import java.util.Scanner;
public class Scan07 {

	public static void main(String[]args) {
		try(Scanner scan = new Scanner(System.in)){
			System.out.println("마일을 키로미터로 변환하는 프로그램 1마일은 1.609km이다\n");
		    int mil;
		    double km=1.609;
		    System.out.printf("정수 입력 :");
		    mil=scan.nextInt();
		    
		    km=mil*1.609;
		    System.out.println(mil+"은"+km+"입니다");
		}
	}
}
