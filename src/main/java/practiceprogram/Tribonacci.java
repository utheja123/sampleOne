package practiceprogram;

import java.util.ArrayList;

public class Tribonacci {
	public static void main(String[] args) {
		int n1=0;
		int n2=1;
		int n3=1;
		int n4=n1+n2+n3;
		ArrayList al=new ArrayList();
		al.add(n1);
		al.add(n2);
		al.add(n3);
		for(int i=4;i<=15;i++)
		{
			al.add(n4);
			n1=n2;
			n2=n3;
			n3=n4;
			n4=n1+n2+n3;
		}
		System.out.println(al);
	}

}
