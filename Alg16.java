import java.util.Scanner;
public class Alg16{

	public static void main(String[] args){

		int a;

		Scanner dados = new Scanner(System.in);

		System.out.println("Declare um n�mero:");
		a = dados.nextInt();

			if (a%5==0)
			{
				System.out.println("O n�mero � divisivel por 5!");
			}
			else
			{
				System.out.println("O n�mero n�o � divisivel por 5...");
			}
	}
}