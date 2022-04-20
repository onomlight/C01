package Ch19;


class Rectangle
{
	//기준좌표 설정
	static int x;
	static int y;
	int width;
	int height;
	
	Rectangle(int width,int height){
		this.width=width;
		this.height=height;
	}
	//끝점확인 기능
	void ShowEndPoint() {
		System.out.printf("(%D,%d)\n",(x+width),(y+height));
		// 기준점 x 에서 넓이만큼 더해주면 endpoint까지 가는 부분 
	}
	// 시작점,너비,높이,끝점확인
	void ShowInfo() {
				int endx=x+width;
				int endy=y+height;
		System.out.printf("시작-끝점 : (%d,%d) - (%d,%d)\n",x,y,endx,endy);
		System.out.println("너비,높이 : " + width + " , " + height);
		System.out.println("넓이 : " + (width + height));
//		System.out.printf("X의 시작점 = %d Y의 시작점 = %d\n",x, y);
//		System.out.print("너비 :" + width);
//		System.out.print("높이 :" + height);
	}
}
public class C02StaticMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 기준점
		Rectangle.x=10;
		Rectangle.y=20;
		
		Rectangle rec1 = new Rectangle(10,10);
		Rectangle rec2 = new Rectangle(5,7);
		Rectangle rec3 = new Rectangle(6,5);
		
		rec1.ShowInfo();System.out.println();
		rec2.ShowInfo();System.out.println();
		rec3.ShowInfo();System.out.println();
	}

}
