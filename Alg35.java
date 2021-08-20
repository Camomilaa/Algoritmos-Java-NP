import java.util.Scanner;
public class Alg35
{
	public static void main(String[] args)
	{
		Scanner dados = new Scanner(System.in);

		int c = 1;
		double num = 0, soma = 0;

		while (c <= 10)
		{
			System.out.println("Insira um número");
			num = dados.nextDouble();

			if (num < 40)
			{
				soma += num;
			}
			c++;
		}

		System.out.printf("A soma dos números inferiores a 40 é %.1f", soma);
	}
}