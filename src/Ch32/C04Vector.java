package Ch32;

import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class C04Vector {

	public static void main(String[] args) {
		List<String> list =new Vector();
		
		list.add("JAVA");
		list.add("JSP");
		list.add("Android");
		list.add("Mysql");
		
		System.out.println("개수 : " + list.size());
		
		for(String tmp : list) {
			System.out.println(tmp.toString());
		}
		System.out.println("---------------------");
		
		List<String> list2 = new LinkedList();
		list2.add("Servlet");
		list2.add("Ruby");
		list2.add("Github");
		list2.add("HTML/CSS");
		for(String tmp : list2) {
			System.out.println(tmp.toString());
		}
		
	}

}
