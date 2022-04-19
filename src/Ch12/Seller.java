package Ch12;

public class Seller {

	// 속성
	
	int Mymoney;
	int AppleCnt;
	int price; // 사과한개당 가격
	//생성자
	public Seller(int mymoney, int appleCnt, int price) {
		
		Mymoney = mymoney;
		AppleCnt = appleCnt;
		this.price = price;
	}
	
	
	// 기능
	//Receive();
	// 돈을 받아 -> 내 보유굼액에 저장 - > 사과개수 계싼 - > 사과개수 차감 - > 사과개수 리턴 \
	int Receive(int money) {
		// 내 보유금액에 저장
		Mymoney+=money;			//내보여금엑에 저장
		
		int cnt=money/price; 	//사과개수 계산
		AppleCnt-=cnt;			//사과개수차감
		return cnt; // 사과개수 리턴 
	}
	void ShowInfo() {
		System.out.println("보유금액 : " + Mymoney);
		System.out.println("사과개수 : " + AppleCnt);
	}
	
}
