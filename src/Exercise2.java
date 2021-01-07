/*Traffic Light
* author-L.S.Kanishka*/
import java.util.Scanner;
public class Exercise2 {
public static void main(String[]args)
	{
		String choice;
		Scanner sc=new Scanner(System.in);
		//System.out.println("Enter your choice");
		choice=sc.nextLine();
		switch(choice)
		{
		case "red":
			System.out.println("stop");
			break;
		case "orange":
			System.out.println("ready");
			break;
		case "green":
			System.out.println("go");
			break;
		default:	
			System.out.println("invalid");
		}
		sc.close();
	
	}
}
