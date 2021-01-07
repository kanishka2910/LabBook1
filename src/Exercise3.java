public class Exercise3 {
public static void main(String[]args)
{
	System.out.println(fibonacii(10));
	
}

private static int fibonacii(int i) {
	if(i<=1)
	{
		return i;
	}
	else
	{
		return fibonacii(i-1)+fibonacii(i-2);
	}
	
	
}

}
