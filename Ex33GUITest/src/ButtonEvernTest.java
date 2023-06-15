import java.awt.FlowLayout;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class ButtonEvernTest extends JFrame {

	public ButtonEvernTest() {
		setSize(400,450);
		setTitle("버튼 클릭 이벤트 시작");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocation(800,50);
		
		//간단하게 옆으로 배치되도록. 배치관리자 변경
		setLayout(new FlowLayout());
		
		// 버튼을 클릭하여 Label의 글씨를 변경해보기
		
		//Button , Label 컴포넌트 하나씩 배치
		JButton btn=new JButton("Button");
		JLabel label=new JLabel("Hello world");
		
		//프레임에 붙히기
		
		add(btn);
		add(label);
		
		//버튼(btn)이 클릭되는 것을 듣는 리스너객체 생성 및 버튼에 달기
		//리스너객체를 생성
		ActionListener lisstener =new ActionListener();//인터페이스는 곧바로 객체 생성불가
		
		//버튼에 리스너를 붙히기
		btn.addActionListener(null);
		
		
		setVisible(true);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		new ButtonEvernTest();
			
		

	}

}
