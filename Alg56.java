import java.util.Scanner;
public class Alg56
{
	public static void main(String[] args)
	{
		Scanner dados = new Scanner(System.in);

		int i;
		String[] nome = new String[8];
		String[] vet = new String[8];

		for(i = 0; i < nome.length; i++)
		{
			System.out.println("Insira um nome:");
			nome[i] = dados.nextLine();
		}

		for(i = 0; i < vet.length; i++)
		{
			vet[i] = nome[7-i];
		}

		for (i = 0; i < vet.length; i++)
		{
			System.out.print(vet[i] + " ");
		}
	}
}