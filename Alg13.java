import java.util.Scanner;
public class Alg13{

	public static void main(String[] args){

		int a;

		Scanner ler = new Scanner(System.in);

		System.out.println("Insira um n�mero:");
		a = ler.nextInt();

			if(a>0)
			{
				System.out.print(a + " � positivo");
			}
			 else if(a==0)
			 {
				System.out.print(a + " � nulo");
			 }
			else
			{
				System.out.print(a + " � negativo");
			}
	}
}