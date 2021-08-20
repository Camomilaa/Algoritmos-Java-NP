import java.util.Scanner;

	public class Alg8 {

		public static void main(String[] args){

			double nota1, nota2, nota3, media;

			Scanner dados = new Scanner(System.in);

			System.out.println("Entre com a nota 1:");
			nota1=dados.nextDouble();

			System.out.println("Entre com a nota 2:");
			nota2=dados.nextDouble();

			System.out.println("Entre com a nota 3:");
			nota3=dados.nextDouble();

			media=(nota1+nota2+nota3)/3;

			System.out.printf("A média das notas é igual a %.2f", media);

		}
	}