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
//		
//		int i = 0;
//		int j = 0;
//		
//		System.out.print(" 높이 : ");
//		Scanner sc = new Scanner(System.in);
//		int h= sc.nextInt();
//		while(i<h) {
//			j =0;
//			while(j<=(h-1)-i)
//			{
//				System.out.print("*");
//				j++;
//			}
//			System.out.println();
//			i++;
//		}
			
//		
//		
//		
//		      *
//		     ***
//		    *****
		
		
		
//		공백이 있어야함
//		i       j(공백)       k(별)
//		0       0-2          0-0
//		1       0-1          0-2
//		2       0-0          0-4
//		3        X           0-6
//
//		----------------------------
//
//		i=0    j=0         k=0             
//		i++    j++         k++
//		i<4    j<=?2-i     k<=? 2*i

//		int i=0; //행
//		int j=0; //공백
//		int k=0; //별
//		while(i<4)
//		{
//			j=0;
//			while(j<=2-i) 
//			{
//				System.out.print(" ");
//				j++;
//				
//			}
//			k=0;
//			while(k<=2*i) 
//			{
//				System.out.print("*");
//				k++;
//			}
//			// 공백을 찍고 나서 별을 찍음
//			System.out.println();
//			i++;
//			
//		}
		
		
		
//		
//		 높이 : 3
//	       *
//	      ***
//		 *****
//		>> 풀이
		
//		높이 : 6 h
//		i       j(공백)       k(별)
//		0       0-4(h-2)     0-0
//		1       0-3(h-2)-1   0-2
//		2       0-2          0-4
//		3       0-1          0-6
//		4       0-0          0-8
//		5        X           0-10 
//		h-1        x         0-(j-1)*2
//		----------------------------
//
//		i=0    j=0         k=0             
//		i++    j++         k++
//		i<6    j<=4-i      k<= 2*i
//		i<h    j<=(h-2)-i  k<= 2*i
		
		
		
//		int i=0; //행
//		int j=0; //공백
//		int k=0; //별
//		
//		System.out.print(" 높이 : ");
//		Scanner sc = new Scanner(System.in);
//		int h = sc.nextInt();
//		while(i<h) 
//					
//		
//		{
//			j=0;
//			while(j<=(h-2)-i) 
//			{
//				System.out.print(" ");
//				j++;
//				
//			}
//			k=0;
//			while(k<=2*i) 
//			{
//				System.out.print("*");
//				k++;
//			}
//			// 공백을 찍고 나서 별을 찍음
//			System.out.println();
//			i++;
//			
//		}
		
		
//		 *****
//		  ***
//		   *
		
		
		
//		int i=0; //행
//		int j=0; //공백
//		int k=0; //별
//		while(i<4)
//		{
//			j=0;
//			while(j<=i) 
//			{
//				System.out.print(" ");
//				j++;
//				
//			}
//			k=0;
//			while(k<=6-(2*i)) 
//			{
//				System.out.print("*");
//				k++;
//			}
//			// 공백을 찍고 나서 별을 찍음
//			System.out.println();
//			i++;
//			
//		}
		
//	높이 : 3
//		 *****
//		  ***
//		   *
		
//		
//		i     j 공백      k 별
//		0     x        0-6
//		1     0-0      0-4
//		2     0-1      0-2
//		3     0-2      0-0
//
//		>> h값을 입력 할 경우 i 마지막 값이 k 값의 2배수
//		h-1            0-(h-1)*2
//		>> 내가 생각한거i<4 j<=2+i k<= 2/i or  
//
//
//
//		------------------
//		i=0   j=0     k=0
//		i++   j++     k++
//		i<4   j<=i-1   K<=6-(2*i)
//
//		i<h   j<=i-1  k<=(h-1)*2-(2*1)

		
//		int i=0; //행
//		int j=0; //공백
//		int k=0; //별
//		
//		Scanner sc= new Scanner(System.in);
//		System.out.print("높이   :  ");
//		int h = sc.nextInt();
//		
//		while(i<h)
//		{
//			j=0;
//			while(j<=i) 
//			{System.out.print(" "); 				j++; 	}
//			k=0;
//			while(k<=(h-1)*2-(2*i)) 
//			{ 				System.out.print("*");  				k++; 			}
//			// 공백을 찍고 나서 별을 찍음
//			System.out.println();
//			i++;
//			
//		}
//		
		
		
		
//	
			//--------------- 여기 사이 시험문제 ^^^^^^^^^^^^^^^^^^^^^^
//          *
//		   ***
//		  *****
//		 *******
//		  *****
//		   ***
//		    *
		


//		 i              j              k
//		 0             0-2            0-0
//		 1             0-1            0-2
//		 2             0-0            0-4
//		 3              x             0-6
//		 ---------------------------------
//		              j=0             k=0
//		              j++             k++
//		              j<=i-1          k<=2*i
//		 ---------------------------------
//		 5             0-0            0-4
//		 4             0-2            0-2
//		 6             0-1            0-0
//		 --------------------------------
//		               j=0            k=0
//		               j++            k++  
//		               J<=i-4         k<=12-2*i
//		int i =0; // 행
//		int j = 0 ; // 공백
//		int k = 0 ; // 별
//		
//		while(i<7) {
//			if(i<4) {
//				// 공백 점점감소
//				j=0;
//				while(j<=2-i) {System.out.print(" "); j++;}
//				k=0;
//				while(k<=2*i) {System.out.print("*"); k++;}
//			}
//			else {
//				//공백 점점증가
//				j=0;
//				while(j<=i-4) {System.out.print(" "); j++;}
//			
//				// 별은 점점감소
//				k=0;
//				while(k<=6*2-2*i) {System.out.print("*");k++;}
//				
//			}
//			System.out.println();
//			i++;
//			
//		}
//		
		
//		
//		
//	 높이 (홀수값) : 3
//		 *
//		***
//		 *
		
		int i = 0;
		int j = 0;
		int k = 0;
		System.out.println("높이 : ");
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		while(i<7)
		{
			if(i<4) {
				
				// 공백 점점감소
				j=0;
				while(j<=2-i) {System.out.print(" "); j++;}
				//별 점점 증가
				k=0;
				while(k<=6*2-2*i) {System.out.print("*"); k++;}
				
				}
			else {
				// 공백(점점증가)
				j=0;
				while(j<=i-(h/2)+1) {System.out.print(" "); j++;}
				//별 점점 감소
				k=0;
				while(k<=(h-1)*2-(2*i)) {System.out.print("*"); k++;}
			}
			System.out.println();
			i++;
			}
				
				
		
				
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
