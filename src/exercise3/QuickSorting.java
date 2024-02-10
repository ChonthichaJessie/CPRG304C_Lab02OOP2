package exercise3;

public class QuickSorting implements Sortable {

	public void sort(Integer[] nums ) {
		sort(nums, 0, nums.length-1);
	}
	
	private void sort(Integer[] nums, int begin, int end ) {

		if (begin < end) {
			int partitionIndex = partition(nums, begin, end);

			sort(nums, begin, partitionIndex-1);
			sort(nums, partitionIndex+1, end);
		}

	}

	private int partition(Integer[] nums, int begin, int end) {
		int pivot = nums[end];
		int i = (begin - 1);

		for (int j = begin; j < end; j++) {
			if (nums[j] <= pivot) {
				i++;

				int swapTemp = nums[i];
				nums[i] = nums[j];
				nums[j] = swapTemp;
			}
		}

		int swapTemp = nums[i + 1];
		nums[i + 1] = nums[end];
		nums[end] = swapTemp;

		return i + 1;
	}

	@Override
	public String name() {
		return "Quick sort";
	}


}
