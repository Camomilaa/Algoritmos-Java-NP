import java.util.Scanner;
public class Alg41
{
	public static void main(String[] args)
	{
		Scanner dados = new Scanner(System.in);

		int num = 0, par = 0, impar = 0, somaCont = 0;
		double medPar = 0, medImpar = 0, somaPar = 0, somaImpar = 0;

		for (somaCont = 1; somaCont <= 4; somaCont = par + impar)
		{
			System.out.println("Insira um n�mero:");
			num = dados.nextInt();

			if (num == 0)
			{
				System.out.println("N�mero n�o aceito");
			}
			else if (num % 2 == 0)
			{
				par++;
				somaPar += num;
				medPar = somaPar/par;
			}
			else
			{
				impar++;
				somaImpar += num;
				medImpar = somaImpar/impar;
			}
		}

		System.out.printf("A m�dia dos valores pares � igual a %.2f\n", medPar);
		System.out.printf("A m�dia dos valores impares � igual a %.2f", medImpar);
	}
}