//package Ch17;
//
//import java.util.Scanner;
//
//public class C05ArrayMain {
//
//	public static void main(String[] args) {
//		// 문제
//		// 5명의 학생의 국/영/수 점수를 입력받아 출력합니다
//		// 2차원 배열 을 사용합니다
//		// int score[][] = new int[5][3]
//		// 학생별 총점과 평균
//		// 국/영/수 별 총점과 평균도 함께 출력
//		
//		// 출력예
//		// 1 학생 점수입력 (국/영/수 순서) : 100, 70,80
//		// 2 학생 점수 입력 (국/영/수 순서 ) : 99 88 77
//		// 3 학생 점수입력(국/영/수 순서) : 10 20 30
//		// 4 학생 점수 입력(국/영/수 순서) : 100 55 66
//		// 5 학생 점수입력(국/영/수 순서) : 88 77 66
//		int [][]score = new int[5][3];
//		Scanner sc = new Scanner(System.in);
//		for(int i = 0; i<score.length;i++){
//			System.out.printf("%d 학생 점수 입력(국/영/수) : ",(i+1));
//			score[i][0] = sc.nextInt();// i번째 학생의 국어점수 입력
//			score[i][1] = sc.nextInt();// 영
//			score[i][2] = sc.nextInt();// 수
//		}
//		//1 학생 총점 : ? 평균?
//		//2 학생 총점 : ? 평균?
//		//3 학생 총점 : ? 평균?
//		//4 학생 총점 : ? 평균?
//		//5 학생 총점 : ? 평균?
//		
//		// 학생별 총점
//		int [] students = new int[5];
//		double avg=0.0;
//		for(int i=0;i<score.length;i++)	//행이동
//		{
//			for(int j=0;j<score[i].length;j++)//열이동 
//			{
//				students[i]+=score[i][j]; // 학생별 국영수 총점 넣기
//			}
//		}
//		
//		// 국어 총점 : ? 평균 : ?
//		// 영어 총점 : ? 평균 : ?
//		// 수학 총점 : ? 평균 : ? 
//		
//	
//		// Score 결과출력 시작 ------------------
//		System.out.println("국어\t영어\t수학\t총점\t평균");
//		for(int i=0;i<score.length;i++) {
//		System.out.printf("%d\t", i+1);
//		for (int j = 0; j < score.length; j++) {
//			System.out.println(score[i][j]+"\t");
//		}
//		
////		System.out.println(students[i]+"\t"+(double)stundents[i]/3);
////		}
////		System.out.printf("총합\t%d\t%d\t%d\n",subjects[0],subjects[1],subjects[2]);
////		
//		// Score 결과출력 끝 ---------------------
//		
//		
//				//1 학생 총점 : ? 평균?
//				//2 학생 총점 : ? 평균?
//				//3 학생 총점 : ? 평균?
//				//4 학생 총점 : ? 평균?
//				//5 학생 총점 : ? 평균?
//
//		
//		
//		
//				// 국어 총점 : ? 평균 : ?
//				// 영어 총점 : ? 평균 : ?
//				// 수학 총점 : ? 평균 : ? 
//		// 과목 총점 / 평균 
//		int subjects[] = new int[3]; // 과목별 총점 저장 (0:국 . 1: 영 . 2 : 수)
////		for(int i=0;i<score.length;i++)
//		{
//			for(int j=0;j<score[i].length;j++) {
//				subjects[0]+=score[1][0];
//				subjects[1]+=score[1][1];
//				subjects[2]+=score[1][0];
//			}
//			
//			/// 결과출력 -----------
//		}
//		
////			{
////					{100,70,80},
////					{99,88,77},
////					{10,20,30},
////					{100,55,66},
////					{88,77,66}
////					
////			};
//		
//		
//		
//		
////		int num = score.length;
////		int textNum = score[0].length;
////		int sum [] = new int [num];
////		int avg [] = new int [num];
////		int kor = 0;
////		int eng = 0;
////		int math = 0;
////		System.out.println();
////		System.out.println();
////		
////		for(int i = 0; i<num; i++) {
////			for(int j= 0; j < textNum; j ++) {
////				sum[i] += score[i][j];
////			}
////			
////			avg[i]=sum[i]/textNum;
////			
////			
////			System.out.printf("%d번의 학생의 총점 = %d점, 평균 = %d\n\n",i+1,sum[i],avg[i]);
////		}
//
////		 int korTotal = 0;
////	        int engTotal = 0;
////	        int mathTotal = 0;
////	        
////	        int totalSum = 0;
////	        double avg = 0.0;
////	        
////	        System.out.println("번호\t국어\t영어\t수학\t총점\t평균");
////	        System.out.println("--------------------------------------------");
////	        
////	        for (int i = 0; i < score.length; i++) {
////	            int sum = 0;//개인별 총점
////	            double average = 0.0; //개인별 평균
////	            
////	            korTotal += score[i][0]; //국어 점수 누적
////	            engTotal += score[i][1];//영어 점수 누적
////	            mathTotal += score[i][2];//수학 점수 누적
////	            
////	            //번호를 3개 자리를 차지하며 출력시키는 부분
////	            System.out.printf("%3d", (i+1)); //번호 출력
////	            
////	            for (int j = 0; j < score[i].length; j++) {
////	                sum += score[i][j];
////	                System.out.printf("\t%d", score[i][j]);//tap만큼 띄우기
////	                
////	            }
////	            
////	            totalSum += sum;//총합
////	            average = (double)sum/score[i].length;//개인별 평균
////	            avg += average;//전체 평균
////	            System.out.printf("\t%d \t%.2f\n", sum, average);
////	                    
////	            
////	        }
////	        
////	        avg /= (double)score.length;
////	        System.out.println("------------------------------------------------");
////	        System.out.printf("총점\t%d\t%d\t%d\t%d\t%.2f", korTotal, engTotal,mathTotal,totalSum,avg);
//	}
//
//}
