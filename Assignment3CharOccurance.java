package week1.day2;

import java.util.Arrays;

public class Assignment3CharOccurance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = {1,3,4,2,6};
		Arrays.sort(arr);
		
		for(int i=1;i<=arr.length;i++)
		{
		if(i!=arr[i-1])
		{
			System.out.println(i);
		}
			
		}
	}
			

}
