package Ch02;

public class C03자료형 {

	public static void main(String[] args) {
		//declaration : 선언  이름만 부여(오늘부터 다이어트할래~!/ 강제력이없음 / 안지킴)
		//definition  : 정의  이름부여+공간형성( 지켜야함 )
		//initialize  : 초기화 이름부여+공간형성+기본값저장
		
		// 함수 선언부와 정의부가 나눠져있는걸 참고해야함 
		int num1; // 변수를 정의 4byte 정수 저장 공간을 지정한 뒤 num1 라는 이름을 부여 (변수를 정의)
		num1=10; // 10상수값을 상수풀에 저장한뒤 num1공간에 대입
		int num2=4; // 4라는 값을 상수값을 상수풀에 저장한뒤 4byte 정수 num2공간에 초기화
		int num3 = num1 + num2; // num1값과 num2값의 합을 num3 변수 공간에 초기화
		System.out.println(num3); // num3안의 값을 출력
		

	}

}
