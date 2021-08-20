import java.util.Scanner;
public class Alg37
{
	public static void main(String[] args)
	{
		Scanner dado = new Scanner(System.in);

		int c = 1, num = 0, par = 0, impar = 0;

		while (c <= 10)
		{
			System.out.println("Insira um número");
			num = dado.nextInt();

			if (num == 0)
			{

			}
			else if (num % 2 == 0)
			{
				par ++;
			}
			else
			{
				impar ++;
			}
			c++;
		}
		System.out.printf("A quantidade de números pares inseridos foi %d\nA quantidade de números ímpares inseridos foi %d.", par, impar);
	}
}