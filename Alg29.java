import java.util.Scanner;
public class Alg29
{
	public static void main(String[] args)
	{
		Scanner dados = new Scanner(System.in);

		System.out.println("Insira abaixo o número do mês e lhe direi quantos dias ele tem:");
		int mes = dados.nextInt();

		switch(mes)
		{
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
				System.out.println("31 dias");
				break;
			case 4:
			case 6:
			case 9:
			case 11:
				System.out.println("30 dias");
				break;
			case 2:
				System.out.println("28/29 dias");
				break;
			default:
				System.out.println("Mês inválido!");
		}
	}
}