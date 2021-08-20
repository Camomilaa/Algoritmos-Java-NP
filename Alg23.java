import java.util.Scanner;
public class Alg23
{
	public static void main(String[] args)
	{
		Scanner ler = new Scanner(System.in);

		System.out.println("Insira um número:");
		int num1 = ler.nextInt();

		System.out.println("Insira outro número:");
		int num2 = ler.nextInt();

		if (num1 < num2)
		{
			System.out.println("Os números em ordem crescente são: " + num1 + " e " + num2);
		}
		else
		{
			System.out.println("Os números em ordem crescente são: " + num2 + " e " + num1);
		}
	}
}