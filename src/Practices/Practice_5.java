package Practices;
import java.util.Scanner;
public class Practice_5 {
	public static void practice5() {
		Scanner sc = new Scanner(System.in);
		int number = 0;
		System.out.print("���� �Է� : ");
		number=sc.nextInt();
		if(number>=90)
		{
			System.out.println("���� : A");			
		}
		else if(number>=80)
		{
			System.out.println("���� : B");			
		}
		else if(number>=70)
		{
			System.out.println("���� : C");			
		}
		else if(number>=60)
		{
			System.out.println("���� : D");			
		}
		else
		{
			System.out.println("���� : F");
		}
	}
}
