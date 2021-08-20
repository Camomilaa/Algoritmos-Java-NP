import java.util.Scanner;
public class Alg54
{
	public static void main(String[] args)
	{
		Scanner dados = new Scanner(System.in);

		int i;
		int[] vet1 = new int[10];
		int[] vet2 = new int[10];
		int[] vetSoma = new int[10];


		System.out.println("Insira os valores do primeiro vetor:");

		for (i = 0; i < vet1.length; i++)
		{
			vet1[i] = dados.nextInt();
		}

		System.out.println("Insira os valores do segundo vetor:");

		for (i = 0; i < vet2.length; i++)
		{
			vet2[i] = dados.nextInt();
		}

		for (i = 0; i < 10; i++)
		{
			vetSoma[i] = vet1[i] + vet2[i];
		}

		for (i = 0; i < 10; i++)
		{
			System.out.print(vetSoma[i] + " ");
		}
	}
}