import java.util.Scanner;
public class Alg22
{
	public static void main(String[] args)
	{
		Scanner dados = new Scanner(System.in);

		System.out.println("Insira o valor de a:");
		int a = dados.nextInt();

		System.out.println("Insira o valor de b:");
		int b = dados.nextInt();

		System.out.println("Os valores de a, b e c são respectivamente: " + a + ", " + b + " e ");

		if (a == b)
		{
			int c = a + b;
			System.out.print(c);
		}
		else
		{
			int c = a * b;
			System.out.print(c);
		}

	}
}