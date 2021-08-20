import java.util.Scanner;
public class Alg57
{
	public static void main(String[] args)
	{
		Scanner dados = new Scanner(System.in);

		int i;
		int[] vetX = new int[10];
		int[] vetY = new int[10];
		int[] vetZ = new int[20];

		System.out.println("Insira os valores do vetor X:");

		for(i = 0; i < vetX.length; i++)
		{
			vetX[i] = dados.nextInt();
		}

		System.out.println("Insira os valores do vetor Y:");

		for(i = 0; i < vetY.length; i++)
		{
			vetY[i] = dados.nextInt();
		}

		for(i = 0; i < vetX.length; i++)
		{
			vetZ[i] = vetX[i];
			vetZ[i+10] = vetY[i];
		}

		for(i = 0; i < vetZ.length; i++)
		{
			System.out.print(vetZ[i] + " ");
		}
	}
}