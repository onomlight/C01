package Ch03;

public class C04ArithChange {
 
	public static void main(String[] args) {
		// 산술연산시 자동형변환
		
		
		// 정수연산식(int보다 작은 변수 자료형(short,char,byte))
		// -> int 로 자동형변환 / byte로 할경우 계산이 진행이안됨
		
//		byte x = 10;
//		byte y = 20;
//		byte z = 30;
//		
//		int result = x + y + z ; // 컴파일러에러 ?  >> 산술연산시 int보다 작으면 int로 자동형변환 

		
		//정수연산식(int보다 큰 변수자료향(long)
		//-> 큰자료형으로 형변환
		
//		byte x= 10;
//		int y = 20;
//		long z = 30L;
//		
//	    long result = x + y + z;
		
		// int -> long 가장 큰 자료형으로 각가 형변환됨
		
		// 실수연산식
		
		int x = 10;
		float y = 3.3F;
		double z =5.5;
		
		double result = x + y + z ; // 실수자료형(size큰자료형)으로 자동형변환 
		
	}

}
