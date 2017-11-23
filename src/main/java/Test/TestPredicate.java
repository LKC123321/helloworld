package Test;

import java.util.function.Predicate;

import entity.People;

public class TestPredicate {

	public static void main(String[] args) {
		People people =  new People();
		people.setId(10);
		people.setName("Bingo");
		people.setSalary(10000.1);
		System.out.println(findMatchPerson(people,p -> p.getId() ==10 ));
		System.out.println(findMatchPerson(people, p -> p.getName().equals("Bingo")));
		System.out.println(findMatchPerson(people, p -> p.getSalary() > 10000.0));
	}
	//判断
	public static boolean findMatchPerson(People p, Predicate<People> peo){
		return peo.test(p);
	}
	
}