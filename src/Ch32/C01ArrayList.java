package Ch32;

import java.util.*;

public class C01ArrayList {

	public static void main(String[] args) {
		List<String> list = new ArrayList();
		
		//추가
		list.add("JAVA");		//0
		list.add("JDBC");		//1
		list.add("OracleDB");	//2
		list.add("JSP");
		list.add("Servlet");
		list.add("SpringFrameWork");
		list.add("JAVA");		//중복허용..
		
		//개수 확인
		System.out.println("총 개체수 : " + list.size());

		//요소 조회
		System.out.println("Idx 2번째 문자열 : " + list.get(2));

		//전체 조회
		//1)기본 for문
		System.out.println("for문 1번째------------");
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}		
		//2)개량 for문
		System.out.println("for문 2번째------------");
		for(String tmp : list) {
			System.out.println(tmp);
		}
		
		//삭제
		list.remove(1);
		System.out.println("삭제후 확인 1------------");
		for(String tmp : list) {
			System.out.println(tmp);
		}
		list.remove("JSP");
		System.out.println("삭제후 확인 2------------");
		for(String tmp : list) {
			System.out.println(tmp);
		}
		//
		System.out.println(list.toString());
		
		list.clear();
	}

}
