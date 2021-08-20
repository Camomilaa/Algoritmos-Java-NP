import java.util.Scanner;
public class Alg18{

	public static void main(String[] args){

		double salario, reajuste, total;

		Scanner dados = new Scanner(System.in);

		System.out.println("Insira aqui o valor salarial R$:");
		salario = dados.nextDouble();

			if (salario < 500)
			{
				reajuste = salario*0.15;
				total = salario+reajuste;
				System.out.printf("O reajuste é de R$ %.2f", reajuste);
				System.out.printf("\nO novo valor do salário é: R$ %.2f", total);
			}
			else if (salario >= 500 && salario <=1000)
			{
				reajuste = salario*0.10;
				total = salario+reajuste;
				System.out.printf("O reajuste é de R$ %.2f", reajuste);
				System.out.printf("\nO novo valor do salário é: R$ %.2f", total);
			}
			else
			{
				reajuste = salario*0.05;
				total = salario+reajuste;
				System.out.printf("O reajuste é de R$ %.2f", reajuste);
				System.out.printf("\nO novo valor do salário é: R$ %.2f", total);
			}
	}
}