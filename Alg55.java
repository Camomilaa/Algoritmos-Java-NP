import java.util.Scanner;
public class Alg55
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

		for (i = (vet.length) - 1; i >= 0; i--)
		{
			System.out.print(nome[i] + " ");
		}
	}
}