package Ch09;


class C08Car{
	//속성
	public String owner;
	public int speed;
	public int fuel;
	//기능
	public void Accel() {
		//현재속도에서 +10 증가
		//연료량은 -5 감소
		//연료량이 0 순간 가속X("연료량 0 .. 가속불가합니다.")
		
		if(fuel-5<0)
		{
			fuel=0;
			System.out.println("연로량0.. 가속불가합니다");
			return;
		}else
		{
			fuel-=5;
			
		}
		//최대속도 :200Km/h 를 넘지 않게 설정
		
		//정상가속이 되면 (name+" 님 차량 가속합니다. 연료량=? 현재속도=?)
		
		
		// 엑셀을 밟았을대 속도 증가
		if(speed+10>=200 )// 200을 초과하는지 물어야함
			// 최대 속도 : 200km/h 를 넘지 않게 설정
		{ 
			
			speed=200;
			System.out.println(owner+"님의 차랑 최대속력입니다");
			System.exit(-1);
		}
		else
		{
			speed = speed+10; // speed+=10
			System.out.printf(owner+"님의 차량 가속합니다. fuel=%d, 시속=%dkm/h\n",fuel,speed);
		}
		
		
		
	}
	public void Break() {
		//현재속도에서 -10 감소
		//현재속도가 0이라면 차량이 정지했습니다. 를 출력
		if(speed-10<0) {
			speed=0;
			System.out.printf("현재속도 %d km/h.. 정지합니다\n");
			System.exit(-1); // 프로그램 종료
		} else {
			speed -=10;
			System.out.printf("현재속도 %d km/h\n",speed);
		}

		 
		
	}
	
}
public class C08CarMain {

	public static void main(String[] args) {
		C08Car hong = new C08Car();
		hong.owner = "홍길동";
		hong.speed =  50;
		hong.fuel = 100;
		
		
		while(true) 
		{
			try {
			Thread.sleep(500); // 0.5초 일시정지 // 잠깐 정지시키고 처리함
			//hong.Accel();
			hong.Break();
			}
			catch(Exception e) {}
		
		}

	}

}
