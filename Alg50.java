import java.util.Scanner;
public class Alg50
{
	public static void main(String[] args)
	{
		Scanner ler = new Scanner(System.in);

		String desc = "a";
		double prec = 0, totProd = 0, tot = 0;
		int quant = 0;

		System.out.println("para encerrar digite 'fim'");

		do {
			ler = new Scanner(System.in);
			System.out.println("Insira a descri��o do produto:");
			desc = ler.nextLine();

			if (desc.toUpperCase().equals("FIM"))
			{
				break;
			}
			else
			{
				System.out.println("Insira o pre�o unit�rio:");
				prec = ler.nextDouble();

				System.out.println("Insira a quantidade de produtos:");
				quant = ler.nextInt();

				totProd = quant * prec;
				tot += totProd;
			}
		} while (!desc.equals("FIM"));

		System.out.printf("O valor total da compra � R$%.2f", tot);

	}
}