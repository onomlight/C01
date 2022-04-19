package test;

public class Main12 {

	public static void main(String[] args) {

		
		Store 콜라판매1=new Store(10000,100,1000);
		
		Customer 사이다 = new Customer(10000,0);
		Customer 환타  = new Customer(10000,0);
		Customer 콜팝 = new Customer(1000,0);

		사이다.pay(콜라판매1,2000);
		환타.pay(콜라판매1,2000);
		콜팝.pay(콜라판매1,2000);
		
		
		
		
		
		System.out.println("-----판매자------");
		콜라판매1.ShowInfo();
		System.out.println("-----구매자------");
		사이다.ShowInfo();
		System.out.println();
		환타.ShowInfo();
		System.out.println();
		콜팝.ShowInfo();
		
	}

}
