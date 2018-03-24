package practice;

import java.util.Scanner;

public class Palindrome_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		if(n==1)
		{
			System.out.println("a");
		}
		else if(n==2)
		{
			System.out.println("ab");
		}
		else if(n==3)
		{
			System.out.println("aab");
		}
		else{
			char[] a=new char[n];
			a[0]='a';
			a[1]='b';
			for(int i=2;i<n;i++)
			{
				if(a[i-2]=='a')
				{
					a[i]='b';
				}
				if(a[i-2]=='b')
				{
					a[i]='a';
				}
			}
			String s=new String(a);
		    System.out.println(s);
		}
		in.close();

	}

}
