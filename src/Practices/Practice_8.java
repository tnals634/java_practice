package Practices;

public class Practice_8 {
	public static void practice8() {
		String name = "Hello, World";
		int num = 0;
		char[] ch = new char[name.length()];
		for(int i=0;i<name.length();i++)
		{
			ch[i] = name.charAt(i);
			if (('a' <= (int) ch[i]) && ((int) ch[i] <= 'z')) {
				num = (int)ch[i]-('a'-'A');
			}
			else if (('A' <= (int) ch[i]) && ((int) ch[i] <= 'Z')) {
				num = (int)ch[i]+('a'-'A');
			}
			else {
				num = (int)ch[i];
			}
			ch[i]=(char)num;
			System.out.print(ch[i]);
		}
	}
}
