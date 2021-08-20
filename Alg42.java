import java.util.Scanner;
public class Alg42
{
	public static void main(String[] args)
	{
		Scanner ler = new Scanner(System.in);

		int idade = 0, cont = 0, contIdade = 0, contNota = 0;
		double nota = 0, medNota = 0, somaNota = 0;

		for (cont = 1; cont <= 30; cont++)
		{
			System.out.println("Insira a nota final do aluno:");
			nota = ler.nextDouble();

			System.out.println("Insira a idade do aluno:");
			idade = ler.nextInt();

			somaNota += nota;

			if (idade > 20)
			{
				contIdade++;
			}

			if (nota > 70)
			{
				contNota++;
			}
		}
		medNota = somaNota / 30;

		System.out.println("A quantidade de alunos com a nota superior a 70 pontos é igual a " + contNota);
		System.out.println("A quantidade de alunos com a idade superior a 20 anos é igual a " + contIdade);
		System.out.printf("A média das notas dos alunos é igual a %.1f", medNota);
	}
}