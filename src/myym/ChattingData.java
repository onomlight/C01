package myym;


import java.io.*;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;




public class ChattingData {
	
	private HashMap<Date, HashMap<String, Integer>> userDataList;

	
	public ChattingData()
	{
		userDataList = new HashMap<Date, HashMap<String, Integer>>();

	}
	
	public ChattingData(String FileName)
	{
		userDataList = new HashMap<Date, HashMap<String, Integer>>();
		Open(FileName);
	}
	
	
	public void Open(String FileName)
	{
		try {
			BufferedReader reader = new BufferedReader(
					new InputStreamReader(new FileInputStream(FileName), "UTF-8"));

			String lineText;
			Date Datadate = null;
			while((lineText = reader.readLine()) != null)
			{
				
				if(lineText.indexOf("---------------") != -1)
				{
					try {
						SimpleDateFormat fomatter = new SimpleDateFormat("--------------- yyyy년 MM월 dd일 EEE ---------------");
						Date parseDate = fomatter.parse(lineText);
						Datadate = parseDate;
						continue;
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
				
				if(Datadate == null)
					continue;
				
				int namePosS = lineText.indexOf("[");
				int namePosE = lineText.indexOf("]");
				if(namePosS == -1 || namePosS == -1)
					continue;
				
				String userName = lineText.substring(namePosS, namePosE + 1);
				
				if(userName.length() > 30)
					continue;
				
				if(this.userDataList.containsKey(Datadate))
				{
					HashMap<String, Integer> Item = new HashMap<String, Integer>(userDataList.get(Datadate));
					
					if(Item.containsKey(userName))
						Item.put(userName, Item.get(userName) + 1);
					else
						Item.put(userName, 0);
					
					this.userDataList.put(Datadate, Item);
				}
				else
				{
					HashMap<String, Integer> Item = new HashMap<String, Integer>();
					Item.put(userName, 0);
					
					this.userDataList.put(Datadate, Item);
				}
				
			}
			
		} catch (FileNotFoundException e) {
            e.getStackTrace();
		} catch (Exception e) {
			e.getStackTrace();
		}
		
		printHash();
	}

	public HashMap<String, Integer> Getdata(Date SDate, Date EDate)
	{
		HashMap<String, Integer> userDataList = new HashMap<String, Integer>();
		
		for(Date DataDate : this.userDataList.keySet())
		{
			if(DataDate.before(SDate) || DataDate.after(EDate))
				continue;

			for(String userName : this.userDataList.get(DataDate).keySet())
			{
				if(userDataList.containsKey(userName))
				{
					userDataList.put(userName, userDataList.get(userName) + this.userDataList.get(DataDate).get(userName));
				}
				else
				{
					userDataList.put(userName, this.userDataList.get(DataDate).get(userName));
				}
			}
		}
		
		return userDataList;
	}
	
	private void printHash()
	{
		SimpleDateFormat fomatter = new SimpleDateFormat("yyyy년 MM월 dd일 EEE");
		
		
		for(Date DataDate : userDataList.keySet())
		{
			System.out.println(fomatter.format(DataDate));
			for(String userName : userDataList.get(DataDate).keySet())
			{
				System.out.printf("%s : 개수 : %d\n", userName, userDataList.get(DataDate).get(userName));
			}
		}
//		for( : userDataList.keySet() )
//		{
//			
//		}
//		
//		while(.hasNext())
//		{
//			while()
//			{
//				
//			}
//		}
//		this.userDataList;
	}
	
//	public HashMap<String, Integer> GetUserList()
//	{
//		return userDataList;
//	}
	
	public int GetChatCount(String m_UserName)
	{
//		for(String userName : userDataList)
//		{
//			m_UserName.equals(userName);
//		}
		
		return 1;
	}
}
