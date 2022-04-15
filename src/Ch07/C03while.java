package Ch07;

import java.util.Scanner;

public class C03while {

	public static void main(String[] args) {
		// break, continue
		
		
		//break
		// -1을 입력하기 전까지 수를 계속입력 받아 입력된 수의 합을 출력
		
//		Scanner sc = new Scanner(System.in);
//		int tmp = 0; //키보드로 값을 받아야하기때문에  임시 저장 변수만듬\
//		long sum = 0L; // 누적용 변수
//		
//		while(true) {
//			System.out.print("입력(-1:종료) : ");
//			tmp = sc.nextInt();
//			if(tmp==-1) {
//				break;//가장가까이있는 반복문 탈출
//			}
//			sum+=tmp; // sum=sum+tmp;
//		}
//
//		System.out.println("총합 : " + sum);
		
		
		//중첩 while 문 벗어나기(break) // 가로 구구단
		// 7 x 7 = 49 부터 벗어나고싶어함
//		int dan=2;
//		int i = 1;
//		boolean flag=false; // 값을 하나 더 추가
//		while(dan<=9) //
//		
//		{i=1; 			while(i<=9) 
//			{
//			System.out.printf("%d x %d = %d\n", dan,i,(dan*i));	
//			if(dan==7&&i==7) {
//			// 여기까지만 적을경우 7*7까지 유지되고 8*1부터 시작됨
//				flag = true;
//				break;
//			}
//			i++;	
//			
//			}
//		if(flag==true) {
//			break;
//		}
//		System.out.println(); 		dan++;
//		
		
		
//    }

		
		//Continue
		
		// 1~10까지 수중의 3의 배수는 제외하고 출력
		
		int i=00;
		while(i<=10) {
			if(i%3==0) {
				i++; // 컨티뉴 앞에다가 값증가 해야함
				continue;
			} // 지속 반복하는것  , 현재 반복하고있는 반복문의 조건식을 반복함
			System.out.println(" i = " + i );
			i++;
		}
	}

}
