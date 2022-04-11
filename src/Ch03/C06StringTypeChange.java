package Ch03;

public class C06StringTypeChange {

	public static void main(String[] args) {
		
		// -------------------------------------
		// 문자열 + 문자열
//		// -------------------------------------
//		System.out.println("String1" + "String2");
//		System.out.println("String1" +','+ "String2");
//		System.out.println("String1" + 2);
//		System.out.println(1+2+ "String");

		
		
		//----------------------------------------
		// 문자열 ->숫자형
		//----------------------------------------
		// 문자열 -> 정수 변환
		System.out.println("10" + "20");
		
		
		int n1 = Integer.parseInt("10"); // 정수를 10을 파싱을해서 읽을거다
		int n2 = Integer.parseInt("20");
		
		System.out.println(n1+n2);
		

		
		

		System.out.println("10.5" + "20.7");
		
		
		double n3 = Double.parseDouble("10.5");
		double n4 = Double.parseDouble("20.7");
		// 실수 = Double
		System.out.println(n3+n4);

				
		//short.parseShort9("");
		//Byte.parseByte("");
				
		
		
		// 숫자형 -> 문자형
		
		int ival =10;
		double dval = 3.14;
		System.out.println(ival + dval);
		
		String str1 = String.valueOf(ival); //valueof > 어떤자료든간에 문자형으로 변환을 해줌
		String str2 = String.valueOf(dval);
		System.out.println(str1 + str2);
		
		
		
	}

}
