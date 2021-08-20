import java.util.Scanner;
public class Alg40
{
	public static void main(String[] args)
	{
		Scanner ler = new Scanner(System.in);

		int num = 0, pos = 0, neg = 0, somaCont;
		double medPos = 0, medNeg = 0, somaPos = 0, somaNeg = 0;

		for (somaCont = 0; somaCont <= 4; somaCont = pos + neg)
		{
			System.out.println("Insira um número:");
			num = ler.nextInt();

			if (num == 0)
			{
			}
			else if (num > 0)
			{
				pos++;
				somaPos += num;
				medPos = somaPos / pos;
			}
			else
			{
				neg++;
				somaNeg += num;
				medNeg = somaNeg / neg;
			}
		}

		System.out.printf("A média dos número positivos é igual a %.2f\n", medPos);
		System.out.printf("A média dos número negativos é igual a %.2f\n", medNeg);
	}
}