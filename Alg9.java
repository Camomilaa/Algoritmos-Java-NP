import java.util.Scanner;
public class Alg9{

		public static void main(String[] args){

		double base, altura, area;

		Scanner dados = new Scanner(System.in);

		System.out.println("Insira a base do tri�ngulo:");
		base=dados.nextDouble();

		System.out.println("Insira a altura do tri�ngulo:");
		altura=dados.nextDouble();

		area=(base*altura)/2;
		System.out.printf("A �rea do triangulo � %.2f", area);

		}
	}
