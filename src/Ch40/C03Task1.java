package Ch40;

public class C03Task1 implements Runnable {

	C01GUI gui;
	C03Task1(C01GUI gui)
	{
		this.gui = gui;
	}
	@Override
	public void run() {
		// 
		while(!Thread.currentThread().isInterrupted()) {
			
			gui.area1.append("Task1.....\n");
		
		
			try {
				Thread.sleep(500); // 인터럽트 발생시 예외객체 생김 catch넘겨wla
			}
			catch(Exception e)
			{
				System.out.println("인트럽트 걸림");
				break; // 인터럽트가 발생하며ㅛㄴ while문을 벗어나도록 하기 위함 
			}
		}
		
	}

}
