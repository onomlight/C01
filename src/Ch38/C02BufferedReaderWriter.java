package Ch38;

import java.io.*;

public class C02BufferedReaderWriter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		try {
			Reader in = new FileReader("c:\\abcd\\Dialog.txt"); // 기존스트릠
			BufferedReader bin = new BufferedReader(in);		// 보조스트림 연결
			
			Writer out = new FileWriter("c:\\abcd\\CopyDL.txt"); // 기본스트림
			BufferedWriter bout = new BufferedWriter(out);		//보조스트림 연결 
			
			int data = 0;
			while(true)
			{
				data=bin.read();
				if(data==-1)
					break;
				System.out.print((char)data);
				bout.write(data);
				bout.flush();
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
