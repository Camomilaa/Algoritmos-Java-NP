import java.util.Scanner;
public class Alg26
{
	public static void main(String[] args)
	{
		Scanner ler = new Scanner(System.in);

		double valor2 = 0;
		double lucro = 0;

		System.out.println("Digite o nome do produto:");
		String produto = ler.nextLine();

		System.out.println("Qual foi o valor dessa compra?");
		double valor1 = ler.nextDouble();

		if (valor1 < 100)
		{
			lucro = valor1*0.7;
			valor2 = valor1 + lucro;
		}
		else if (valor1 <= 200)
		{
			lucro = valor1*0.5;
			valor2 = valor1 + lucro;
		}
		else
		{
			lucro = valor1*0.3;
			valor2 = valor1 + lucro;

		}
		System.out.printf("\nO nome do produto é %s \nO valor da compra é %.2f \nO valor da venda é %.2f", produto, valor1, valor2);
	}
}