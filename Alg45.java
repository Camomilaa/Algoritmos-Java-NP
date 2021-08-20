import java.util.Scanner;
public class Alg45
{
	public static void main(String[] args)
	{
		Scanner ler = new Scanner(System.in);

		int num, somNum = 0;

		System.out.println("A leitura se encerra ao digitar 0");
		do
		{
			System.out.println("Insira um número:");
			num = ler.nextInt();

			if (num > 5)
			{
				somNum += num;
			}
		} while (num != 0);

		System.out.println("A soma dos números superiores a 5 equivale a " + somNum + "!");
	}
}