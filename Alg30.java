import java.util.Scanner;
public class Alg30
{
	public static void main(String[] args)
	{
		Scanner ler = new Scanner(System.in);

		System.out.println("Informe a ID da função:");
		int id = ler.nextInt();

		System.out.println("Informe o salário atual:");
		double salario = ler.nextDouble();

		double salario2 = 0;

		switch(id)
		{
			case 1:
				salario2 = salario * 0.3 + salario;
				System.out.printf("O novo salário do gerente é R$%.2f", salario2);
				break;
			case 2:
				salario2 = salario * 0.4 + salario;
				System.out.printf("O novo salário do vendedor é R$%.2f", salario2);
				break;
			case 3:
				salario2 = salario * 0.5 + salario;
				System.out.printf("O novo salário do programador é R$%.2f", salario2);
				break;
			case 4:
				salario2 = salario * 0.6 + salario;
				System.out.printf("O novo salário do motorista é R$%.2f", salario2);
				break;
			case 5:
				System.out.printf("O salario vereador permanece o mesmo RS%.2f", salario);
				break;
			case 6:
				System.out.printf("O salário do deputado permanece o mesmo R$%.2f", salario);
		}
	}
}