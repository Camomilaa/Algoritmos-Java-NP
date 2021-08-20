import java.util.Scanner;
public class Alg17{

	public static void main(String[] args){

		int a;

		Scanner ler = new Scanner(System.in);

		System.out.println("Insira a idade do nadador:");
		a = ler.nextInt();

			if (a >= 5 && a <=12)
			{
				System.out.println("O nadador se encaixa na categoria Infantil");
			}
			else if (a >= 13 && a <18)
			{
				System.out.println("O nadador se encaixa na categoria Juvenil");
			}
			else if (a >= 18 && a <= 25)
			{
				System.out.println("O nadador se encaixa na categoria Profissional");
			}
			else
			{
				System.out.println("O nadador está fora das faixas de categoria");
			}
	}
}