package Ch99;
//판매자


// 1. MyMoney 2.AppleCnt 
// 바이어 클래스 3. Paymaent 실행시 MYMoney 감소
// 금액 전달 리턴
// 셀러는 마이머니 금액 증가 사과개수 차감




	//기능
	


public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		C01Seller seller = new C01Seller(100000,100,1000);
		C01Buyer buyer01 = new C01Buyer(10000,0);
		C01Buyer buyer02 = new C01Buyer(20000,0);
		C01Buyer buyer03 = new C01Buyer(30000,0);
		
		buyer01.Payment(seller, 2000);
		buyer02.Payment(seller, 5000);
		buyer03.Payment(seller, 3000);
		
		System.out.println("---판매자 정보---");
		seller.ShowInfo();
		System.out.println("---구매자 정보---");
		System.out.println("-buyer01-");
		buyer01.ShowInfo();
		System.out.println("-buyer02-");
		buyer02.ShowInfo();
		System.out.println("-buyer03-");
		buyer03.ShowInfo();
		
		
		
	}

}
