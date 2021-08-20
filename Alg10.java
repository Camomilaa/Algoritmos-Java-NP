import java.util.Scanner;
public class Alg10{

	public static void main(String[] args){

	int dist, vol, cm;

	Scanner dados = new Scanner(System.in);

	System.out.println("Insira a distância percorrida:");
	dist=dados.nextInt();

	System.out.println("Insira o volume de combustível consumido:");
	vol=dados.nextInt();

	cm=dist/vol;
	System.out.println("O consumo médio é: " + cm + " Km/l");


	}
}