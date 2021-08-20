import java.util.Scanner;
public class Alg16{

	public static void main(String[] args){

		int a;

		Scanner dados = new Scanner(System.in);

		System.out.println("Declare um número:");
		a = dados.nextInt();

			if (a%5==0)
			{
				System.out.println("O número é divisivel por 5!");
			}
			else
			{
				System.out.println("O número não é divisivel por 5...");
			}
	}
}