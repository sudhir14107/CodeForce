import java.util.Scanner;

public class Area {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//this is just sample code
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		double h=in.nextInt();
		double areat=h;
		double area=areat/n;
		double temp=area;
		for(int i=0;i<n-1;i++)
		{
			double length=Math.sqrt(temp*h);
			System.out.println(length+" ");
			
			temp=temp+area;
		}
		

	}

}
