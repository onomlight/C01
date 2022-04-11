// 업다운세팅 , 객체지향형
package Ch03;

public class C02TypeChange {

	public static void main(String[] args) {
		// 강제형변환
		// 프로그래머에 의해 억지로 형변환됨
		// 좁은공간에 큰 공간의값을 대입하려는 경우
		// 데이터 손실이 일어날 가능성이 크다
		
		int ival = 44032;
		char cval = (char)ival;
		System.out.println(cval);
		
		long lval = 500;
		ival = (int)lval; // 4byte =8byte
		System.out.println(lval);
		
		double dval = 3.14;
		ival = (int)dval;
		System.out.println(ival);

	}

}
