package Ch01;

public class C02BasicOutputMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 ///System.out : 표준 출력 스트림(해석 : 펴준 출력 장치 (모니터)에 데이터 전달)
		// Systoem.out.print() : 콘솔 화면에 데이터 출력
		
		System.out.print("Hello World\n");
		System.out.print("Hello World\n");
		// 모니터에다가 헬로우 월드를 출력하겟다
		// Escape 문자 
		// 제어문자용으로 쓰기위해 지정된 문자
		
         //	    *
		//   ***
		//  *****
		// System.out.printf() : 서식문자를 이용한 출력
		// 서식 : 서류를 꾸미는 일정한 양식
		//%d : 10진 정수 서식
		// %f : 10진 실수 서식
		// %c : 한문자 서식
		// %s : 문자열 서식
		
		// \n : 개행(줄바꿈)
		// \b : 한문자 삭제
		// \t : 탭(8칸) 만큼 커서 이동
		// \r : 행의 처음으로 이동 
		// System.out.println(" 저의 이름은 홍길동입니다.\n 나이는 22세입니다.\n 사는곳은 대구입니다");
//		 System.out.printf("%d + %d = %d\n", 10,20,10+20);
//		 System.out.printf("%f + %f = %f\n",10.1, 20.2, 10.1+20.2);
//		 System.out.printf("%c %c %c \n" ,'a','b','c');
//		 System.out.printf("%s %s %s \n","this is", "String","test");
//		 System.out.printf("%d.[%c] %s\n",1,'A',"Java Programiing Basic");
		 
		 // 문제
		 // 다음 내용을 printf로 출력하세요
		 // 적절한 위치에 서식문자(%s,%d)와 제어문자(\t,\n)을 사용하여 출력합니다.
	
//		 System.out.printf("%s\t%s\t%s\n","이름","나이","주소");
//		 System.out.printf("%s\t%d\t%s\n","홍길동",20,"대구");
//		 System.out.printf("%s\t%d\t%s\n","김철수",30,"울산");
//		 System.out.printf("%s\t%d\t%s\n","박영희",40,"인천");
		 
		 // 이름   나이   주소
		 // 홍길동 20     대구
		 // 김철수  30   울산
		 // 박영희   40    인천
		 
		 
		 
		 
		 // 서식문자를 이용하여 다음과 같은 문자를 완서앟ㅂ니다
		 // 나의 이름은 %s 입니다
		 // 나의 이름은 %d 살입니다
		 
		 //System.out.printf("나의 이름은 %s 입니다\n","정우균" );
		 //System.out.printf("나의 이름은 %s 입니다\n","37" );
		 //System.out.println();
		 
		 
		 System.out.println("Hellow World");
		 System.out.println("Hellow World");
		 System.out.println("Hellow World");
		 System.out.println("Hellow World");
		 
		 //주의
		 // " 의 문자그대로의 출력
		 
		 System.out.println("I say \"Hello?\" ");
		 
		 
		 
		 // code 도서명 출판사 가격
		 // 1010 이것이리눅스 한빛미디어 29000
		 // 2020 윤성우 오렌지미디어 30000
		 // 3030 DITTJava 00미디어 18000
		 // 4040 TCP 리키엇소켓 20000
		
	}

	
	
	 
}
