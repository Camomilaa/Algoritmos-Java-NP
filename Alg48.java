import java.util.Scanner;
public class Alg48
{
	public static void main(String[] args)
	{
		Scanner ler = new Scanner(System.in);

		int num = 0, quantPar = 0, somImpar = 0;
		System.out.println("Para encerrar digite '-1'");

		do {

			System.out.println("Insira um n�mero");
			num = ler.nextInt();
			if (num != -1)
			{
				if (num == 0)
				{
				}
				else if (num % 2 == 0)
				{
					quantPar++;
				}
				else
				{
					somImpar += num;
				}
			}

		} while (num != -1);

		System.out.println("A quantidade de n�meros pares � " + quantPar);
		System.out.println("A soma dos n�meros �mpares � igual a " + somImpar);
	}
}