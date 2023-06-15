import java.util.Scanner;
@SuppressWarnings("resource")
public abstract class Day01Ex {

	public abstract void main(String[]args);{
		Scanner scan=new Scanner(System.in);
		System.out.println("정수를 입력해 값을 구하시오");
		int num1,num2,num3;
		
		System.out.print("정수 입력 :");
		num1=scan.nextInt();
		
		System.out.print("정수 입력 :");
		num2=scan.nextInt();
		
		System.out.print("정수 입력 :");
		num3=scan.nextInt();
	
	
		System.out.printf(" %d * %d + %d =%d",num1,num2,num3,(num1*num2)+num3);
			
	
	}
}
