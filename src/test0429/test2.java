package test0429;


//3 개의 문자열을 각각의 String[] text 배열에 넣어줍니다

//특정 문자열을 하나 따로 입력받아 해당문자열이 배열에 포함되어있는지 여부를 확인하는

//Iscontain 메서드를 완성하세요

//String 클래스 포함문자검색(contain) 메서드를 이용합니다

import java.util.Scanner;

public class test2 {

	public static void main(String[] args) {

	
	
		Scanner sc = new Scanner(System.in);
		String[] text = new String[3];
		
		 System.out.print("1 문자열을 입력하세요 : ");
	      String str1 = sc.nextLine();
	      text[0] = str1;
	      System.out.print("2 문자열을 입력하세요 : ");
	      String str2 = sc.nextLine();
	      text[1] = str2;
	      
	      System.out.print("3 문자열을 입력하세요 : ");
	      String str3 = sc.nextLine();
	      text[2] = str3;
	      
	      
	      System.out.print("찾을 문자열 입력하세요 : ");
	      String name = sc.nextLine();
	      
	      boolean result = Iscontain(name, text);
	      System.out.printf("%s 포함 여부 : %s\n",name, result);

	   }

	   public static boolean Iscontain(String str, String[] text) {
	      for (int i = 0; i < text.length; i++) {
	         if (text[i].contains(str)) {
	            return true;
	         }   
	      }

		
		return false;
		
	}
}
