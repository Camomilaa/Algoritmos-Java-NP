import java.util.Scanner;
public class Alg49
{
	public static void main(String[] args)
	{
		Scanner ler = new Scanner(System.in);

		int num = 0, quantNeg = 0, somPos = 0;
		System.out.println("Para encerrar digite '0'");

		do {

			System.out.println("Insira um n�mero");
			num = ler.nextInt();
			if (num != 0)
			{
				if (num > 0)
				{
					somPos += num;
				}
				else
				{
					quantNeg++;
				}
			}

		} while (num != 0);

		System.out.println("A soma dos n�meros positivos � igual a " + somPos);
		System.out.println("A quantidade de n�meros negativos � " + quantNeg);
	}
}