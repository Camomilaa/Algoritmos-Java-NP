import java.util.Scanner;
public class Alg19{

	public static void main(String[] args){

	int idade;

	Scanner ler = new Scanner(System.in);

	System.out.println("Insira sua idade:");
	idade = ler.nextInt();

	if (idade < 16)
	{
		System.out.println("Sua classe eleitoral �: N�O ELEITOR!");
	}
	else if (idade >= 16 && idade < 18 || idade > 65)
	{
		System.out.println("Sua classe eleitoral �: ELEITOR FACULTATIVO!");
	}
	else
	{
		System.out.println("Sua classe eleitoral �: ELEITOR OBRIGAT�RIO!");
	}
	}
}