/*Increasing number
author-L.S.Kanishka
*/


import java.util.Scanner;

public class Exercise7 {
public static void main(String[]args)
{	int n;
	Scanner sc=new Scanner(System.in);
	n=sc.nextInt();
	checkNumber(n);
	sc.close();
}

private static int checkNumber(int n) {
	boolean flag=true;
	int current=n%10;
	n=n/10;
	while(n>0)
	{
		if(current<=n%10)
		{
			flag=false;
			break;
		}
		current=n%10;
		n=n/10;
	} 	
	
		System.out.println(flag);
	
	return 0;
}

}
