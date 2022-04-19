package test;

public class Buyer {
	
	int PayCash;
	int ManyTicket ;
	
	
	public Buyer(int Cash, int Ticket) {
		
		PayCash = Cash;
		ManyTicket = Ticket;
	}
	
	void pay (Seller seller,int Cash) {
		
		PayCash = Cash;
		int Ticket = seller.Receive(Cash);
		ManyTicket+=Ticket;
	
	}
	void ShowInfo() {
		System.out.println("보유금액 : " + PayCash);
		System.out.println("티켓개수 : " + ManyTicket);

}

}
