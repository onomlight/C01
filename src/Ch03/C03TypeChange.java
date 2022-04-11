package Ch03;

public class C03TypeChange {

	public static void main(String[] args) {
		//  
		int num1 = 129; // 0000000 0000000 0000000 1000001 4byte 구간
		int num2 = 130;//  0000000 0000000 0000000 1000010 4byte 구간
		byte ch1 = (byte)num1; //                  1000001 8byte 구간
		byte ch2 = (byte)num2; //                  1000010
		
		System.out.println(ch1);
		System.out.println(ch2);
		
	}

}

