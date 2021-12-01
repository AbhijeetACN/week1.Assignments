package week1.day2;

public class Assignment3Palindrom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String str1 = "madam";
		String reverse = "";
		char temp;

		for (int i = 0; i < str1.length(); i++) {
			temp = str1.charAt(i); // extracts each character
			reverse = temp+reverse;
		}
		System.out.println("Original Value :" + str1);
		System.out.println("Reversed Value :" + reverse);
		
		if(reverse.equals(str1))
		{
			System.out.println("It's a palindrome");	
		}
		else {
			System.out.println("It's not a palindrome");	
		}
			
		
			}

}
