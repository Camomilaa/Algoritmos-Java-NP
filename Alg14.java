import java.util.Scanner;
public class Alg14{

	public static void main(String[] args){

		int a;

		Scanner dados = new Scanner(System.in);

		System.out.println("Digite um n�mero:");
		a = dados.nextInt();

			if (a == 0)
			{
				System.out.println("O n�mero � nulo");
			}
			else if (a%2 == 0)
			{
				System.out.println("O n�mero � par");
			}
			else
			{
				System.out.println("O n�mero � �mpar");
			}
	}
}