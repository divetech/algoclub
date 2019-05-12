package programmers;

/**
 * 프로그래머스 - 올바른 괄호
 *
 */
public class Lessons12909 {

	public static void main(String[] args) {

		System.out.println("false => " + solution("()())("));
		System.out.println("true => " + solution("()()()"));
		System.out.println("true => " + solution("(()())"));
		System.out.println("false => " + solution("(()()))"));
		System.out.println("false => " + solution("(()()))("));
	}

	public static boolean solution(String s) {

		char open = '(';
		char close = ')';

		int count = 0;

		for (int k = 0, len = s.length(); k < len; k++) {
			if (s.charAt(k) == open) {
				count++;
			} else if (s.charAt(k) == close) {
				if (count <= 0) {
					return false;
				} else {
					count--;
				}
			}
		}

		return count == 0;

	}

}
