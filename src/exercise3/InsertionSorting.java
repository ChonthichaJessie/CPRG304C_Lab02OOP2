package exercise3;

import java.util.Arrays;

public class InsertionSorting implements Sortable {
	public void sort(Integer[] nums) {
		for (int i = 1; i < nums.length; i++) {
			int current = nums[i];
			int j = i - 1;
			while (j >= 0 && nums[j] > current) {
				nums[j + 1] = nums[j];
				j--;
			}
			nums[j + 1] = current;
		}
	}

	@Override
	public String name() {
		return "Insertion sort";
	}

}
