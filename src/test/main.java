package test;

public class main {

	public static void main(String[] args) {


		Seller 매표소1 = new Seller(10000,100,3000);
		
		Buyer A = new Buyer(3000,0);
		Buyer B = new Buyer(2000,0);
		Buyer C = new Buyer(1000,0);
		
		A.pay(매표소1, 3000);
		
		B.pay(매표소1, 4000);
		
		C.pay(매표소1, 200);
		
		System.out.println("----- 매표소 -----");
		매표소1.ShowInfo();
		System.out.println("----- 구매자 -----");
		A.ShowInfo(); 
		System.out.println();
		B.ShowInfo();
		System.out.println();
		C.ShowInfo();

	}

}
