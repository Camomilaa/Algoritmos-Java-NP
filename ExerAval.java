import java.util.Scanner;
public class ExerAval
{
	public static void main(String[] args)
	{
		Scanner ler = new Scanner(System.in);

		System.out.println("Insira o custo de fábrica:");
		double custo = ler.nextDouble();

		double valImp, valDist, valF;

		if (custo <= 15000)
		{
			valDist = custo * 0.1;
			valImp = custo * 0.35;
			valF = custo + valDist + valImp;
		}
		else if (custo > 15000 && custo <= 20000)
		{
			valDist = custo * 0.11;
			valImp = custo * 0.4;
			valF = custo + valDist + valImp;
		}
		else if (custo > 20000 && custo <= 40000)
		{
			valDist = custo * 0.12;
			valImp = custo * 0.45;
			valF = custo + valDist + valImp;
		}
		else
		{
			valDist = custo * 0.13;
			valImp = custo * 0.5;
			valF = custo + valDist + valImp;
		}

		System.out.printf("O valor do custo de fábrica é R$%.2f\no valor dos impostos é R$%.2f", custo, valImp);
		System.out.printf("\no valor da distribuidora é R$%.2f\no valor final é R$%.2f", valDist, valF);
	}
}