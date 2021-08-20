import java.util.Scanner;
public class Alg13{

	public static void main(String[] args){

		int a;

		Scanner ler = new Scanner(System.in);

		System.out.println("Insira um número:");
		a = ler.nextInt();

			if(a>0)
			{
				System.out.print(a + " é positivo");
			}
			 else if(a==0)
			 {
				System.out.print(a + " é nulo");
			 }
			else
			{
				System.out.print(a + " é negativo");
			}
	}
}