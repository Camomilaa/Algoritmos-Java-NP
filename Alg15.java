import java.util.Scanner;
public class Alg15{

	public static void main(String[] args){

		String time1, time2;
		int gols1, gols2;

		Scanner dados = new Scanner(System.in);

		System.out.println("Digite abaixo o nome do primeiro time:");
		time1 = dados.nextLine();

		System.out.println("Quantos gols o primeiro time marcou na partida?");
		gols1 = dados.nextInt();

		dados = new Scanner(System.in);

		System.out.println("Digite o nome do segundo time:");
		time2 = dados.nextLine();

		System.out.println("Quantos gols o segundo time marcou na partida?");
		gols2 = dados.nextInt();

			if (gols1 == gols2)
			{
				System.out.println("A partida acabou em EMPATE!");
			}
			else if (gols1 > gols2)
			{
				System.out.println(time1 + " foi o vencedor!");
			}
			else
			{
				System.out.println(time2 + " foi o vencedor!");
			}
	}
}