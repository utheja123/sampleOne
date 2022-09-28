package logicalprograms;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StuMany {
	public static void main(String[] args) {
		Stu s=new Stu(1,"teja",89);
		Stu s1=new Stu(2,"theja",95);
		Stu s3=new Stu(3,"uteja",78);
		List<Stu> al=new ArrayList<Stu>();
		al.add(s);
		al.add(s1);
		al.add(s3);
		//get stu where marks>80
		//al.stream().filter(a->a.getMarks()>80).forEach(a-> System.out.println(a));
		al.stream().forEach(s4->System.out.println(s4));
		List<Stu> list=al.stream().filter(a->a.getMarks()>80).collect(Collectors.toList());
		System.out.println(list);
	}

}
