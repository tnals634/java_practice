package Practices;

public class Practice_9 {
	public static void practice9() {
		String name = "Hello World";
		int number = 0;
		char[] ch = new char[name.length()];
		System.out.println("���� : "+name);
		System.out.print("��ȣ : ");
		for(int i=0;i<name.length();i++)
		{
			ch[i] = name.charAt(i);
			if(('a'<=(int)ch[i])&&((int)ch[i] <='z'))
			{
				number = (int)ch[i]+3;
			}
			else if(('A'<=(int)ch[i])&&((int)ch[i] <='Z'))
			{
				number = (int)ch[i]+3;
			}
			else
			{
				number = (int)ch[i];
			}
			System.out.print((char)number);
		}
	}
}
