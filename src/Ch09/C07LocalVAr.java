package Ch09;

// 지역변수 : {} 내에서 선언되는 변수 / 
// 		 :{} 내에서 공간형성 , {} 를 벗어나면 공간 소멸
//   		stack 영역에 저장

 
class C07Simple 
{
// 맴버값 설정
	int num = 10;
	
	void Func1() {
		System.out.println("num : " + num); // 맴버변수 num 선언 
		int num = 20;
		// 밑에 물결은 지역변수 , 역활이 끝나면 소멸됨
		System.out.println("num : " + num); // Func1  지역변수 num 
	}
	void Func2() {
		System.out.println("num : " + num);
		if(num>0) { // 0보다 크다 -> 참 
			int num=300;
			System.out.println(" if 문 안 num : " + num); // if 문 안 num
			// 중괄호 {} 안에 있는거는 중괄호안에서 만 처리됨 
		}
		System.out.println("num : " + num); // 맴버 변수 num
	}
	void Func3() {
		System.out.println("num : " + num); // 맴버 변수 num
		
		int i= 1;
		while(i<=num) {
			int num = i;
			System.out.println("while 안의 num = " + num);
			i++;
		}
		System.out.println("num : " + num); // 맴버 변수 num
	}
}
public class C07LocalVAr {

	public static void main(String[] args) {
		 C07Simple obj = new C07Simple ();
		 obj.Func1();
		 System.out.println();
		 obj.Func2();
		 System.out.println();
		 obj.Func3();
	}

}
