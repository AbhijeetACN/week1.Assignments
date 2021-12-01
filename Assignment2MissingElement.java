package week1.day2;

public class Assignment2MissingElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		int num1 = 35; //input numbers can be 35,-50,0
		int result = 0;
		
			if (num1<0)
			{
				System.out.println("The number is Negative");
				result = Math.negateExact(num1);
				System.out.println("The number is " +num1 + " and converted to " +result);
			}
			else	if (num1>0)
			{
			
			System.out.println("Number is positive");
			}
			
			else 
				{
				System.out.println("The number is neither positive nor negative");
				}
		
	}

	}
