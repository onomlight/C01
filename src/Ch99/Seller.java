package Ch99;

class C01Seller
{
	//속성
	private int MyMoney; // 돈
	private int AppleCnt; // 사과개수
	int Price; // 사과한개가격
	//생성자
	public C01Seller(int money,int apple , int price){
		MyMoney = money;
		AppleCnt = apple;
		Price = price;
	//기능
				}

	int Receive(int money) {
		
		MyMoney+=money;
		
		int cnt = money/Price;
		AppleCnt -= cnt;
		return cnt;
		
	
		}
	void ShowInfo() {
		System.out.println("보유금액 : " + MyMoney);
		System.out.println("사과개수 : " + AppleCnt);
		System.out.println("개당가격 : " + Price);
	}
}