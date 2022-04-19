package Ch13;

import Ch12.Seller;

public class Customer {
	
	int PayCash;
	int ManyCola;
	// 생성자
		Customer(int Cash, int Cola){
			this.PayCash = Cash;
			this.ManyCola= Cola;
		
	}

		void pay(Store store,int Cash) {
		//1 판매자(seller)에게 돈을 전달
			PayCash=Cash;
			int Cola = store.Re(Cash);
			ManyCola+=Cola;
	 
	}
	
	
	
	void ShowInfo() {
		System.out.println("보유금액 : " + PayCash);
		System.out.println("콜라개수 : " + ManyCola);
}
}
