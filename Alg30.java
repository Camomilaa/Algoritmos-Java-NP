import java.util.Scanner;
public class Alg30
{
	public static void main(String[] args)
	{
		Scanner ler = new Scanner(System.in);

		System.out.println("Informe a ID da fun��o:");
		int id = ler.nextInt();

		System.out.println("Informe o sal�rio atual:");
		double salario = ler.nextDouble();

		double salario2 = 0;

		switch(id)
		{
			case 1:
				salario2 = salario * 0.3 + salario;
				System.out.printf("O novo sal�rio do gerente � R$%.2f", salario2);
				break;
			case 2:
				salario2 = salario * 0.4 + salario;
				System.out.printf("O novo sal�rio do vendedor � R$%.2f", salario2);
				break;
			case 3:
				salario2 = salario * 0.5 + salario;
				System.out.printf("O novo sal�rio do programador � R$%.2f", salario2);
				break;
			case 4:
				salario2 = salario * 0.6 + salario;
				System.out.printf("O novo sal�rio do motorista � R$%.2f", salario2);
				break;
			case 5:
				System.out.printf("O salario vereador permanece o mesmo RS%.2f", salario);
				break;
			case 6:
				System.out.printf("O sal�rio do deputado permanece o mesmo R$%.2f", salario);
		}
	}
}