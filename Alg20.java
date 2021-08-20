import java.util.Scanner;
public class Alg20
{
	public static void main(String[] args)
	{
		Scanner dados = new Scanner(System.in);

		System.out.println("Insira o lado A do triângulo:");
		double ladoA = dados.nextDouble();

		System.out.println("Insira o lado B do triângulo:");
		double ladoB = dados.nextDouble();

		System.out.println("Insira o lado C do triângulo:");
		double ladoC = dados.nextDouble();

		if (ladoA < (ladoB+ladoC) && ladoB < (ladoC+ladoA) && ladoC < (ladoA+ladoB))
		{
			if (ladoA == ladoB && ladoB == ladoC && ladoC == ladoA)
			{
				System.out.println("O triângulo é equilátero!");
			}
			else if (ladoA == ladoB || ladoB == ladoC || ladoC == ladoA)
			{
				System.out.println("O triângulo é isóceles!");
			}
			else
			{
				System.out.println("O triângulo é escaleno!");
			}
		}
		else
		{
			System.out.println("Erro! Esse triângulo não é viável");
		}
	}
}