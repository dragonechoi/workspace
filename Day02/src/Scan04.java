import java.util.Scanner; 
public class Scan04 {

	public static void main(String[]args) {
	try(Scanner scan = new Scanner(System.in)){
    System.out.println("두개의 실수를 입력받아 사칙연산 값 구하기");
    double num1,num2;
    
    System.out.print("실수 입력 : ");
    num1=scan.nextDouble();
    
    System.out.print("실수 입력 :");
    num2=scan.nextDouble();
    
    System.out.println("덧셈 결과 : "+(num1+num2));
    System.out.println("뺄샘 결과: "+((num1-num2)));
    System.out.println("곱하기 결과 : "+(num1*num2));
    System.out.println("나누기 결과 : "+(num1/num2));
		
	}
		
	}

}
