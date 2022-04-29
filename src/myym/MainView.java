package myym;

import java.awt.Container;
import java.awt.FileDialog;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JTable;

public class MainView extends JFrame implements ActionListener {

	JMenuItem m_openFileBtn;
	JButton CountUpBtn;
	
	JTextField SDateField;
	JTextField EDateField;
	
	JTable table;
	
	ChattingData ChatData;
	
	Font f1 = new Font("맑은고딕", Font.PLAIN, 15);
	Font f2 = new Font("맑은고딕", Font.PLAIN, 20);
	
	
	public MainView() {
		setTitle("카카오톡 대화 집계 프로그램");

		Container container = getContentPane();
		container.setLayout(new FlowLayout());
		
		
		createMenu();
		createDateField(container);
		createTable(container);
		
		setSize(1000, 1000);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setVisible(true);
		
	}
	
	private void createMenu() {
		JMenuBar topMenuBar = new JMenuBar();
		
		JMenu fileMenu = new JMenu("File");
		m_openFileBtn = fileMenu.add(new JMenuItem("Open"));
		
		m_openFileBtn.addActionListener(this);
		
		topMenuBar.add(fileMenu);
		
		fileMenu.setFont(f1);
		m_openFileBtn.setFont(f1);
		
		setJMenuBar(topMenuBar);
	}
	
	private void createDateField(Container container) {
		
		JPanel pan1 = new JPanel();

		SDateField = new JTextField("yyyymmdd", 6);
		EDateField = new JTextField("yyyymmdd", 6);
		JLabel SDateLabel = new JLabel(" 시작 날짜 : ");
		JLabel EDateLabel = new JLabel(" 종료 날짜 : ");
		CountUpBtn = new JButton("집계 시작");
		
		SDateLabel.setBounds(10,10,100,30);
		EDateLabel.setBounds(10,10,100,30); // 상단바 고정위치 
		
		SDateField.setBounds(50,50,50,60);
		SDateField.setFont(f2);
		EDateField.setFont(f2);
		
		SDateLabel.setFont(f2);
		EDateLabel.setFont(f2);
		
		CountUpBtn.setFont(f2);
		CountUpBtn.setSize(90,90);
		CountUpBtn.addActionListener(this);
		
		container.add(SDateLabel);
		container.add(SDateField);
		container.add(EDateLabel);
		container.add(EDateField);
		container.add(CountUpBtn);
	}
	
	private void createTable(Container container)
	{
		table = new JTable(30,2);
		table.getColumnModel().getColumn(0).setPreferredWidth(300);
		table.getColumnModel().getColumn(1).setPreferredWidth(50);
		table.setRowHeight(25);
		table.setSize(100, 200);
		table.setFont(f2);
		container.add(table);
	}
	
	private void setTable(HashMap<String, Integer> userDataList)
	{
		int row = 0;
		for (String key: userDataList.keySet()){  
			table.setValueAt(key, row, 0);
			table.setValueAt(Integer.toString(userDataList.get(key)), row++, 1);
		} 
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == m_openFileBtn) 
		{
			String FilePath = OpenFileDialog();
			
			int index = FilePath.lastIndexOf(".");
			
			String Extenstion = FilePath.substring(index + 1);
			
			if(Extenstion.equals("txt"))
				ChatData = new ChattingData(FilePath);
			else
				return;
		}
		
		if(e.getSource() == CountUpBtn) 
		{
			SimpleDateFormat formatter = new SimpleDateFormat("yyyyMMdd");
			
			String SDatestr = SDateField.getText();
			String EDatestr = EDateField.getText();
			
			try {
				Date SDate = formatter.parse(SDatestr);
				Date EDate = formatter.parse(EDatestr);
				
				setTable(ChatData.Getdata(SDate, EDate));
			} catch (ParseException e1) {
				//JOptionPane O = new JOptionPane();
				JOptionPane.showMessageDialog(null, "yyyymmdd 형식이 아닙니다.","ERROR_MESSAGE", JOptionPane.ERROR_MESSAGE);
				e1.getStackTrace();
			}
			
		}
		
	}
	
	public String OpenFileDialog() {
		FileDialog dlg = new FileDialog(new JFrame(), "열기", FileDialog.LOAD);
		dlg.setFile("*.txt");
		dlg.setDirectory("C:");
		dlg.setVisible(true);
		
		return dlg.getDirectory() + dlg.getFile();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MainView();
		
		
		
	}

}
