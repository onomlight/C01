package Ch39;


import java.net.*;
import java.io.*;
public class C01ServerSocket {

	public static void main(String[] args) {

		try {
			//192.168.5.25
			ServerSocket server = new ServerSocket(5050);
			System.out.println("서버 통신 서비스 시작!");
			server.accept();
			Socket client = server.accept();	// 클라이언트 접속 요청시
												// Client 객체 생성(in/out스트림연결)
			
			//데이터 전송용 스트림
			OutputStream out = client.getOutputStream(); 
			DataOutputStream Dout = new DataOutputStream(out);
			
			Dout.writeUTF("Server접속이 확인되었습니다");
			Dout.flush();
			server.close();
			client.close();
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			
		}

	}

}
