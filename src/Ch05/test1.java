package Ch05;

public class test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
//		// 1.다음코드에서 컴파일 에러가 발생하는 위치와 이유를 설명해보세요
//		byte b =5;
//		b = -b; //>> int 정수 
//		int result = 10 /b;
//		System.out.println(result);
		
		
		// 풀이 : b = -b; 에서 문제 발생 -b; 는 음수자료형 int / b는 byte 값이여서 오류
		
//		//2. 다음 코드를 실행했을 때 출력 결과는 무엇입니까?
//		int x = 10 ;
//		int y = 20;
//		int z =(++x) +(y--);
//		System.out.println(z);
		// 31
		
		
//		3. 다음코드는 실행시 출력 결과로 5를 기대했는데 4가 나왔습니다.
//		어디서 잘못됬는지 확인하고 고쳐보세요
		
//		int var1 =5;
//		int var2 = 2;
//		double var3 = var1 / var2;
//		int var4=(int)(var3 * var2);
//		System.out.println(var4);
		
		//풀이 : 5/2 = 2.5 인데 2.0이 더블로 나옴. 
		// double var3 = var1 / var2; 을 (double)로 앞에 형변환하면됨
//		
//		4. 다음 코드는 비교 연산자와 논리 연산자의 복합 연산식입니다.
//		연산식의 출력 결과를 빈칸에 넣으세요
//		
//		int x = 10;
//		int y = 5;
//		System.out.println((x>7)&&(y<=5));
//		//true
//		System.out.println((x%3 ==2)||(y%2!=1)); >> % 는 짝수인지 묻는것 짝수인대 1이 아니냐 물음
//	
//		//false
		
		
//		5. 대입 연산자와 산술연사자로 구성된 실행문을 복합대입 연산자로 바꿔서 작성해보세요
		
//		int value = 0;
//
//		value = value + 10; // value + = 10;
//		value = value - 10;// -=10;
//		value = value * 10;// *=10;
//		value = value / 10; // /=10;
		
		
//		6. 다음 코드를 실행했을 때 출력 결과는 무엇인지 적어보세요
		
//		int score = 85;
//		String result = (!(score>90))?"가":"나";>>! 부정이기에 90보다 크냐라고 물었으나 부정이되어 가 가 나옴
//		System.out.println(result);
//		
//		//가
		
	}

}
