import java.util.Scanner;
public class Alg33
{
	public static void main(String[] args)
	{
		Scanner dados = new Scanner(System.in);

		int c = 1;
		double num = 0, somNum = 0, medNum = 0, dobNum = 0;

		while (c <= 5)
		{
			System.out.println("Insira um n�mero");
			num = dados.nextDouble();

			somNum += num;
			c++;
		}
		medNum = somNum/5;
		dobNum = somNum*2;

		System.out.printf("A soma dos n�meros � igual %.2f, a m�dia desses n�meros � %.2f, o dobro � %.2f.", somNum, medNum, dobNum);
	}
}