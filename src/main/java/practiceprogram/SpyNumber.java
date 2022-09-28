package practiceprogram;

import java.util.Scanner;

public class SpyNumber {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter any number");
		int n=s.nextInt();
		int temp=n;
		int rem,sum=0,prod=1;
		while(n!=0)
		{
			rem=n%10;
			sum=sum+rem;
			prod=prod*rem;
			n=n/10;
		}
		if(sum==prod)
		{
			System.out.println(temp+"is a spy number");
		}
		else
		{
			System.out.println(temp+"is not a spy number");
		}
		
		
	}

}
