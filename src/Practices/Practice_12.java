package Practices;

public class Practice_12 {
	public static void practice12() {
		int[] number1 = {3,4,5};
		int[] number2 = {3,3,3};
		
		System.out.println("»ï°¢Çü1 : "+"A="+number1[0]+", B="+number1[1]+", C="+number1[2]);
		System.out.println("µÑ·¹±æÀÌ : "+Triangle(number1[0],number1[1],number1[2]));
		
		System.out.println("»ï°¢Çü1 : "+"A="+number2[0]+", B="+number2[1]+", C="+number2[2]);
		Draw(number2[0],number2[1],number2[2]);		
	}
	public static int Triangle(int a, int b, int c)
	{
		return a+b+c;
	}
	public static void Draw(int a, int b, int c)
	{
		System.out.println("Draw("+a+","+b+","+c+")");
	}
}
