package hackerrank.problemsolving;

import java.io.IOException;
import java.util.Scanner;

/**
 *  Hackerrank - A Very Big Sum
 *  https://www.hackerrank.com/challenges/a-very-big-sum/problem
 *
 * @author Kayla
 * @since 2019-04-15 20:23
 */
public class AVeryBigSum {

	// Complete the aVeryBigSum function below.
	private static long aVeryBigSum(long[] ar) {

		long result = 0L;
		for ( long item : ar ) {
			result += item;
		}
		return result;

	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {

		int arCount = scanner.nextInt();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		long[] ar = new long[arCount];

		String[] arItems = scanner.nextLine().split(" ");

		for (int i = 0; i < arCount; i++) {
			long arItem = Long.parseLong(arItems[i]);
			ar[i] = arItem;
		}

		System.out.println(aVeryBigSum(ar));
	}
}
