import java.util.Scanner;
public class Alg34
{
	public static void main(String[] args)
	{
		Scanner ler = new Scanner(System.in);

		int c = 1;
		double num = 0, numPos = 0, numNeg = 0;

		while (c <= 10)
		{
			System.out.println("Insira um n�mero");
			num = ler.nextDouble();

			if (num > 0)
			{
				numPos += num;
			}
			else
			{
				numNeg += num;
			}
			c++;
		}
		System.out.printf("A soma dos n�meros positivos � igual a %.2f, j� a soma dos n�meros negativos � igual a %.2f.", numPos, numNeg);
	}
}