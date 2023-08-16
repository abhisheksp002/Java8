package abhi.leetcode.slidingWindow;

public class SlidingWindowMaxOfGivenSize {
	
	public static void main(String[] args) {
		int[] a= {31,-4,21,2,1,117};
		System.out.println(getMaxSizeOfSubArray(a, 3));
		
	}
	
	
	//find max sum of subarray of size 3
	public static int getMaxSizeOfSubArray(int a[],int windowSize) {
		
		int k = windowSize;
		int wSum = 0;
		int mSum = Integer.MIN_VALUE;
		
		//base condition
		for(int i = 0 ; i< k;i++) {
			wSum = wSum+a[i];
			mSum = Math.max(wSum, mSum);
		}
		
		for(int j=k;j<a.length;j++) {
			wSum = wSum-(a[j-k])+a[j];
			mSum = Math.max(wSum, mSum);
		}
		
		return mSum;
	}

}
