package Practices;
import java.util.Scanner;
public class Practice_4 {
	public static void practice4() {
		Scanner sc = new Scanner(System.in);
		int number = 0;
		System.out.println("Enter line number : ");
		number = sc.nextInt();
		for(int i=0;i<=number;i++)
		{
			for(int j=0;j<i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
