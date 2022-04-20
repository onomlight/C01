package Ch17;

import java.util.Scanner;

public class C03ArrayMain {

	public static void main(String[] args) {
		//1)
		// 5 int 배열 생성 후
		// 정수값을 각 배열 요소에 차례대로 저장 한 다음
		// 모든 수의 합과 평균을 출력하세요
		
		// 2)
		// 5 int 배열 생성 후
		// 정수값을 각 배열 요소에 차례대로 저장 한 다음
		// 최대값과 최소값을 출력하세요
		
//		Scanner sc =new Scanner(System.in);
//		
//		int [] arr1 = new int [5];
//		arr1[0]=10;
//		arr1[1]=20;
//		arr1[2]=30;
//		arr1[3]=40;
//		arr1[4]=50;
//		float sum=0,avg=0;
//		for(int i=0;i<5;i++) {
//			sum+=i;
//		}
//		avg=sum/5;
//		System.out.println(+sum);
//		System.out.println(+avg);

		
		//스캐너
//		Scanner sc = new Scanner(System.in);
//		// 배열
//		int arr[] = new int[5];
//		//값받기
//		for(int i=0;i<5;i++){
//			System.out.printf("%d 번째 요소 값 : ",i);
//			arr[1] = sc.nextInt();
//					
//		}
//		
//		//합 ,평균
//		int sum=0;double avg=0.0;
//		for(int i=0;i<5;i++) {
//			sum+=arr[i];
//		}
//		avg=(double)sum/arr.length;
//		System.out.printf("합 : %d, 평균 : %f\n", sum,avg);
		
		
		
//		Scanner sc = new Scanner(System.in);
//		// 배열
//		int arr[] = new int[5];
//		//값받기
//		for(int i=0;i<5;i++){
//			System.out.printf("%d 번째 요소 값 : ",i);
//			arr[1] = sc.nextInt();
//	}
//		//최대값 
//		int max=arr[0];
//		int min=arr[0];
//		for(int i=1;i<5;i++){
//			if(max<arr[i]) {
//				max=arr[i];
//				}
//			if(min>arr[i]) {
//				min=arr[i];
//			}
//			System.out.println("최대값 : " + max + "최소값 : " + min);
//			
//		}

		Scanner sc = new Scanner(System.in);
		//배열
		int arr[] = new int[5];
		//값받기
		for(int i=0;i<5;i++) {
			System.out.printf("%d 번째 요소 값 : ",i);
			arr[i] = sc.nextInt();
		}
		//최대값,최소값 구하기
		int max=arr[0];
		int min=arr[0];
		for(int i=1;i<5;i++) {
			if(max<arr[i]) {
				max=arr[i];
			}
			if(min>arr[i]) {
				min=arr[i];
			}	
		}
		System.out.println("최대값 : " + max + " 최소값 : " + min);
}

}