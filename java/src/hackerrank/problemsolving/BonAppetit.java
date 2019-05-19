package hackerrank.problemsolving;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

/**
 * Bon Appetit - https://www.hackerrank.com/challenges/bon-appetit/problem
 *
 * @author Kayla
 * @since 2019-05-17 21:49
 */
public class BonAppetit {
	// Complete the bonAppetit function below.
	static void bonAppetit(List<Integer> bill, int k, int b) {

		bill.remove(k);

		Integer reduce = bill.stream().reduce(0, Integer::sum);
		int gap = b - (reduce / 2);
		System.out.println(gap == 0 ? "Bon Appetit" : gap);
	}

	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

		String[] nk = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

		int n = Integer.parseInt(nk[0]);

		int k = Integer.parseInt(nk[1]);

		List<Integer> bill = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
			.map(Integer::parseInt)
			.collect(toList());

		int b = Integer.parseInt(bufferedReader.readLine().trim());

		bonAppetit(bill, k, b);

		bufferedReader.close();
	}
}
