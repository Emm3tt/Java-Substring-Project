
public class ReverseString 

{
	
	
	public String reverseString(String s)
	
	{
		
		String temp = "";
		int length = s.length();
		
		
		
		for(int i = length;i>0;i--)
		{
			
			temp += s.substring(i-1,i);			
		}
		
		return temp;
		
		
	}
	

	
	public boolean substringExist(String s,String sub)
	
	{
		
		int subLength = sub.length();
		int length = s.length();
		
		if(subLength>length)
			
		{
			
			return false;
			
		}
		
		else
			
		{
			
			int x = length- subLength;
			
			int i = 0;
			
			while(i<=x)
				
			{
				
				String tempSubstring = s.substring(i,i+subLength);
				
				if(tempSubstring.equals(sub))
					
				{
					
					return true;
					
				}
				
				i++;
			}
			
		}
		
		return false;
		
	}
	
	public boolean isPalendrome(String s)
	
	{
		
		return s.compareTo(reverseString(s)) == 0;
		
	}
	
	
	public int factorial(int x)
	
	{
		
		if(x == 1)
			return 1;
		
		return x * factorial(x-1);
	
	}
	
	public int fib(int x)
	
	{
		
		if(x == 1|| x == 0)
			return 1;
		
		return fib(x -1 ) + fib(x - 2);
	
	}

}
	



