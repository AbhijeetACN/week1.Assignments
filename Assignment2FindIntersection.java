package week1.day2;

public class Assignment2FindIntersection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	int[] arr1= {3,2,11,4,6,7};
	int[] arr2= {1,2,8,4,9,7};
	
	
	System.out.println("Common values from both the arrays are :" );
	for(int i=0;i<=arr1.length-1;i++)
	{
		for(int j=0;j<=arr2.length-1;j++)
		{
			if(arr1[i]==arr2[j])
			{
				int result = arr1[i];
				System.out.println(result );
				break;
			}
		}
	}
		
		
	}

}
