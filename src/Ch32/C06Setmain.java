package Ch32;

import java.util.*;

public class C06Setmain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 난수 만들기
//		Random rand = new Random();
//		while(true) {
//			System.out.println(rand.nextInt(45));
//			try {
//				Thread.sleep(500);
//			}catch(InterruptedException e){
//				e.printStackTrace();
				
//			}
//		}
		
		// 로또 만들기
		// set을 이용해서 6자리 난수를 넣어줍니다
		// 1-45까지 입니다
		// 저장된 난수는 정렬상관없습니다(조금있다가 정렬해보조)
		// 숫자 중복안되게 셋 

			Random rand = new Random();
			Set<Integer> lotto = new HashSet();
			while(lotto.size()<7)
			{
				lotto.add(rand.nextInt(45)+1);
			}
				Iterator<Integer> iter = lotto.iterator();
				while(iter.hasNext()) {
					System.out.print(iter.next()+" ");
				}
				System.out.println();
	
				// 정령
				List <Integer> list = new ArrayList(lotto);
				Collections.sort(list); // 오름차순 정령
				
				for(int num : list) {
					System.out.print(num + " ");
				}
				System.out.println();
				Collections.sort(list,Collections.reverseOrder()); // 오름차순 정령

				for(int num : list) {
					System.out.print(num + " ");
				}
				
	}

	
}
