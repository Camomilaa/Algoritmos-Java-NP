import java.util.Scanner;
public class Alg46
{
	public static void main(String[] args)
	{
		Scanner dados = new Scanner(System.in);

		String desc = "a";
		double prec, quant, totProd = 0, tot = 0;

		System.out.println("Digite FIM para encerrar a operação");

		do
		{
			dados = new Scanner(System.in);
			System.out.println("Insira a descrição do produto:");
			desc = dados.nextLine();

			if (desc.toUpperCase().equals("FIM"))
			{
				break;
			}
			else
			{
			System.out.println("Insira o preço unitário:");
			prec = dados.nextDouble();

			System.out.println("Insira a quantidade de produtos:");
			quant = dados.nextDouble();

			totProd = prec*quant;

			tot += totProd;
			}
		} while (!desc.equals("FIM"));

		System.out.printf("A soma é igual a R$%.2f", tot);
	}
}