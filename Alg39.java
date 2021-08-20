import java.util.Scanner;
public class Alg39
{
	public static void main(String[] args)
	{
		Scanner dados = new Scanner(System.in);

		int num = 0, par = 0, impar = 0, somaPar = 0, somaImpar = 0, somaCont = 0;

		for (somaCont = 1; somaCont <= 9; somaCont = par + impar)
		{
			System.out.println("Insira um número:");
			num = dados.nextInt();

			if (num == 0)
			{
			}
			else if (num % 2 == 0)
			{
				par++;
				somaPar += num;
			}
			else
			{
				impar++;
				somaImpar += num;
			}
		}

		System.out.println("A quantidade de números pares digitados foi " + par + ", a soma desses números é igual a " + somaPar);
		System.out.println("A quantidade de números impares digitados foi " + impar + ", a soma desses números é igual a " + somaImpar);
	}
}