import java.util.Scanner;
public class Alg12{

	public static void main(String[] args){

		int a;

		Scanner dados = new Scanner(System.in);

		System.out.println("Insira um n�mero:");

		a = dados.nextInt();
		System.out.print("O n�mero " + a);

			if (a>0)
			{
				System.out.print(" � positivo");
			}
			else
			{
				System.out.print(" � negativo");
			}
	}

}