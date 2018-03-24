import java.util.Scanner;

public class BankRob {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		int a=in.nextInt();
		int b=in.nextInt();
		int c=in.nextInt();
		int n=in.nextInt();
		int t,x=0;
		for(int i=0;i<n;i++)
		{
			t=in.nextInt();
			if(t>b && t<c)
				x++;
		}
		
		System.out.println(x);
		in.close();
	}

}
