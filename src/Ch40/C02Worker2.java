package Ch40;

public class C02Worker2 implements Runnable {

	public static void main(String[] args) {
		

	}

	@Override
	public void run() {
		for(int i=0;i<5;i++) {
			System.out.println("TASK2");
			try {Thread.sleep(500);}catch(Exception e) {}

		}
		
		
	}

}
