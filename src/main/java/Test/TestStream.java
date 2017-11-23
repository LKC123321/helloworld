package Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class TestStream {
	public static void main(String[] args) {
		List<String> list = new  ArrayList<>();
		int[] arr = {1,2,3,4};
		list.add("one");
		list.add("two");
		//1
		//Stream stream = list.stream();
		//2
		Stream stream = Stream.of(list);
		//3
		//IntStream intstream= Arrays.stream(arr);
		//4
		//Stream.of("a","b","c");
		//5
		Stream.generate(Math::random);
		//6
		System.out.println(Stream.generate(Math::random));
		System.out.println(Stream.generate(Math::random) instanceof Stream);
		
		
	}
	
}
