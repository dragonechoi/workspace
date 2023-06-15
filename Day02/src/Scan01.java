import java.util.Scanner;
public class Scan01 {

	public static void main(String[] args) {
		System.out.println("정수를 입력해 뺼샘과 곱샘결과 확인");
		try (Scanner scan = new Scanner(System.in)) {
			int a ,b;
			System.out.print("정수 입력 : ");
			a=scan .nextInt();
			System.out.print("정수 입력 : ");
			b=scan .nextInt();
			
			
			System.out.println("결과  : "+(a*b));
			
			System.out.println("결과  : "+(a-b));
		}
		
	} 

		
	}

