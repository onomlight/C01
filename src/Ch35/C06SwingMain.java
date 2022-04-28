package Ch35;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
class C06GUI extends JFrame
{
	C06GUI(){
		super(); // 상위클래스 생성자 호출
		
		setTitle("여섯번째번째프레임입니다");
		//패널 추가
		JPanel pan1 = new JPanel();
		
		//배경 색 지정
		Color Col = new Color(31,105,95); //red,green , blue
		pan1.setBackground(Col);
		
		// 버튼객체 생성
		JButton btn1 = new JButton("Button1");
		JButton btn2 = new JButton("Button2");
		JButton btn3 = new JButton("Button3");
		JButton btn4 = new JButton("Button4");
		
		// 추가한 내용
		// 텍스트필드객체 생성
		JTextField txt1 = new JTextField();
		
		// 텍스트 Area 객체 생성
		JTextArea area1 = new JTextArea();
		
		//텍스트 Area 윛 ㅣ지정
		areal.setBounds(50,80,80,100);

		// 텍스트필드 위치 지정
		txt1.setBounds(50,350,200,30);
		
		//버튼 위치 지정
		btn1.setBounds(50,400,80,30);
		btn2.setBounds(160,400,80,30);
		btn3.setBounds(270,400,80,30);
		btn4.setBounds(380,400,80,30);
		
		//버튼 패널에 추가
		pan1.add(btn1);
		pan1.add(btn2);
		pan1.add(btn3);
		pan1.add(btn4);
		pan1.add(area1);
		// 추가내용
		pan1.add(txt1);
		
		
		//레이아웃 null
		pan1.setLayout(null);
				
		// 패널을 프레임에 추가
		
		add(pan1);
		
		setBounds(100,100,500,500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
}

public class C06SwingMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new C06GUI();
	}

}
