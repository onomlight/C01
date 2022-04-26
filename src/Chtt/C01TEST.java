package Chtt;

import javax.swing.JFrame;

class GUI extends JFrame{
	
	GUI(){
		super("첫번째 프레임 창입니다");
		setBounds(100,100,500,500);// x,y width,height
		setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
public class C01TEST {

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new GUI();
	}

}
