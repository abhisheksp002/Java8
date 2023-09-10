package BinarySearch;

/**
 * Given a sorted array of distinct integers and a target value, return the
 * index if the target is found. If not, return the index where it would be if
 * it were inserted in order.
 * 
 * Input: nums = [1,3,5,6], target = 2 ,Output: 1
 * Input: nums = [1,3,5,6], target = 7 ,Output: 4
 * 
 * hint sorted---> log n time complexity
 * 
 * @author abhishek.kumar2
 *
 */
public class SearchIndexPos {

	public static void main(String[] args) {
		int nums[] = {1,2,5,6};
		int target = 7;
		
		System.out.println(searchInsert(nums, target));
	}

	public static int searchInsert(int[] nums, int target) {

		int low = 0;
		int high = nums.length - 1;

		while (low <= high) {
			int mid = (low + high) / 2;

			if (target == nums[mid]) {
				return mid;
			}
			else if(target > nums[mid]) {
				low = mid+1;
			}
			else {
				high = mid-1;
			}
		}

		return low;
	}

}
