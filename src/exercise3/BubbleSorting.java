package exercise3;

import java.util.Arrays;

public class BubbleSorting implements Sortable {
	public void sort(Integer[] nums) {
		for (int i = 0; i < nums.length; i++) {
			for (int j = 1; j < nums.length; j++) {
				if (nums[j] < nums[j - 1]) {
					int targetNum = nums[j];
					nums[j] = nums[j - 1];
					nums[j - 1] = targetNum;
				}
			}
		}
	}

	@Override
	public String name() {
		return "Bubble sort";
	}

}
