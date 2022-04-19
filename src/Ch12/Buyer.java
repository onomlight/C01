package Ch12;

//객체와 객체사이의 어떤 상호작용이하는지알아봐야함

//정우균이 사과장수에게 사과를 구매한다
//
//정우균	 [ Buyer Class ]
//ㄴ 정우균이 구매하기 기능을 가지고있음
//ㄴ Mymoney 와 Applecnt '속성'이 필요
//ㄴ pay 라는 '기능'이 있어야함
//사과장수	 [ Seller Class ]
//ㄴ Mymoney 와 Applecnt '속성'이 필요
//ㄴ Receive 라는 기능이 있어야함
// Mymoney : Applecnt = int
//사과


//	1) Buyer 가 돈을 지불한다( 돈을 , 누구한테?)
// pay(int money, Seller seller<<참조변수
//	2) Seller 가 돈을 받아 자기 주머니에 챙긴다
// 자기 사과 개수에서 받은 액수 만큼 사과 개수를 차감한다
// 사과개수를 Buyer에게 리턴한다

// 3) Buyer에 사과개수에 받은 값을 누적한다
public class Buyer {
// 속성
		int Mymoney;
		int AppleCnt;
		// 생성자
		Buyer(int money, int cnt){
			this.Mymoney = money;
			this.AppleCnt = cnt;
		}
		
		//기능
		// pay 함수 (좀있다 정리)
		void pay(Seller seller,int money) {
			//1 판매자(seller)에게 돈을 전달
			Mymoney-=money;
			int cnt = seller.Receive(money);
			AppleCnt+=cnt;
		 
		}
		
		
		void ShowInfo() {
			System.out.println("보유금액 : " + Mymoney);
			System.out.println("사과개수 : " + AppleCnt);
		}
	
}
