import java.util.Scanner;
public class Prova
{
	public static void main(String[] args)
	{
		Scanner ler = new Scanner(System.in);
		int i, pos = 0, mm = 0;
		double salMin, valQ, maior = 0;
		double[] casas = new double[5];
		double[] contas = new double[5];
		double[] contasR = new double[5];

		System.out.println("Insira o valor do salário mínimo:");
		salMin = ler.nextDouble();

		for(i = 0;i < casas.length; i++)
		{
			System.out.println("Insira a quantidade de quilowatts para casa " + (i+1) + ":");
			casas[i] = ler.nextDouble();

			if (casas[i] > 1000)
			{
				mm++;
			}
		}

		valQ = salMin/1000; // valor do QW

		for(i = 0;i < contas.length; i++)
		{
			contas[i] = casas[i]*valQ;
		}

		for(i = 0;i < contasR.length; i++)
		{
			contasR[i] = contas[i] - (contas[i]*0.15);

			if (contasR[i] > maior)
			{
				maior = contasR[i];
				pos = i;
			}
		}

		System.out.printf("O valor do quilowatt é %.2f\n", valQ);

			for(i = 0;i < contas.length; i++)
		{
			System.out.printf("O valor da conta (SEM REAJUSTE) a ser paga pela casa %d é %.2f\n", (i+1), contas[i]);
		}

			for(i = 0;i < contasR.length; i++)
		{
			System.out.printf("O valor da conta (COM REAJUSTE) a ser paga pela casa %d é %.2f\n", (i+1), contasR[i]);
		}

		System.out.printf("O valor da maior conta (COM REAJUSTE) equivale a %.2f\n", maior);

		System.out.printf("A quantidade de resiencias que consumiram mais de 1000 quilowatts é igual a %d\n", mm);

	}
}