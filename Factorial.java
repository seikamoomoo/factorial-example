import java.util.Scanner;
public class Factorial
{
	public static void main(String[] args)
	{
		Factorial factorial = new Factorial();
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the recursive number.");
		int n = scan.nextInt();
		System.out.println("Enter the iterative number.");
		int i = scan.nextInt();
		System.out.println(factorial.getRecursiveFactorial(n));
		System.out.println(factorial.getIterativeFactorial(i));
	}

	public int getRecursiveFactorial(int n)
	{
		if(n<0)
		{
			return -1;
		}
		else if(n<2)
		{
			return 1;
		}
		else return (n*getRecursiveFactorial(n-1));
	}

	public int getIterativeFactorial(int n)
	{
		if(n<0)
		{
			return -1;
		}
		int fact = 1;
		for(int i=1; i<=n; i++)
		{
			fact *= i;
		}
		return fact;
	}

	/*public static long fact(long n)
	{
		if(n<=0)
		{
			return 1;
		}
		else return n*fact(n-1);
	}*/
}
