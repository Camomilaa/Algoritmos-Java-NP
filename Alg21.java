import java.util.Scanner;
public class Alg21
{
	public static void main(String[] args)
	{
		Scanner ler = new Scanner(System.in);

		System.out.println("Insira um n�mero:");
		int num1 = ler.nextInt();

		System.out.println("Insira outro n�mero para ser somado:");
		int num2 = ler.nextInt();

		int soma = num1 + num2;

		if (soma > 10)
		{
			System.out.println("O resultado da soma � " + soma);
		}
	}
}