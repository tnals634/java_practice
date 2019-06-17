package Practices;

public class Practice_13 {
	public static void practice13_1() {
		int a =20,b=10, num=1;
		double x =20.5,y=10.5, n=0;
		System.out.println("a="+a+", b="+b);
		System.out.print("사칙연산 결과 : "+int_add(a,b)+","+int_sub(a,b)+","+int_mul(a,b)+",");
		int_div(a,b,num);
		if(num==0) System.out.println("나눌 수 없습니다.");
		else System.out.println(int_div(a,b,num));
		
		System.out.println();
		System.out.println("x="+x+", y="+y);
		System.out.print("사칙연산 결과 : "+double_add(x,y)+","+String.format("%.2f", (double_sub(x,y)))+","+String.format("%.1f", double_mul(x,y))+",");
		double_div(x,y,n);
		if(num==0) System.out.println("나눌 수 없습니다.");
		else System.out.println(String.format("%.6f", (double_div(x,y,n))));
		
	}
	
	public static int int_add(int a, int b)
	{
		return a+b;
	}
	public static int int_sub(int a, int b)
	{
		return a-b;
	}
	public static int int_mul(int a, int b)
	{
		return a*b;
	}
	public static int int_div(int a, int b, int num)
	{
		if((a==0)||(b==0))
		{
			num=0;
		}
		else if(a>=b)
		{
			num = a/b;
		}
		else if(a<b)
		{
			num = b/a;
		}
		return num;
	}
	
	public static double double_add(double x, double y)
	{
		return x+y;
	}
	public static double double_sub(double x, double y)
	{
		return x-y;
	}
	public static double double_mul(double x, double y)
	{
		return x*y;
	}
	public static double double_div(double x, double y, double num)
	{
		if((x==0)||(y==0))
		{
			num=0;
		}
		else if(x>=y)
		{
			num = x/y;
		}
		else if(x<y)
		{
			num = y/x;
		}
		return num;
	}
	
	
	public static void practice13_2() {
		Box<Double> number = new Box<Double>();
		number.Box(20.5, 10.5);
		System.out.println("a=20,b=10");
		System.out.println(number.sum()+","+number.sub()+","+number.mul()+","+number.div());
		
	}
	
	public static class Box<T>{
		private T a;
		private T b;
		public void Box(T a, T b) {
			this.a = a;
			this.b = b;
		}
		
		public T getA() {
			return a;
		}

		public T getB() {
			return b;
		}

		
		public double sum()
		{
			return (double)getA()+(double)getB();
		}
		public double sub()
		{
			return (double)getA() - (double)getB();
		}
		public double mul()
		{
			return (double)getA() * (double)getB();
		}
		public double div()
		{
			
			return (double)getA()/(double)getB();
		}
	}
}
