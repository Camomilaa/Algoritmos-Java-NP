import java.util.Scanner;
public class Alg51
{
	public static void main(String[] args)
	{
		Scanner ler = new Scanner(System.in);

		String nome;
		double nota1 = 0, nota2 = 0, nota3 = 0, somAluno = 0, total = 0, media = 0;
		int num = 0, ap = 0, rep = 0;

		System.out.println("Para encerrar digite FIM");

		do {

			ler = new Scanner(System.in);

			System.out.println("Insira o nome do aluno");
			nome = ler.nextLine();

			if (nome.toUpperCase().equals("FIM"))
			{
				break;
			}
			else
			{
				System.out.println("Insira a nota 1:");
				nota1 = ler.nextDouble();

				System.out.println("Insira a nota 2:");
				nota2 = ler.nextDouble();

				System.out.println("Insira a nota 3:");
				nota3 = ler.nextDouble();

				somAluno = nota1 + nota2 + nota3;

				if (somAluno >= 60)
				{
					ap++;
				}
				else
				{
					rep++;
				}

				total += somAluno;

				num++;
			}

		} while(!nome.equals("FIM"));

		media = total/num;

		System.out.printf("A média da classe é %.2f\n", media);
		System.out.println("O número de alunos aprovados é igual a " + ap);
		System.out.println("O número de alunos reprovados é igual a " + rep);

	}
}