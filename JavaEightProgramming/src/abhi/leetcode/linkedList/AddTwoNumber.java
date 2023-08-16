package abhi.leetcode.linkedList;

public class AddTwoNumber {

	public static int carry=0;
	
	public static void main(String[] args) {
		ListNode l1 = new ListNode(9);
		ListNode l2 = new ListNode(9);
		ListNode l3 = new ListNode(9);
		ListNode l4 = new ListNode(9);
		ListNode l5 = new ListNode(9);
		ListNode l6 = new ListNode(9);
		ListNode l7 = new ListNode(9);

		l1.next = l2;
		l2.next = l3;
		l3.next = l4;
		l4.next = l5;
		l5.next = l6;
		l6.next = l7;
		
		ListNode ll1 = new ListNode(9);
		ListNode ll2 = new ListNode(9);
		ListNode ll3 = new ListNode(9);
		ListNode ll4 = new ListNode(9);

		
		ll1.next = ll2;
		ll2.next = ll3;
		ll3.next = ll4;

		
		addTwoNumbers(l1, ll1);
		
	}

	public static ListNode addTwoNumbers(ListNode ll1, ListNode ll2) {
		int nextCarry = 0;
		while(ll1 != null || ll2 != null) {
			int sum = ll1.data + ((ll2 != null)?ll2.data:0);

			int tempSum = getSum(sum);
			System.out.println(tempSum+nextCarry);
			nextCarry = claculateCarry(sum);
			
			ll1= ll1.next;
			ll2= ll2.next;

		}
		

		return null;

	}

	private static int getSum(int sum) {
		return sum>=10?sum-10:sum;
	}

	private static Integer claculateCarry(int sum) {
		if(sum>=10) {
		String s = String.valueOf(sum);
		return Integer.valueOf(s.substring(0, 1));
		}
		else {
			return 0;
		}
	}

}
