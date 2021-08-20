import java.util.Scanner;
public class exemplo
{
	public static void main(String[] args)
	{
		Scanner ler = new Scanner(System.in);

		int x, y;

		x = 1;
		y = ++x;
		System.out.println(x + " " + y);
	}
}