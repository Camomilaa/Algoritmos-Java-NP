import java.util.Scanner;
public class Alg46_B
{
	public static void main(String[] args)
	{
		Scanner dados = new Scanner(System.in);

		String desc = "a";
		double prec, quant, totProd = 0, tot = 0;

		System.out.println("Digite FIM para encerrar a opera��o");

		do
		{
			dados = new Scanner(System.in);
			System.out.print("Insira a descri��o do produto:");
			desc = dados.nextLine();

			if (!desc.equals("FIM"))
			{
			System.out.print("Insira o pre�o unit�rio:");
			prec = dados.nextDouble();

			System.out.print("Insira a quantidade de produtos:");
			quant = dados.nextDouble();

			totProd = prec*quant;

			tot += totProd;

			}

		} while (!desc.equals("FIM"));

		System.out.printf("A soma � igual a %.2f", totProd); //errado
	}
}