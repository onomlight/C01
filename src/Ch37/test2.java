package Ch37;

import java.io.FileReader;
import java.io.Reader;

public class test2 {

	public static void main(String[] args) {

		try {
			Reader in = new FileReader("c:\\test\\애국가.txt");
					

			while(true) {
				int data = in.read();
				if(data==-1) {
					break;
				}
				System.out.print((char)data);
			}
			
			}catch(Exception e) {
				e.printStackTrace();
				
			}

		
	}

}
