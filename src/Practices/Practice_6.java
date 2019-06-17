package Practices;
import java.util.Scanner;
public class Practice_6 {
	public static void practice6() {
		Scanner sc = new Scanner(System.in);
		double[] number = new double[10];
		double check = 0;
		System.out.print("점수 : ");
		for(int i=0;i<10;i++)
		{
			number[i] = sc.nextDouble();
			check = number[i]+check;
		}
		System.out.println("합계 : "+check);
		System.out.println("평균 : "+(check/10));
	}
}
