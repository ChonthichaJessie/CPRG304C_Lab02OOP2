package exercise3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;

public class Driver
{

	public static final int SIZE = 5;
	public static final int UPPER_BOUND = 1000;

	private static Integer[] randomInts() {
		Integer[] nums = new Integer[SIZE];
		Random rand = new Random();
		

		for( int i = 0; i < SIZE; i++ )
		{
			nums[i] = rand.nextInt( UPPER_BOUND );
			System.out.println( nums[i] );
		}
		return nums;

	}
	
	public static void main( String[] args )
	{
		Integer[] nums = randomInts();

		Map<String, Sortable> algorithms = new HashMap<>();
		algorithms.put("q", new QuickSorting());
		algorithms.put("b", new BubbleSorting());
		algorithms.put("i", new InsertionSorting());
		algorithms.put("s", new SelectionSorting());
		
		try (Scanner collectSortingOption = new Scanner(System.in)) {
			System.out.println("\nSelect sorting option\n");
			for (String i : algorithms.keySet()) {
				System.out.println(algorithms.get(i).name()+"; enter "+i);
			}

			String optionSort = collectSortingOption.nextLine();
			
			
			if (algorithms.containsKey(optionSort)) {
				Sortable algo = algorithms.get(optionSort);
				System.out.println(algo.name()+" result:");
				algo.sort(nums);
				System.out.println(Arrays.toString(nums));
			} else {
				System.out.println("Don't know that algorithm.");
			}
		}
		
		
	}

}
