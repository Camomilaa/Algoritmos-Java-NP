import java.util.Scanner;
	public class AlgExemplo4{
		public static void main (String[] args) {
			int valA, valB, valSoma;
			Scanner ler = new Scanner(System.in);
			System.out.println("Entre com dois números para serem somados");
			valA = ler.nextInt();
			valB = ler.nextInt();
			valSoma =valA+valB;
			System.out.println("O valor da adição é: " + valSoma);
		}
	}