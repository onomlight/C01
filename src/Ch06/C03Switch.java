package Ch06;

public class C03Switch {

	public static void main(String[] args) {
		// switch

//		int rank = 1;
//		String medalColor;
//		
//		switch(rank)
//		{
//		case 1: // if(rank==1)
//			medalColor = "금메달";
//			break;
//		case 2: // else if(rank==2)
//			medalColor = "은메달";
//			break;
//		case 3: // else if(rank==3)
//			medalColor = "동메달";
//			break;
//			default: //else
//				medalColor = "없음";
//				
//		}
//		System.out.println("메달 : " + medalColor);

		
		
		
		
		// 02 break 필요성
		int rank = 1;
		String medalColor;
		
		switch(rank)
		{
		case 1: // if(rank==1)
			medalColor = "금메달";

		case 2: // else if(rank==2)
			medalColor = "은메달";

		case 3: // else if(rank==3)
			medalColor = "동메달";

			//else
				medalColor = "없음";
				
		}
	//	System.out.println("메달 : " + medalColor); break 가 업승면 밑에서 부터 내려옴
	}

}
