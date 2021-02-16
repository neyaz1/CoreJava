package brahman.function_pack;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateFunctionExample {
	public static void main(String[] args) {
		Predicate<Integer> positive = i -> i > 0;
		List<Integer> integerList = Arrays.asList(new Integer(1), new Integer(10), new Integer(200), new Integer(101),
				new Integer(-10), new Integer(0));
		filterList(integerList, positive);
	}

	public static List<Integer> filterList(List<Integer> listOfIntegers, Predicate<Integer> predicate) {
		List<Integer> filteredList = new ArrayList<Integer>();
		for (Integer integer : listOfIntegers) {
			if (predicate.test(integer)) {
				filteredList.add(integer);
			}
		}
		return filteredList;
	}
}
