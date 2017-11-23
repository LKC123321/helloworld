package Test;

import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class FibonacciSupplier implements Supplier<Integer>{
	int a = 0;
	int b = 1;
	int c;
	public Integer get() {
		for (int i = 1; i <= 10; i++) {  
			c = a + b;  
			a = b;  
			b = c;  
			return c;
		}
		return get();
		
	}

}
public class Fibonacci2 {
	public static void main(String[] args) {
		Stream<Integer> fibonacci = Stream.generate(new FibonacciSupplier());
		System.out.println(fibonacci.limit(10).collect(Collectors.toList()));
		
	}

}
