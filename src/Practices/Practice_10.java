package Practices;
import java.util.Scanner;
public class Practice_10 {
	public static void practice10() {
		Scanner sc = new Scanner(System.in);
		int[] number = new int[5];
		int sum = 0;
		System.out.print("A : ");
		for(int i=0;i<5;i++)
		{
			number[i] = sc.nextInt();
			sum = number[i]+sum;
		}
		System.out.println("Sum<A> = "+sum);
		System.out.println();
		sum = 0;
		System.out.print("B : ");
		for(int i=0;i<5;i++)
		{
			number[i] = sc.nextInt();
			sum = number[i]+sum;
		}
		System.out.println("Sum<B> = "+sum);
			
	}
}
