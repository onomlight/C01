package Ch39;

import java.io.*;
import java.net.*;
import java.util.Scanner;
public class C04ClientSocket {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		try
		{
			
			Socket client = new Socket("SERVERIP",7777);
			
			System.out.println("서버와 연결이 완료되었습니다");
			
			DataInputStream Din = new DataInputStream(client.getInputStream());
			DataOutputStream Dout = new DataOutputStream(client.getOutputStream());
			
			
			Scanner sc = new Scanner(System.in);
			String recv=null;
			String send=null;
			
			while(true)
			{
				System.out.print("[Client (q:종료)] : ");
				send=sc.nextLine();
				Dout.writeUTF(send);
				if(send==null||send.equals("q"))
					break;
				recv=Din.readUTF();
				if(recv==null||recv.equals("q"))
					break;
				System.out.println("[Server ] " + recv);
				
			}
			
			Dout.close();
			Din.close();
			client.close();
			System.out.println("서버와 연결을 종료합니다");
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
