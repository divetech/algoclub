package leetcode.recursion;

/**
 * @author baekdev
 * @since 2020-03-21
 * https://baek.dev
 */
public class PrincipleOfRecursion {
	public void reverseString(char[] s) {
		System.out.println(s);
		helper(s.length - 1, s);
	}

	private static void helper(int index, char[] s) {
		if (s == null || index < 0) {
			return;
		}
		System.out.print(s[index]);
		helper(index - 1, s);
	}

	public static void main(String[] args) {
		final PrincipleOfRecursion solution = new PrincipleOfRecursion();
		solution.reverseString("hello".toCharArray());
		System.out.println();
	}
}
