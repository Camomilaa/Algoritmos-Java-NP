import java.util.Scanner;
public class Alg20
{
	public static void main(String[] args)
	{
		Scanner dados = new Scanner(System.in);

		System.out.println("Insira o lado A do tri�ngulo:");
		double ladoA = dados.nextDouble();

		System.out.println("Insira o lado B do tri�ngulo:");
		double ladoB = dados.nextDouble();

		System.out.println("Insira o lado C do tri�ngulo:");
		double ladoC = dados.nextDouble();

		if (ladoA < (ladoB+ladoC) && ladoB < (ladoC+ladoA) && ladoC < (ladoA+ladoB))
		{
			if (ladoA == ladoB && ladoB == ladoC && ladoC == ladoA)
			{
				System.out.println("O tri�ngulo � equil�tero!");
			}
			else if (ladoA == ladoB || ladoB == ladoC || ladoC == ladoA)
			{
				System.out.println("O tri�ngulo � is�celes!");
			}
			else
			{
				System.out.println("O tri�ngulo � escaleno!");
			}
		}
		else
		{
			System.out.println("Erro! Esse tri�ngulo n�o � vi�vel");
		}
	}
}