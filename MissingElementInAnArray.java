package week1.day2;

import java.util.Arrays;

public class MissingElementInAnArray {
	
	public static void main(String[] args) {
		
		
		int[] arr= {1,2,3,4,7,6,8};
		Arrays.sort(arr);
		int sum=0;
		
		for (int i=0; i<arr.length; i++)
		{
			sum=sum+arr[i];
			
		}
		int sum1=0;
		
			for (int j=1; j<=8; j++)
			{
				
				sum1=sum1+j;
			}
			
			System.out.println("The missing Element is   " +(sum1-sum));
		}
			
}