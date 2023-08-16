package abhi.leetcode.RotatedArray;

public class SearchInRoatedArray {

	public static void main(String[] args) {

	}

	public int search(int[] a, int target) {

		int l = 0;
		int m = 0;
		int h = a.length - 1;

		while (l <= h) {
			m = (l + h) / 2;

			if (a[m] == target)
				return m;

			// identify left sorted array
			else if (a[l] <= a[m]) {

				if (target >= a[l] && target < a[m])
					h = m - 1;
				else
					l = m + 1;

			}

			else {
				if (target > a[m] && target <= a[h])
					l = m + 1;
				else
					h = m - 1;
			}
		}

		return -1;

	}

}
