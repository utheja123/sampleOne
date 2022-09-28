package practiceprogram;

import java.util.Scanner;

public class Sumofdigitsofnumber {
	static Scanner s=new Scanner(System.in);
	public static void main(String[] args) {
	
		System.out.println("enter n value");
		int n=s.nextInt();
		add(n);
	}
	public static void add(int n)
	{
		int sum=0;
		int count=0;
		do
		{
			count++;
			int rem=n%10;
			sum=sum+rem;
			n=n/10;
			
		}
		while(n!=0);
		if(count!=1)
		{
			System.out.println(sum);
			add(sum);
		}
		
	}

}
