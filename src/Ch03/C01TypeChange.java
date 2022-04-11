//형변환
// -> 서로 다른 자료형을 일치시키는 작업


// 형변환 종류
// 자동형변환 => (암시적형변환): 컴파일러에 의한 자동형 변환 *[눈으로는 보지 못해도 알아서 컴파일러가 바꿔주는것]
// 강제형변환 => (명시적형변환): 프로그래머에 의한 강제형변환


package Ch03;

public class C01TypeChange {

	public static void main(String[] args) {
		// 자동형변환
		// 좁은 공간안의 값을 넓은 공간에 대입하는 경우
		// 컴파일러에 의한 자동형변환
		// byte < short < int < long <float < double
		byte bval = 10;
		int ival = bval; // 문제가 없음으로 자동형변환(int 자료형으로 변환)
		System.out.println(" ival: " + ival);
		
		char cval = '가' ;
		ival = cval; // 자동형변환(int 자료형으로 변환)
		System.out.println(" ival: " + ival);
		
		long lval = ival;  // 자동형변환(long자료형으로변환)
		System.out.println(" lval: " + lval);
		
		
		
		
		// 실수공간은 소수점 받을수있으나 정수는 소수점밑으로 버려야함
		// 오른쪽은 정수만 담을수있으나 왼쪽은 실수로 받을수있음 //공간 사이즈와 무관하게 실수 정수가 만나면 데이터 최소화하기위해 작동됨
		
		float fval = lval; // 자동형변환(float자료형으로 변환)
		System.out.println(" fval: " + fval);
		
		double dval = fval;// 자동형변환(double형으로 변환)
		System.out.println(" dval: " + dval);
		// 

	}

}
