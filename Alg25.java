import java.util.Scanner;
public class Alg25
{
	public static void main(String[] args)
	{
		Scanner dados = new Scanner(System.in);

		System.out.println("Insira a sua idade:");
		int  idade = dados.nextInt();

		if (idade < 18)
		{
			System.out.println("Você é menor de idade!");
		}
		else if (idade >= 18 && idade <= 65)
		{
			System.out.println("Você é adulto!");
		}
		else
		{
			System.out.println("Você é idoso!");
		}
	}
}