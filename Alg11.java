import java.util.Scanner;
public class Alg11{

	public static void main(String[] args){

		double carro, valD, valI, total;

		Scanner dados = new Scanner(System.in);

		System.out.println("Insira abaixo o valor do custo de fábrica do carro:");
		carro=dados.nextDouble();

		valD = 0.12*carro; // percentual = 12/100 (distribuidor)
		valI = 0.45*carro; // percentual = 45/100 (impostos)

		total=carro+valD+valI;
		System.out.printf("O custo ao consumidor é de:R$%.2f ", total);

	}
}