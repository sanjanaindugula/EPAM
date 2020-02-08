package chocolate;
import java.util.*;
public class Cc1 {
		public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("No. of chocolates in gift box:");
		int c=sc.nextInt();
		int[] a=new int[c];
		for(int i=0;i<c;i++)
		{
			System.out.print("Enter the weight of chocolate:");
			a[i]=sc.nextInt();
		}
		Cc3 c1=new Cc3();
		int chocototal=c1.totalweight(a,c);
		System.out.print("No. of sweets in gift box:");
		int s=sc.nextInt();
		int[] sweet=new int[s];
		for(int i=0;i<s;i++)
		{
			System.out.print("Enter the weight of sweet:");
			sweet[i]=sc.nextInt();
		}
		Cc4 s1=new Cc4();
		int sweettotal=s1.totalweight(a,c);
		System.out.print("minimum weight of candy:");
		int low=sc.nextInt();
		System.out.print("maximum weight of the candy:");
		int high=sc.nextInt();
		int num_of_choco=c1.numofcandy(low,high,a,c);
		int num_of_sweets=s1.numofcandy(low,high,sweet,s);
		int total_candy=num_of_choco+num_of_sweets;
		if(total_candy>=1)
			System.out.print("You have "+total_candy+" candies");
		else
			System.out.print("Oops!!!You did not recieved any candies.");
		sc.close();
	}
	}