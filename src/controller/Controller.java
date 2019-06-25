package controller;

public class Controller
{
	
	
	public Controller()
	{
		
	}
	
	
	
	public void start()
	{
		
		
		System.out.println(getBitCount(1, getNumAsBit(1250)));
	}
	
	private Long getNumAsBit(int num)
	{
		String bitNum = "";
		
		bitNum = Integer.toBinaryString(num);
		
		return Long.valueOf(bitNum);
	}
	
	
	
	private int getBitCount(int bitToFind, Long numAsBit)
	{
		
		assert bitToFind <= 1 && bitToFind >=0;
		
		int count = 0;
		int size = String.valueOf(numAsBit).length();
		
		int i = 0;
		while(i < size)
		{
			if(numAsBit % 10 == bitToFind)
			{
				count++;
			}
			
			numAsBit /= 10;
			
			i++;
		}
		
		return count;
	}
	
	
	
	
}
