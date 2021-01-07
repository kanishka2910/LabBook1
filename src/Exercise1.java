/*sum of the cubes of the digits of an n digit number
 * author-L.S.Kanishka
 */


public class Exercise1 {
public static void main(String[]args)
		{
			int num=548;
			int result= CubeSum(num);
			System.out.println(result);
		}

private static int CubeSum(int num) {
	int sum=0;
	while (num>0)
	{
		int m=num%10;
		sum=sum+(m*m*m);
		num=num/10;
	}
	return sum;
}
}
