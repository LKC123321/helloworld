package Test;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import entity.Student;

/**
 * 定义一个student类，至少包含编号，姓名，成绩三个属性
 * 
 * 创建50个学生实例，成绩采用赋分制，每个学生的成绩只有100,95,90,85,80,75,70,60这几种
 * 
 * 用stream和lambda表达式实现按学生成绩分组统计，统计的结果包括：
 * 每种分数总共多少学生，并输出学生的姓名和编号
 */
public class StudentScoreTotal {
	public static void main(String[] args) {
		//创建list集合
		List<Student> list = new ArrayList<>();
		//for循环遍历创建对象
		for(int i=0;i < 50; i++) {
			list.add(new Student(i,"StuName"+i,(int)(Math.round(Math.random()*8)*5+60)));
		}
		//判断输出
		List<Student> list1 = judgeScore(list, stu -> stu.getScore() == 60);
		List<Student> list2 = judgeScore(list, stu -> stu.getScore() == 65);
		List<Student> list3 = judgeScore(list, stu -> stu.getScore() == 70);
		List<Student> list4 = judgeScore(list, stu -> stu.getScore() == 75);
		List<Student> list5 = judgeScore(list, stu -> stu.getScore() == 80);
		List<Student> list6 = judgeScore(list, stu -> stu.getScore() == 85);
		List<Student> list7 = judgeScore(list, stu -> stu.getScore() == 90);
		List<Student> list8 = judgeScore(list, stu -> stu.getScore() == 95);
		List<Student> list9 = judgeScore(list, stu -> stu.getScore() == 100);
		System.out.println("60分的有"+list1.size()+"人，分别是：");
		System.out.println(list1);
		System.out.println("65分的有"+list2.size()+"人，分别是：");
		System.out.println(list2);
		System.out.println("70分的有"+list3.size()+"人，分别是：");
		System.out.println(list3);
		System.out.println("75分的有"+list4.size()+"人，分别是：");
		System.out.println(list4);
		System.out.println("80分的有"+list5.size()+"人，分别是：");
		System.out.println(list5);
		System.out.println("85分的有"+list6.size()+"人，分别是：");
		System.out.println(list6);
		System.out.println("90分的有"+list7.size()+"人，分别是：");
		System.out.println(list7);
		System.out.println("95分的有"+list8.size()+"人，分别是：");
		System.out.println(list8);
		System.out.println("100分的有"+list9.size()+"人，分别是：");
		System.out.println(list9);
		
	}
	
	public static<T> List<T> judgeScore(List<T> list,Predicate<T> p){
		return list.stream().filter(p).collect(Collectors.toList());
		
	}
}
