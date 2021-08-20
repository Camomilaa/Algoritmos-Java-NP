import java.util.Scanner;
public class Alg9{

		public static void main(String[] args){

		double base, altura, area;

		Scanner dados = new Scanner(System.in);

		System.out.println("Insira a base do triângulo:");
		base=dados.nextDouble();

		System.out.println("Insira a altura do triângulo:");
		altura=dados.nextDouble();

		area=(base*altura)/2;
		System.out.printf("A área do triangulo é %.2f", area);

		}
	}
