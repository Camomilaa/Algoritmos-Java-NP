import java.util.Scanner;
public class Alg10{

	public static void main(String[] args){

	int dist, vol, cm;

	Scanner dados = new Scanner(System.in);

	System.out.println("Insira a dist�ncia percorrida:");
	dist=dados.nextInt();

	System.out.println("Insira o volume de combust�vel consumido:");
	vol=dados.nextInt();

	cm=dist/vol;
	System.out.println("O consumo m�dio �: " + cm + " Km/l");


	}
}