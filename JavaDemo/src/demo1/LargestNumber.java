package demo1;

public class LargestNumber {
	 
	public static void main(String[] args) {
		
		int num1 = 15;
		int num2 = 11;
		int num3 = 90;
		
		if(num1 > num2 && num1 > num3)
		{
			System.out.println(num1 + " is the Largest Number");
		}
		
		else if(num2 > num3)
		{
			System.out.println(num2 + " is the Largest Number");
		}
		
		else
		{
			System.out.println(num3 + " is the Largest Number");
		}
 
	}
 
}