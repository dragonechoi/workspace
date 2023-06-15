import java.util.Scanner;
public class Scan02 {

	public static void main(String[] args) {
		try (Scanner scan = new Scanner(System.in)) {
			int num1,num2,num3 ,max;
			 System.out.println("정수를 입력하세요 : ");
			 num1=scan.nextInt();
			 
			 System.out.println("정수를 입력하세요 : ");
			 num2=scan.nextInt();
			 
			 System.out.println("정수를 입력하세요 : ");
			 num3=scan.nextInt();
			 max=num1*num2;
			 System.out.println(num1+"*"+num2+"+"+num3+"="+(max+num3));
		}
     


	}
}
