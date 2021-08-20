import java.util.Scanner;
public class Alg12{

	public static void main(String[] args){

		int a;

		Scanner dados = new Scanner(System.in);

		System.out.println("Insira um número:");

		a = dados.nextInt();
		System.out.print("O número " + a);

			if (a>0)
			{
				System.out.print(" é positivo");
			}
			else
			{
				System.out.print(" é negativo");
			}
	}

}