import java.io.IOException;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) throws IOException {
 	Scanner dados = new Scanner(System.in);

 		int num, c = 1, pos = 0, par = 0, impar = 0, neg = 0;

 		while (c <= 5)
 		{
 			num = dados.nextInt();

 			if (num > 0)
 			{
 				pos++;
 				if (num % 2 == 0)
 				{
 					par++;
 				}
 				else
 				{
 					impar++;
 				}
 			}
 			else if (num == 0)
 			{
 				par++;
 			}
 			else
 			{
 				neg++;
 				if (num % 2 == 0)
 				{
 					par++;
 				}
 				else
 				{
 					impar++;
 				}
 			}
 			c ++;
 		}

 		System.out.println(par + " valor(es) par(es)");
 		System.out.println(impar + " valor(es) impar(es)");
 		System.out.println(pos + " valor(es) positivo(s)");
 		System.out.println(neg + " valor(es) negativo(s)");
    }

}