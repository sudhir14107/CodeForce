package practice;

import java.util.Scanner;

public class Fake_Np {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		int l=in.nextInt();
		int r=in.nextInt();
		int sub=r-l-1;
		if((l+1==r)||(l+2==r) || ((l%2==0) && (r%2==0)))
		{
			System.out.println("2");
			System.exit(0);
		}
		
		else if((l%3==0) && (r%3==0) && sub<=2)
		{
			System.out.println("3");
			System.exit(0);
		}
		else if((l==r) &&  ((l%2!=0) && (r%2!=0)))
		{
			System.out.println(l);
			System.exit(0);
		}
		else
		{
			System.out.println("2");
			System.exit(0);	
		}
		in.close();
	}

}
