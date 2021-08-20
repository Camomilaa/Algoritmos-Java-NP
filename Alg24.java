import java.util.Scanner;
public class Alg24
{
	public static void main(String[] args)
	{
		Scanner dados = new Scanner(System.in);

		System.out.println("Insira um número:");
		int num1 = dados.nextInt();

		System.out.println("Insira outro número:");
		int num2 = dados.nextInt();

		if (num1 > num2)
		{
			System.out.println("Os números em ordem decrescente são: " + num1 + " e " + num2);
		}
		else
		{
			System.out.println("Os números em ordem decrescente são: " + num2 + " e " + num1);
		}
	}
}