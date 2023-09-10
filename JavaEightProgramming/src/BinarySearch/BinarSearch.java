package BinarySearch;

public class BinarSearch {

	public static void main(String[] args) {
		int arr[] = { 23, 25, 26, 27, 28, 29 };

		System.out.println("=" + binarySearch(arr, 22));
	}

	public static int binarySearch(int arr[], int target) {

		int low = 0, high = arr.length - 1;

		while (low <= high) {
			
			int mid = (low + high) / 2;
			
			if (target == arr[mid]) {
				return mid;
			} else if (target > arr[mid]) {
				low = mid + 1;
			} else {
				high = mid - 1;
			}

		}

		return -1;

	}

}
