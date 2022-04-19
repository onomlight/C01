package Ch10;

public class test11 {

	public static void main(String[] args) {

		
				String tmp = "12345";
				System.out.println(tmp.length());
				
				int a = Integer.parseInt(tmp);
				
				int num = 12345;
				int end=0;
				int first=0;
				
				end=num%10;
				first=num/10000;
				System.out.println("처음 : " + first); //왼쪽 한자리 추출
				System.out.println("끝 : " + end); //왼쪽 한자리 추출
				
				num= num/10; // 끝한자리 제거
				System.out.println("끝 : " + num);
				
				

			}

		


	}

