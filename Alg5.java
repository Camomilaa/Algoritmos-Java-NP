import java.util.Scanner;
public class Alg5 {
	public static void main(String[] args) {
		int valA, valB, valSoma;

		Scanner ler = new Scanner (System.in);

		System.out.println("Entre com dois números para serem somados:");
		valA = ler.nextInt();
		valB = ler.nextInt();

		valSoma = valA+valB;

		if (valSoma>50)
			System.out.println("O valor da adição é: " + valSoma);
	}
}