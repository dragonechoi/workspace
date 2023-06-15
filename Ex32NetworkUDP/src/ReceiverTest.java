import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class ReceiverTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//1. DatagramPacket을 받을 우체통 준비
		try {
			DatagramSocket socket=new DatagramSocket(10003);// 받는 우체통은 port번호 필수
			
			//2.받은 우편물의 내용(데이터)를 담을수 있는 빈 박스(DatagramPacket)준비하기
			//빈 박스로 만들기
			byte[ ]buf=new byte[1024];//빈상자 객체를 생성한후
			DatagramPacket packet=new DatagramPacket(buf, buf.length); //데이터 팩킷에 대입
			
			//3. 우체통에 택배가 올떄까지 기다리기
			System.out.println("메세지를 기다립니다...");
			socket.receive(packet); //메세지를 받아서 packet안에 buf라는 배열안에 넣어줌. 메세지를 받을떄까지 여기서 커서가 대기함.
			
			
			//byte[] buf에 담긴 데이터를 문자열로 변환하여 화면에 출력 
			String msg=new String(buf);
			System.out.println("받은 메세지는 : " +msg);
			
			
		} catch (IOException e) {
			
		}
		
		
	}

}
