import java.util.Scanner;
public class Alg38
{
	public static void main(String[] args)
	{
		Scanner ler = new Scanner(System.in);

		int c = 1, num = 0, pos = 0, neg = 0, somaPos = 0, somaNeg = 0;

		while (c <= 15)
		{
			System.out.println("Insira um número:");
			num = ler.nextInt();

			if (num == 0)
			{
				System.out.println("Número não aceito!");
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
		System.out.println("A quantidade de números positivos digitados foi " + pos + ", a soma desses números equivale a " + somaPos);
		System.out.println("A quantidade de números negativos digitados foi " + neg + ", a soma desses números equivale a " + somaNeg);
	}
}