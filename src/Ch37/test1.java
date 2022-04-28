package Ch37;

import java.io.FileWriter;
import java.io.Writer;

public class test1 {

	public static void main(String[] args) {


		try {
			// 두번째 true : 추가하기 , false : 덮어쓰기
		Writer out = new FileWriter("c:\\test\\애국가.txt",true);
		out.write("동해물과 백두산이 마르고 닳도록\n");
		out.write("하느님이 보우하사 우리나라 만세\n");
		out.write("무궁화 삼천리 화려 강산\n");
		out.write("대한 사람 대한으로 길이 보전하세\n");
		
		out.flush(); // 스트림 버퍼 초기화
		out.close(); // 스트림 제거 
		}catch(Exception e) {
			e.printStackTrace();
		}

	}

}
