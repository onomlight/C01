package Ch39;

import java.io.*;
import java.net.*;
public class C02ClientSocket {

	public static void main(String[] args) {

		
		try{
			Socket client = new Socket("192.168.5.50",5050);
			InputStream in = client.getInputStream();
			DataInputStream Din = new DataInputStream(in);
			
			System.out.println("----- 서버 메세지 START -----");
			System.out.print(Din.readUTF());
			System.out.println("----- 서버 메세지 END -----");
			
			
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}

	}

}
