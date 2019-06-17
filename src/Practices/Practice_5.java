package Practices;
import java.util.Scanner;
public class Practice_5 {
	public static void practice5() {
		Scanner sc = new Scanner(System.in);
		int number = 0;
		System.out.print("점수 입력 : ");
		number=sc.nextInt();
		if(number>=90)
		{
			System.out.println("학점 : A");			
		}
		else if(number>=80)
		{
			System.out.println("학점 : B");			
		}
		else if(number>=70)
		{
			System.out.println("학점 : C");			
		}
		else if(number>=60)
		{
			System.out.println("학점 : D");			
		}
		else
		{
			System.out.println("학점 : F");
		}
	}
}
