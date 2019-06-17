package Practices;

public class Practice_11 {
	public static void practice11() {
		int n = 0;
		System.out.print("(3 + 5 - 2) x 2 / 3 = ");
		n = add(3,5);
		n = sub(n,2);
		n = mul(n,2);
		n = div(n,3);
		System.out.println(n);
	}
	public static int add(int number1, int number2) //µ¡¼À
	{
		return number1+number2;
	}
	public static int sub(int number1, int number2) //–E¼À
	{
		return number1-number2;
	}
	public static int mul(int number1, int number2) //°ö¼À
	{
		return number1*number2;
	}
	public static int div(int number1, int number2) //³ª´°¼À
	{
		int num = 0;
		if((number1==0)||(number2==0))
		{
			System.out.println("error");
		}
		else if(number1>number2)
		{
			num = number1/number2;
		}
		else if(number1<number2)
		{
			num = number2/number1;
		}
		return num;
	}
}
