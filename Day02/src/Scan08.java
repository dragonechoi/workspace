import java.util.Scanner;
public class Scan08 {

	public static void main(String[]args) {
		try(Scanner scan=new Scanner(System.in)) {
			double r;
			System.out.println("반지름을 입력받아 면적 계산");
			
			System.out.println("반지름 입력 : ");
			r=scan.nextDouble();
			
			double total;
			total=3.14*r*r;
			
			System.out.println("결과 : "+total);
			
		}
	}
}
