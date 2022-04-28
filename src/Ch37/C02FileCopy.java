package Ch37;


import java.io.*;
public class C02FileCopy {

	public static void main(String[] args) {

		
		
		try {
			Reader in = new FileReader("c:\\abcd\\Original.txt");
			Writer out = new FileWriter("c:\\abcd\\CopFile.txt");
			
			//읽을때 사용하는 버퍼 공간
			char buffer[] = new char[4096];
			
			while(true)
			{
				int num = in.read(buffer);
				if(num==-1) {
					 	
					break;
				}
			System.out.println("읽은 개수 : " + num);
				out.write(buffer);  // 지정된 위치에 쓰기
				out.flush(); // 버퍼 지우기
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}

	}

}
