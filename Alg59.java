import java.util.Scanner;
public class Alg59
{
	public static void main(String[] args)
	{
		Scanner dados = new Scanner(System.in);

		int i, maior = 0, posicao = 0;
		int[] vet = new int[5];

		System.out.println("Insira os valores abaixo:");

		for(i = 0; i < vet.length; i++)
		{
			vet[i] = dados.nextInt();

			if (vet[i] > maior)
			{
				maior = vet[i];
				posicao = i;
			}
		}

		System.out.printf("O maior valor é %d, e sua posição é %d", maior, posicao);

	}
}