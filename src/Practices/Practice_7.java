package Practices;

public class Practice_7 {
	public static void practice7() {
		double[][] number =  {{90,80,80},{85,85,95},{95,70,75},{80,80,90},{90,75,80}};
		double check = 0;
		for(int i=0;i<5;i++)
		{
			for(int j=0;j<3;j++)
			{
				check = number[i][j]+check;
			}
			System.out.println("ID-"+i+": ÇÕ°è-"+(int)check+", Æò±Õ-"+String.format("%.2f", (check/3)));
			check = 0;
		}
		
	}
}
