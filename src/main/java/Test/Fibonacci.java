package Test;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.IntStream.Builder;

/**
 * 问题：
 * 		10级台阶，一次可以走一级或者两级，问总共有多少种走法？
 * 斐波那契数列
 * F(n) = F(n-1) + F(n-2)  
 * F(1) = 1
 * F(2) = 2
 */
public class Fibonacci {  
    private static int getFibo(int i) {  
        if (i == 1)  
            return 1;  
        else if(i == 2)
        	return 2;
        else  
            return getFibo(i - 1) + getFibo(i - 2);  
    }  
    public static void main(String[] args) { 
    	Builder bd= IntStream.builder();
        for (int j = 1; j < 11; j++) {
        	bd.add(getFibo(j));
        }  
        IntStream is = bd.build();
        List<Integer> list = is.boxed().collect(Collectors.toList());
        System.out.println(list);
    }  
  
} 


	
	

