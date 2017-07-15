
public class Main 

{

	public static void main(String[] args) 
	{
		ReverseString string = 
				new ReverseString();
		
		string.reverseString("hi");
		System.out.println(string.reverseString("vainglory"
				+ ""));
		
	
		System.out.println(string.substringExist("vainglory", "vain"));
		System.out.println(string.isPalendrome("mom"));
		
	
		System.out.println(string.factorial(5));

		System.out.println(string.fib(45));
		
	}
	
}