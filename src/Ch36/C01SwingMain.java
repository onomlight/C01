package Ch36;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

class C01GUI extends JFrame implements ActionListener,KeyListener
{
	//
	JButton btn1;
	JButton btn2;
	JTextField txt1;
	JTextArea area1;
	// 생산자위에다 지워 써야 사용가능함 
	C01GUI(){
		super(); //상위클래스 생성자 호출
		setTitle("Listner적용하기");
		
		//패널 추가
		JPanel pan1 = new JPanel();
		
		//배경 색 지정
		Color col = new Color(180,244,237);	//Red,Green,Blue(0-255,0-255,0255)											
		pan1.setBackground(col);
		
		
		//컴포넌트 객체 생성
		 btn1 = new JButton("입력");
		 btn2 = new JButton("종료");
		 txt1 = new JTextField();
		 area1 = new JTextArea();
		JScrollPane scroll1 = new JScrollPane(area1);
		
		//컴포넌트 위치 지정 
		scroll1.setBounds(50,50,190,280);
		//area1.setBounds(50,50,190,280);  // Scroll추가시 제거
		txt1.setBounds(50,350,190,30);
		btn1.setBounds(50,400,80,30);
		btn2.setBounds(160,400,80,30);
		
		//컴포넌트를 리스너에 등록
		btn1.addActionListener(this);
		btn2.addActionListener(this);
		txt1.addKeyListener(this);
		
		//패널에 컴포넌트 추가
		pan1.add(btn1);
		pan1.add(btn2);
		pan1.add(txt1);
		//pan1.add(area1);  // Scroll추가시 제거
		pan1.add(scroll1);
		
		
		//레이아웃 null
		pan1.setLayout(null);
		
		//패널을 프레임에 추가
		add(pan1);	
		setBounds(100,10,300,500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);	
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==btn1) {


			String tmp = txt1.getText();
			area1.append(tmp+"\n");
			txt1.setText(""); // 입력 후 공백 라인
			
		}
		if(e.getSource()==btn2) {
			System.exit(-1);
		}
		
	}

	@Override
	public void keyTyped(KeyEvent e) {
		
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		
//		System.out.println(e.getKeyChar());
//		System.out.println(e.getKeyCode());
		
		if(e.getKeyCode()==10)
		{
			String tmp = txt1.getText();
			area1.append(tmp+"\n");
			txt1.setText("");
			
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
		
		
	}
	
	
}

public class C01SwingMain {

	public static void main(String[] args) {
		
		new C01GUI();
	}

}
