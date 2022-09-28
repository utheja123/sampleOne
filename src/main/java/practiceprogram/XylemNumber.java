package practiceprogram;

import java.util.Scanner;

public class XylemNumber {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter your number");
		int n=s.nextInt();
		int temp=n;
		int rem=n%10,res=0,sum=0;
		n=n/10;
		while(n>9)
		{
		 res=n%10;
		 sum=sum+res;
		 n=n/10;
		 
		}
		int result=n+rem;
		if(result==sum)
		{
			System.out.println(temp+"is xylem number");
		}
		else
		{
			System.out.println(temp+"is pholem number");
		}
	}

}
