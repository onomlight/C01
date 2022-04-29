package Ch38;

import java.io.*;
import java.net.URL;

import org.jsoup.*;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

public class C05JSoupMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			
			Connection conn = Jsoup.connect("https://www.naver.com");
			
			Document document = conn.get();
			
//			System.out.println(document);
			
			URL url=null;
			
			Elements elements = document.getElementsByTag("img");
			
			for(int i=0;i<elements.size();i++) {
				String str[] = elements.get(i).toString().split(" ");
				System.out.println("1번째 : " + str[1]);
				
				int BeginIdx = str[1].indexOf("\"");
				System.out.println("\"의 idx : " + BeginIdx );
				String tmp = str[1].substring(0,BeginIdx);
//				System.out.println("0번째 : " + str[0]);
//				System.out.println("1번째 : " + str[1]);
//				System.out.println("2번째 : " + str[2]);
//				System.out.println("3번째 : " + str[3]);
				System.out.println();
				
				// url 연결하기
				url = new URL(tmp);
				InputStream in = url.openStream();
				BufferedInputStream bin = new BufferedInputStream(in);
				String filename="Image";
				OutputStream out = new FileOutputStream("c:\\abcd\\"+filename+i+".png");
				int data=0;
				while(true) {
					
					data=bin.read();
					if(data==-1)
						break;
					// writer로 지정된 위치에 저장
				}
						
//				//System.out.println(elements.get(i));
			}
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}

	}

}
