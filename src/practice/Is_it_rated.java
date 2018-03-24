package practice;

import java.util.Scanner;

public class Is_it_rated {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner my=new Scanner(System.in);
		
		int n=my.nextInt();
		int count=0;
		int[][] a=new int[n][2];
		for(int i=0;i<n;i++)
		{
			a[i][0]=my.nextInt();
			a[i][1]=my.nextInt();
			if(a[i][0]!=a[i][1])
			{
				System.out.println("rated");
				System.exit(0);
			}
			
		}
		for(int i=0;i<n-1;i++)
		{
			if(a[i][0]>=a[i+1][0])
			{
				count++;
			}
			
		}
		if(count==n-1)
		{
			System.out.println("maybe");
		}
		else{
			System.out.println("unrated");
		}
		my.close();
	}
	

}