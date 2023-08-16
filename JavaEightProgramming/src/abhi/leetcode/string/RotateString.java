package abhi.leetcode.string;

import java.util.LinkedList;
import java.util.Queue;

public class RotateString {

	public static void main(String[] args) {

		System.out.println(rotateString("abcde", "cdeab"));
	}

	public static boolean rotateString(String s, String goal) {

		char[] ch = s.toCharArray();

		Queue<String> str_queue = new LinkedList<>(); // a->b->c->d->e

		for (int i = 0; i < s.length(); i++) {
			str_queue.add(ch[i] + "");

		}

		for (int i = 0; i < s.length(); i++) {
			String qv = str_queue.poll();
			str_queue.add(qv);
			if (goal.equalsIgnoreCase(str_queue.parallelStream().reduce((a, b) -> a + b).get().toString())) {
				return true;
			}
		}

		return false;
	}

}
