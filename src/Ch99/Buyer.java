package Ch99;

class C01Buyer
{
	//속성
	private int MyMoney; // 돈
	private int AppleCnt; // 사과개수
	//생성자

	public C01Buyer(int money, int apple) {
		MyMoney = money;
		AppleCnt = 0;
		
	}
	public void Payment(C01Seller seller, int money) {
		
		
		
			MyMoney -= money;
			AppleCnt+=	seller.Receive(money);
			
		}
		void ShowInfo() {
			System.out.println("보유금액 : " + MyMoney);
			System.out.println("사과개수 : " + AppleCnt);
		}
		
	


}
