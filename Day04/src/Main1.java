import java.util.Scanner;
public class Main1 {

	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		
 int[]num=new int[5];
		int max=0,min=0,total=0;
		
		for(int i=0;i<5;i++) {
			System.out.println("정수입력:");
			
			num[i]=sc.nextInt();
			total=total+num[i];
			
			max=num[0];
			if(max<num[i]) {
				max=num[i];
				
			}
			
		}min=num[0];
		for(int j=0;j<min;j++) {
			if(min>num[j]) {
				min = num[j];
			}
		}System.out.println("최대값:"+max);
		System.out.println("최소값:"+min);
		System.out.println("총합:"+total);
		
		
		
	}
}
