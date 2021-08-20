import java.util.Scanner;
public class Alg47
{
	public static void main(String[] args)
	{
		Scanner dados = new Scanner(System.in);

		int num = 0, numPos = 0, numNeg = 0, somPos = 0, somNeg = 0;

		do
		{
			System.out.println("Insira um n�mero:");
			num = dados.nextInt();

			if (num == 0)
			{
				System.out.println("n�mero n�o aceito!");
			}
			else if (num > 0)
			{
				numPos++;
				somPos += num;
			}
			else
			{
				numNeg++;
				somNeg += num;
			}
		} while (numPos + numNeg < 15);

		System.out.println("A quantidade de n�meros positivos � igual a " + numPos);
		System.out.println("A quantidade de n�meros negativos � igual a " + numNeg);
		System.out.println("A soma de todos os valores positivos equivale a " + somPos);
		System.out.println("A soma de todos os valores negativos equivale a " + somNeg);
	}
}