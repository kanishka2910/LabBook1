import java.util.Scanner;
public class Exercise5 {
	public static void main(String[]args)
{
		
 int n;
 
 Scanner sc = new Scanner(System.in);
 
 n=sc.nextInt();
 calculateSum(n);
 
 sc.close();
}

	private static int calculateSum(int n) {
		int sum=0;
		for (int i=0;i<=n;i++)
		 {
			 if(i%3==0||i%5==0)
			 {
				 sum=sum+i;
			 }
		 }
		 System.out.println(sum);
		 return 0;
		
	}
}
