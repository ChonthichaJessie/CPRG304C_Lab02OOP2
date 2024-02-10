package exercise2;

import java.util.Random;
import java.util.Arrays;


public class Driver 
{

	public static final int SIZE = 100;
	public static final int UPPER_BOUND = 10;
	
	private static int binarySearch(Integer[] numbers, int target) {
		
		int bottom = 0;
		int top = numbers.length-1;
		
		while (top-bottom >= 0 ) {
			
			int middle = bottom+(top-bottom)/2;
			int middleValue = numbers[middle];
			
			if(middleValue > target) {
				top = middle-1;
			}
			else if(middleValue < target) {
				bottom = middle+1;
			}
			else {
				System.out.println( middle );
				return middle;
			}
			
		}
		System.out.println( -1 );
		return -1;
	}
	

	public static void main( String[] args ) 
	{

		Integer[] nums = new Integer[SIZE];
		Random rand = new Random();
		int randnum = rand.nextInt( UPPER_BOUND );
		nums[0] = randnum;
		

		for( int i = 1; i < SIZE; i++ )
		{
			randnum = rand.nextInt( UPPER_BOUND );
			nums[i] = nums[i - 1] + randnum;
			System.out.println( nums[i] );
		}
		
		//Integer[] numbers = new Integer[] {1,2,3,4,400};
		
		binarySearch(nums, 0);
		
		
		

	}





}
