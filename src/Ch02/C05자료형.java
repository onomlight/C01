package Ch02;

public class C05자료형 {

	public static void main(String[] args) {
		
		
		
		//char 형을 10진로 변환
		// int 를 변환하면 숫자로 표시
		
	 System.out.println((int)'A');
	 System.out.println((int)'a');
	 System.out.println((int)'가');
	 System.out.println((int)'나');
	 System.out.println((char)1234);
	 System.out.println((char)100);
	 System.out.println((char)200);
	 System.out.println((char)300);
	 
	 
	 //10 10.5 'ㅁ' "woiejk" >> 선저장 후처리
	 
	 System.out.println((char) 10);
	 System.out.printf("%x\n",(int)'A');
	 System.out.printf("%x\n",(int)'a');
	 System.out.printf("%x\n",(int)'가');
	 System.out.printf("%x\n",(int)'나');
	 
	 
	 // 유니코드값을 이용해서 문자를 출력
	 System.out.println('\u0041');
	 System.out.println('\u0061');
	 System.out.println('\uac00');
	 
	 
	 
	 
	 
	 
	 
	}

}
