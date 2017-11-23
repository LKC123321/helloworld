package Test;

import java.util.List;
import java.util.function.Function;

import entity.People;

public class TestFunction {

	public static <T> int numSum(List<T> entries, Function<T, Integer> f) {
		int sum = 0;
		for (T entry: entries) {
			sum += f.apply(entry);
		}
		return sum;
	}
	public static void main(String[] args) {
		People people = new People();
		people.setSalary(10000.0);
	}
}
