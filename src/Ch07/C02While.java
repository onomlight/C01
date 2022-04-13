package Ch07;

import java.util.Scanner;

public class C02While {

	public static void main(String[] args) {
		// 전체 구구단(가로)
		// 2*1 2*2 2*3 2*4 2*5 2*6 2*7 2*8 2*9 3*1... 9*9
		// 
//		int dan=2;
//		int i = 1;
//		while(dan<=9) 
//		{
//			i=1;
//			while(i<=9) 
//			{
//				System.out.printf("%d x %d = %d\n", dan,i,(dan*i));
//				i++;
//			}
//		System.out.println();
//			dan++;
//		}
		// 1)전체 구구단은 역순출력합니다. 9*1...2*9 
		
		
		// 2) 9*9 9*8.. 2*1
		
		
		// 단수를 입력받아(dan) dan -9단까지 출력합니다.
		// 조건 : dan안의 숫자는 9미만이어야 합니다.
		
//		int dan=9;
//		int i = 1;
//		
//		while(dan>0)
//		{
//		 i=9;
//		 while(i>0) {
//			 System.out.printf("%d x %d = %d\n", dan,i,(dan*i));
//     			i--;
//		 }
//		 System.out.println();
//		 dan--;
//		}
		
		
		
		
		
		// 전체 구구단(세로)
		
		int dan=2;
		int i = 1;
		while(dan<=9) 
		{
			i=1;
			while(i<=9) 
			{
		//		System.out.println("%d x %d = %d\n", dan,i,(dan*i));
				i++;
			}
		System.out.println();
			dan++;
		}
		
		// *****
		// *****
		// *****
		// *****
		// *****
		
		// *
		// **
		// ***
		// ****
		
		// 높이 : 3
		// *
		// **
		// ***
		
		
		// ****
		// ***
		// **
		// *
		
		
		// 높이 : 3
		// ***
		// **
		// *

		
		
		
		//      *
		//     ***
		//    *****
		
		// 높이 : 3
		//    *
		//   ***
		//  *****
		
		// *****
		//  ***
		//   *
		
		// 높이 : 3
		// *****
		//  ***
		//   *
	
         //	  *
		//   ***
		//  *****
		// *******
		//  *****
		//   ***
		//    *
		
		
		// 높이 (홀수값) : 3
		// *
		//***
		// *
		
		// *******
		//  *****
		//   ***
		//    *
		//   ***
		//  *****		
		// *******		
	}

}
