import java.util.Scanner;
public class Alg44
{
	public static void main(String[] args)
	{
		Scanner dados = new Scanner(System.in);

		double num, totNum = 0, medNum = 0, quantNum = 0;

		System.out.println("A leitura se encerra ao digitar 0");

		do
		{
			System.out.println("Insira um número:");
			num = dados.nextDouble();
			if (num != 0)
			{
			totNum += num;
			quantNum ++;
			}

		} while (num != 0);
		if (quantNum != 0)
		{
			medNum = totNum/quantNum;
			System.out.printf("A média é igual a %.1f!", medNum);
		}
		else
		{
			System.out.println("ERRO!");
		}

	}
}