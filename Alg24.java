import java.util.Scanner;
public class Alg24
{
	public static void main(String[] args)
	{
		Scanner dados = new Scanner(System.in);

		System.out.println("Insira um n�mero:");
		int num1 = dados.nextInt();

		System.out.println("Insira outro n�mero:");
		int num2 = dados.nextInt();

		if (num1 > num2)
		{
			System.out.println("Os n�meros em ordem decrescente s�o: " + num1 + " e " + num2);
		}
		else
		{
			System.out.println("Os n�meros em ordem decrescente s�o: " + num2 + " e " + num1);
		}
	}
}