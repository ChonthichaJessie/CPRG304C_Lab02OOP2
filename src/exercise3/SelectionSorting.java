package exercise3;

import java.util.Arrays;

public class SelectionSorting implements Sortable {

	@Override
	public void sort (Integer[] nums) {
		for (int i = 0; i < nums.length; i++) {
			int targetNum = nums[i];
			for (int j=i+1; j<nums.length; j++) {
				if(nums[j]<=targetNum) {
					nums[i] = nums[j];
					nums[j] = targetNum;					
				}
			}
		}
		
	}

	@Override
	public String name() {
		return "Selection sort";
	}

}
