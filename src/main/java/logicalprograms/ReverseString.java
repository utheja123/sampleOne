package logicalprograms;
import java.util.*;

public class ReverseString {
	public static void main(String[] args) {
		String str="theja";
		char [] a=str.toCharArray();
		for(int i=a.length-1;i>=0;i--)
		{
			System.out.print(a[i]+"" );
		}
	}

}
