package abhi.leetcode;

public class IsomorphicString {

	public static void main(String[] args) {
		System.out.println(isIsomorphic("egg", "add"));
	}

	public static boolean isIsomorphic(String s, String t) {

		for (int index = 0; index < s.length(); index++) {
			if (s.indexOf(s.charAt(index) + "") != s.lastIndexOf(s.charAt(index) + "")) {
				s = s.replaceAll(s.charAt(index) + "",String.valueOf(index));
			}
			if (t.indexOf(t.charAt(index) + "") != t.lastIndexOf(t.charAt(index) + "")) {
				t = t.replaceAll(t.charAt(index) + "", String.valueOf(index));
			}
		}
		
		System.out.println(s + "----" + t);


		for (int i = 0; i < s.length(); i++) {
			
			try {
				if(Integer.valueOf(s.charAt(i)) != Integer.valueOf(t.charAt(i))) {
					return false;
				}
			} catch (Exception e) {
		}
			
		}
		return true;
	}

	private static void replaceAllRepected(int index, String s, String t) {

	}

}
