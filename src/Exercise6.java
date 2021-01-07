import java.util.Scanner;
public class Exercise6 {
public static void main(String[]args)
{	int n;
	Scanner sc=new Scanner(System.in);
	n=sc.nextInt();

	calculateDifference(n);
	sc.close();
}

private static int calculateDifference(int n) {
	int sum1=0;
	int sum2=0;
	for(int i=1;i<=n;i++)
	{
		sum1=sum1+(i*i);
	}
	for(int i=1;i<=n;i++)
	{
		sum2=sum2+i;
	} 
	int result=sum1-(sum2*sum2);
	System.out.println(sum1);
	System.out.println(sum2*sum2);
	System.out.println(result);
	return 0;
}
}
