import java.util.Scanner;
public class Scan06 {

	public static void main(String[]args) {
		try (Scanner scan=new Scanner(System.in)){
			System.out.println("세 정수를 입력해 연산결과 출력");
			
			int num1 , num2 , num3;
			System.out.println("정수 입력 : ");
			num1=scan.nextInt();
			
			System.out.println("정수 입력 : ");
			num2=scan.nextInt();
			
			System.out.println("정수 입력 : ");
			num3=scan.nextInt();
			
		   System.out.println("결과 : "+((num1-num2))*((num2+num3))*((num3-num1)));
		}
	}
}
