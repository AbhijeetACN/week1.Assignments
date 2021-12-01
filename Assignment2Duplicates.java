package week1.day2;

public class Assignment2Duplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
	int[] arr = {14,12,13,11,17,14,18,16,17,19,18,17,20};
	
	int lenarr=arr.length;
	//Duplicates are 14,17
	int count =0;
	
	//System.out.println("Duplicates values  are :" );
	for(int i=0;i<=lenarr-1;i++)
	{
	
		
	count=1;	
		for(int j=i+1;j<=lenarr-1;j++)
		{
			if(arr[i]==arr[j])
			{
				
				count=count+1;
				
				System.out.println("Array member " + arr[i] + " is populated :"+count);
				break;
			
			}
		
			
		
		}
		
	}
		
		
	}

}
