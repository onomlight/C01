package Ch38;

import java.io.*;

import java.net.URL;

public class C04URLStreamMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		try {
			URL url = new URL("https://www.naver.com");
			InputStream in = url.openStream(); // 지정된 url부터 inputstream 가져옴
			in = new BufferedInputStream(in); // 기본스트름에 Buffer스트림 연걸
			Reader r = new InputStreamReader(in); // Buffer연결 된 스트림에 reader 스트림연결
		
			int data;
			while(true) {
				
				data = r.read();
				if(data==-1)
					break;
				System.out.print((char)data);
			}
		} catch(Exception e) {
			e.printStackTrace();
		}
		
	}

}
