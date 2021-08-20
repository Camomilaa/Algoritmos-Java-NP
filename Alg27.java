import java.util.Scanner;
public class Alg27
{
	public static void main(String[] args)
	{
		Scanner dados = new Scanner(System.in);

		System.out.println("Insira o nome do paciente:");
		String nome = dados.nextLine();

		System.out.println("Insira a idade do paciente:");
		int idade = dados.nextInt();

		if (idade <= 12)
		{
			System.out.println("O nome do/a paciente � " + nome + ", sua idade � " + idade + " anos e a especialidade de seu m�dico � pediatria.");
		}
		else if (idade > 12 && idade <= 59)
		{
			System.out.println("O nome do/a paciente � " + nome + ", sua idade � " + idade + " anos e seu m�dico � especialista em cl�nica geral.");
		}
		else
		{
			System.out.println("O nome do/a paciente � " + nome + ", sua idade � " + idade + " anos e a especialidade de seu m�dico � geriatria.");
		}
	}
}