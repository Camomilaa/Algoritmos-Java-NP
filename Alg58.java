import java.util.Scanner;
public class Alg58
{
	public static void main(String[] args)
	{
		Scanner dados = new Scanner(System.in);

		int i;
		double[] vet = new double[10];

		System.out.println("Insira os preços:");

		for(i = 0; i < vet.length; i++)
		{
			vet[i] = dados.nextDouble();
			vet[i] = vet[i] + (vet[i] * 0.1);
		}

		for(i = 0; i < vet.length; i++)
		{
			System.out.printf("%.2f ", vet[i]);
		}
	}
}