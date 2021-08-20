import java.util.Scanner;
public class Alg36 {

    public static void main(String[] args)
    {
    	Scanner ler = new Scanner(System.in);

    	int c = 1,idade = 0, jovem = 0, idoso = 0;

    	while (c <= 10)
    	{
    		System.out.println("Insira a idade:");
    		idade = ler.nextInt();

    		if (idade < 21)
    		{
    			jovem++;
    		}
    		else if (idade > 50)
    		{
    			idoso++;
    		}
    		else
    		{
    		}
    		c++;
    	}
    	System.out.printf("A quantidade de pessoas com a idade abaixo de 21 anos é: %d", jovem);
    	System.out.printf("\nAquantidade de pessoas com a idade acima de 50 anos é: %d", idoso);
    }


}