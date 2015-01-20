package basics;

//Title:	LogOp.Java
//Author:	Lrd. R. Schenk
//Date:		11/08/2014

public class LogOp 
{
	public static void main(String[] args)
	{
		int a = 2;
		int b = 3;
		System.out.println(a == 2 && b < 8);
		System.out.println(a != 2 || !(b < 2));
		System.out.println(a == 2 ^ b > 0);
	}
}