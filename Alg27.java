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
			System.out.println("O nome do/a paciente é " + nome + ", sua idade é " + idade + " anos e a especialidade de seu médico é pediatria.");
		}
		else if (idade > 12 && idade <= 59)
		{
			System.out.println("O nome do/a paciente é " + nome + ", sua idade é " + idade + " anos e seu médico é especialista em clínica geral.");
		}
		else
		{
			System.out.println("O nome do/a paciente é " + nome + ", sua idade é " + idade + " anos e a especialidade de seu médico é geriatria.");
		}
	}
}