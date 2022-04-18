package Ch10;

class Position{
	
	Position(int x, int y) {
		
	}

	public void showpos(int x, int y) {
		System.out.printf("x : %d,y : %d\n",x,y);
		// TODO Auto-generated method stub
		
	}
	

}
public class test2 {

	public static void main(String[] args) {

		  Position pos1 = new Position(10, 0); //x좌표(int x)
		   Position pos2 = new Position(30,40); //x좌표(int x),y좌표(int y)
		   pos1.showpos(10, 0);
		   pos2.showpos(30, 40);

	}

}


//--Main2.java--
//public static void main(String[] args) {
//   Position pos1 = new Position(10); //x좌표(int x)
//   Position pos2 = new Position(30,40); //x좌표(int x),y좌표(int y)
//   pos1.showpos();
//   pos2.showpos();
//}
//[출력]
//X : 10 , Y : 0
//X : 30 , Y : 40