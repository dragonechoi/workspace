import java.util.Scanner;
public class Scan03 {

	public static void main(String[]args) {
		try (Scanner scan = new Scanner(System.in)) {
			int num;
			System.out.println("정수를 입력해 제곱값 확인");
			System.out.println("정수 입력 :");
			num=scan.nextInt();
			num=num*num;
   System.out.println("결과 : "+num);
		}
	}
}
