package Ch07;

import java.util.Scanner;

public class C02While {

	public static void main(String[] args) {
		// 전체 구구단(가로)
		// 2*1 2*2 2*3 2*4 2*5 2*6 2*7 2*8 2*9 3*1... 9*9
		// 
//		int dan=2;
//		int i = 1;
//		while(dan<=9) //
//		{
//			i=1;
//			while(i<=9) 
//			{
//				System.out.printf("%d x %d = %d\n", dan,i,(dan*i));
//	//			i++;
//			}
//		System.out.println();
//			dan++;
//		}
		// 1)전체 구구단은 역순출력합니다. 9*1...2*9 
		
//		int dan=9;
//		int i = 1;
//		while(dan>1) 
//		{
//			i=1;
//			while(i<=9) 
//			{
//				System.out.printf("%d x %d = %d\n", dan,i,(dan*i));
//				i++;
//			}
//		System.out.println();
//			dan--;
//		}
		
		// 2) 9*9 9*8.. 2*1
		
		// > 내꺼
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
//		 > 쌤꺼
//	}
		
//		int dan=9;
//		int i=1;
//		while(dan>1) {
//			i=1;
//			while(i<=9) {
//				System.out.printf("%d x %d = %d\n", dan,i,(dan*i));
//				i++;
//			}
//			System.out.println();
//			dan--;
//		}
		
		
		// 단수를 입력받아(dan) dan -9단까지 출력합니다.
		// 조건 : dan안의 숫자는 9미만이어야 합니다.

//		Scanner sc = new Scanner(System.in);
//		int dan = sc.nextInt(); 
//		if(dan>=9) //if 입력시 9이상으로는 곱셈이 되지 않도록 설정하기위해 else문 작성됨 
//			System.out.println("단수를 잘못입력하셧습니다.");
//		
//		else {
//			
//		
//		}
//		int i=1;
//		while(dan<=9) {
//			i=1;
//			while(i<=9) {
//				System.out.printf("%d x %d = %d\n" , dan,i,(dan*i));
//				i++;
//			}
//			System.out.println();
//			dan++;
//		}
//		
		
		
		
		// 전체 구구단(세로)
		// 내꺼
//		int dan=2;
//		int i = 1;
//		while(dan<=9) 
//		{
//			i=1;
//			while(i<=9) 
//			{
//				System.out.println("%d x %d = %d\n", dan,i,(dan*i));
//				i++;
//			}
//		System.out.println();
//			dan++;
//		}
		
		
		/// 쌤꺼 i=9,i--,i>=1
		
//		int dan=9;
//		int i=1;
//		while(dan>1) {
//			i=9;
//			while(i>=1) {
//				System.out.printf("%d x %d = %d\n", dan,i,(dan*i));
//				i++;
//			}
//			System.out.println();
//			dan--;
//		}
		
		
		// 전체 구구단(가로)
		// 행을 1~9행 , 바깥을 돌아가야함
		// 2*1 3*1 4*1 .. 9*1
		// 바깥            안쪽
		// i는 1~9        dan  2~9
		// i의 초기값은 1이고, 1씩 증가 i++; ,  i<=9 //   dan = 2 , dan++;, dan<=9 한행에서 8번 반복
		
		
//		int i = 1;
//		int dan=2;
//		
//		while(i<=9)
//		{
//
//			dan=2;
//			while(dan<=9) 
//			{
//				System.out.printf(" %d x %d = %2d  ", dan,i,dan*i );
//				dan++;
//			}
//			
//			System.out.println();
//			i++;
//			
//		}
//		
		
		
		
		
		
		
		
		
		
		
		
		
//		
//		 *****
//		 *****
//		 *****
//	     *****

//		
		// i(행증가에 사용하는 변수 ) j(별증가에 사용하는 변수)
		// 0~3                  0-4
		// i = 0 i++ i< 4        j=0,j++,j<5
		
//		int i=0,j=0; // i는 행 j는 별
//		
//		while(i<4)
//		{
//			j=0;
//			while(j<5) {
//				System.out.print("*");
//				j++;
//			}
//			System.out.println();
//			i++;
//		}
		
		
		
		
		
		
		
//		 *
//		 **
//		 ***
//		 ****
		// 내꺼
//		int i=0;
//		String str = " ";
//		while (i<4) {
//			str += "*";
//			
//			System.out.println(str);
//			i++;
//			
//		}
		// 쌤꺼
	  // I     j

//       0    0-0
//       1    0-1
//       2    0-2
//       3    0-3
//
//       ---------
//       
//       i=0    j=0,j++,j<=i
//       i++
//       i<4
		
		
//		int i = 0 ; // 행
//		int j = 0 ; // 별
//		
//		while(i<4)
//		{
//			j=0;
//			while(j<=i) 
//			{
//				System.out.print("*");
//				j++;
//			}
//				
//			System.out.println();
//			i++;
//		}

		
		
//		
//		 높이 : 3
//		 *
//	     **
//		 ***
//		
//		int i = 0 ; // 행
//		int j = 0 ; // 별
//		System.out.print(" 높이 : ");
//		Scanner sc = new Scanner(System.in);
//		int n= sc.nextInt();
//		
//		while(i<n)
//		{
//			j=0;
//			while(j<=i) 
//			{
//				System.out.print("*");
//				j++;
//			}
//				
//			System.out.println();
//			i++;
//		}
		
		
		

//i            j
//0           0-4
//1           0-3
//2           0-2
//3           0-1
//4           0-1
//
//------------
//i=0            j=0
//i++            j++
//i<5            j<=4-i
		
//		
//	     ****
//		 ***
//		 **
//		 *
//		
//		
//		int i = 0;
//		int j = 0;
//		while(i<4) {
//			j =0;
//			while(j<=3-i)
//			{
//				System.out.print("*");
//				j++;
//			}
//			System.out.println();
//			i++;
//		}
//		
//	 높이 : 3
//		 ***
//		 **
//		 *
		
		int i = 0;
		int j = 0;
		
		System.out.print(" 높이 : ");
		Scanner sc = new Scanner(System.in);
		int h= sc.nextInt();
		while(i<h) {
			j =0;
			while(j<=(h-1)-i)
			{
				System.out.print("*");
				j++;
			}
			System.out.println();
			i++;
		}
			
//		
//		
//		
//		      *
//		     ***
//		    *****
//		
//		 높이 : 3
//	       *
//	      ***
//		 *****
//		
//		 *****
//		  ***
//		   *
//		
//	높이 : 3
//		 *****
//		  ***
//		   *
//	
			//--------------- 여기 사이 시험문제 ^^^^^^^^^^^^^^^^^^^^^^
//          *
//		   ***
//		  *****
//		 *******
//		  *****
//		   ***
//		    *
//		
//		
//	 높이 (홀수값) : 3
//		 *
//		***
//		 *
//		
//		 *******
//		  *****
//		   ***
//		    *
//		   ***
//		  *****		
//		 *******		
	}

	private static Object repeat(int i) {
		// TODO Auto-generated method stub
		return null;
	}

}
