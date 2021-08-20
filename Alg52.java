import java.util.Scanner;
public class Alg52
{
	public static void main(String[] args)
	{
		Scanner ler = new Scanner(System.in);

		int idade = 0, totF = 0, totM = 0, totIdade = 0, medIdade = 0;
		double peso = 0, totPeso = 0, medPeso = 0;
		String genero = "a";

		System.out.println("Digita -1 para encerrar");

		do{

			System.out.println("Insira sua idade:");
			idade = ler.nextInt();

		if (idade != -1)
			{
				System.out.println("Insira seu peso:");
				peso = ler.nextDouble();

				ler = new Scanner(System.in);

				System.out.println("Insira a inicial do seu gênero: (M - masculino, F - feminino)");
				genero = ler.nextLine();

				if (genero.toUpperCase().equals("F"))
				{
					totF++;

					totPeso += peso;

					medPeso = totPeso/totF;
				}
				else if (genero.toUpperCase().equals("M"))
				{
					totM++;

					totIdade += idade;

					medIdade = totIdade/totM;
				}
				else
				{

				}

			}
		}while (idade != -1);

			System.out.println("O total de homens equivale a " + totM);
			System.out.println("O total de mulheres equivale a " + totF);
			System.out.println("A média das idades dos homens equivale a " + medIdade + " anos.");
			System.out.printf("A média dos pesos das mulheres equivale a %.1f Kg.", medPeso);

	}
}