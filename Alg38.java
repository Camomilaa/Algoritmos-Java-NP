import java.util.Scanner;
public class Alg38
{
	public static void main(String[] args)
	{
		Scanner ler = new Scanner(System.in);

		int c = 1, num = 0, pos = 0, neg = 0, somaPos = 0, somaNeg = 0;

		while (c <= 15)
		{
			System.out.println("Insira um n�mero:");
			num = ler.nextInt();

			if (num == 0)
			{
				System.out.println("N�mero n�o aceito!");
			}
			else if (num > 0)
			{
				pos++;
				somaPos += num;
			}
			else
			{
				neg++;
				somaNeg += num;
			}
			c++;
		}
		System.out.println("A quantidade de n�meros positivos digitados foi " + pos + ", a soma desses n�meros equivale a " + somaPos);
		System.out.println("A quantidade de n�meros negativos digitados foi " + neg + ", a soma desses n�meros equivale a " + somaNeg);
	}
}