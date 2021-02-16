package short_circuiting_operations;

import java.util.Arrays;
import java.util.stream.IntStream;

public class LimitExample {
	public static void main(String[] args) {
		int[] ints = { 1, 2, 3, 4, 5, 6 };
		System.out.printf("Source: %s%n", Arrays.toString(ints));
		System.out.println("Finding even numbers.");

		runWithoutLimit(Arrays.stream(ints));
		runWithLimit(Arrays.stream(ints));
	}

	private static void runWithoutLimit(IntStream stream) {
		System.out.println("Running without limit()");
		stream.filter(i -> i % 2 == 0).forEach(System.out::println);
	}

	private static void runWithLimit(IntStream stream) {
		System.out.println("Running with limit(2)");
		stream.filter(i -> i % 2 == 0).limit(2).forEach(System.out::println);
	}
}
