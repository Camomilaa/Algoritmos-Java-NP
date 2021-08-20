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
			System.out.println("Insira um número");
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
		System.out.printf("A soma dos números positivos é igual a %.2f, já a soma dos números negativos é igual a %.2f.", numPos, numNeg);
	}
}