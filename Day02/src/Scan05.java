import java.util.Scanner;
public class Scan05 {

	public static void main(String[]args) {
		try (Scanner scan = new Scanner(System.in)){
			System.out.println("정수 두개를 입력해 나눈 후 몫과 나머지 구하기");
			int num1,num2,nmg;
			System.out.print("정수 입력 : ");
		    num1=scan.nextInt();
			
		    System.out.print("정수 입력 :");
		    num2=scan.nextInt();
		    
		    System.out.println("나머지 값 :"+(num1/num2));
		    
		    nmg=(num1/num2)%2;
		    System.out.println("나머지 :"+nmg);
		}
			
		
	}
}
