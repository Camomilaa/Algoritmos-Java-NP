import java.util.Scanner;
public class Alg43
{
	public static void main(String[] args)
	{
		Scanner ler = new Scanner(System.in);

		String nome;
		int cont = 0, apro = 0, repro = 0;
		double nota1 = 0, nota2 = 0, nota3 = 0, totAluno = 0, total = 0, medSala = 0;

		ler = new Scanner(System.in);

		for (cont = 1; cont <= 10; cont++)
		{
			ler = new Scanner(System.in);

			System.out.println("Insira o nome do aluno:");
			nome = ler.nextLine();

			System.out.println("Insira a nota 1 desse aluno:");
			nota1 = ler.nextDouble();

			System.out.println("Insira a nota 2 desse aluno:");
			nota2 = ler.nextDouble();

			System.out.println("Insira a nota 3 desse aluno:");
			nota3 = ler.nextDouble();

			totAluno = nota1 + nota2 + nota3;
			if (totAluno >= 60)
			{
				apro ++;
			}
			else
			{
				repro++;
			}

			total += totAluno;
		}
		medSala = total/10;
		System.out.println("A média da classe equivale a " + medSala);
		System.out.println("A quantidade de alunos aprovados é igual a " + apro);
		System.out.println("A quantidade de alunos repovados é igual a " + repro);
	}
}