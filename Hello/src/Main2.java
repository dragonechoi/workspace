
import java.util.Scanner;
public class Main2 {
	

	

	 

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			while(true) {
				
				Scanner scan=new Scanner(System.in);
				System.out.println("입력값 :");
				String input;
				input=scan.nextLine();
				String input2=input.toLowerCase();
				
				for(int i=0;i<input2.length();i++) {//받을 입력값객체 생성 후 함수 선언을 통해
					int result=input2.charAt(i); //반복문을 사용해 
					if('a'<=input.charAt(i)&&'z'>=input.charAt(i)) {
						System.out.println("개인정보가 일치하지 않습니다.");
						break;
					
					}
					

				}
			//입력한 값이 범위 내에 있는지 검사 하기 위해 if문을 사용함
				//입력 값이 범위 내를 초과하면 다음걸로 넘어가 또 다른 값인지 for문으로 돌아가 재확인
				//입력한 값의 과정중 입력해야하는 주민등록 번호의 수를 초과하는지 안하는지
				//검사후 밑에 있는 신용카드 로직값을 대조해 재검사 하게끔 작성
				if(input.length()==13||input.length()==14) {
					int result=0;
					int calc=2;
					for(int j=0;j<input2.length()-1;j++) {
						
						//ASCII코드 값으로 변환하여 코드번호 문자 0 에서 9 까지 코드번호를 넘기지 못하게 제한
						if(input.charAt(j)>='0'&& input.charAt(j)<='9'){
							result+=((input.charAt(j)-'0')*calc);
							calc++;
							if(calc>9) {
								calc=2;
							}
							
						}
					}
					//값을 받아낸후 함수 선언해 값을 초기화 한후
					//받은값을 연산하여 마지막 번호에서 그 값이 유효한 값인지
					//연산을 통해 검사
					int sum=0;
					
					sum=result%11;
					sum=11-sum;
			        sum=sum%10;
					
					if(sum==input.charAt(input.length()-1)-'0'){
						System.out.println("주민번호 입니다.");
					}
					
					
				}
				else if(input.length()==19) {
					//"-" " "하이픈과 공백 문자를사용 가능하게 if문을 사용해 검사
					if(input.charAt(4)=='-'||input.charAt(4)==' ') { 
						
						if(input.charAt(9)=='-'||input.charAt(9)==' ') {
							if(input.charAt(14)=='-'||input.charAt(14)==' ') {
								System.out.println("카드번호 입니다.");
							}
						}
					}
				} 
				//검사한 카드번호 유효성을 표출
					else if (input.length()==16) {
						System.out.println("카드번호 입니다.");
					}
				
				else{
					System.out.println("개인정보가 아닙니다.");
				}
			}
	}

}
