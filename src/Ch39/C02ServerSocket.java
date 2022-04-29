package Ch39;


import java.net.*;
import java.util.Scanner;
import java.io.*;
public class C02ServerSocket {

	public static void main(String[] args) {
		ServerSocket server = null;
		try {
			//192.168.5.25
			server = new ServerSocket(5050);
			System.out.println("서버 통신 서비스 시작!");


			Scanner sc = new Scanner(System.in);
			while(true)
			{
				
			System.out.println("서버 전송 메세지 : ");
			String tmp = sc.next();
			Socket client = server.accept();	// 클라이언트 접속 요청시
												// Client 객체 생성(in/out스트림연결)
			
			//데이터 전송용 스트림
			OutputStream out = client.getOutputStream(); 
			DataOutputStream Dout = new DataOutputStream(out);
			
			Dout.writeUTF(tmp);
			Dout.flush();
			
			client.close();
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try{server.close();}catch(Exception e) {e.printStackTrace();}
		}

	}

}
