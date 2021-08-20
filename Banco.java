import java.util.Scanner;
public class Banco
{
	public static void main(String[] args)
	{
		Scanner ler = new Scanner(System.in);

		//DECLARANDO VARIAVEIS

		String nome;
		int numCC, numCP, c = 0, op = 0, opSec;
		double salCC, salCP, valMov;

		System.out.println("Entre com o nome do cliente:");
		nome = ler.nextLine();

		System.out.println("Entre com o número da Conta Corrente:");
		numCC = ler.nextInt();

		System.out.println("Entre com o saldo inicial da Conta Corrente " + numCC + ":");
		salCC = ler.nextDouble();

		System.out.println("Entre com o número da Conta Poupança:");
		numCP = ler.nextInt();

		System.out.println("Entre com seu saldo inicial da Conta Poupança " + numCP + ":");
		salCP = ler.nextDouble();

		// MENU E OPERAÇÕES

		while (c == 0)
		{
			System.out.printf("Qual operação deseja realizar:\n1 – Creditar\n2 – Debitar\n3 – Transferir\n4 - Saldo\n5 – Sair\n");
			op = ler.nextInt();
			System.out.println("opção -> " + op);

			switch (op)
			{
				case 1:
					System.out.println("Qual conta?\n1 – Corrente\n2 – Poupança");
					opSec = ler.nextInt();
					System.out.println("opção -> " + opSec);

					if (opSec == 1)
					{
						System.out.println("Qual valor a creditar na conta corrente " + numCC + "?");
						valMov = ler.nextDouble();
						salCC += valMov;
						System.out.printf("\nSaldo atual na Conta Corrente %d -> R$%.2f\n", numCC, salCC);
					}
					else if (opSec == 2)
					{
						System.out.println("Qual valor a creditar na conta poupança " + numCP + "?");
						valMov = ler.nextDouble();
						salCP += valMov;
						System.out.printf("Saldo atual na Conta Poupança %d -> R$%.2f\n", numCP, salCP);
					}
					else
					{
						System.out.println("Erro!");
					}
					break;

				case 2:
					System.out.println("Qual conta?\n1 – Corrente\n2 – Poupança");
					opSec = ler.nextInt();
					System.out.println("opção -> " + opSec);

					if (opSec == 1)
					{
						System.out.println("Qual valor a debitar na conta corrente " + numCC + "?");
						valMov = ler.nextDouble();
						salCC -= valMov;
						System.out.printf("Saldo atual na Conta Corrente %d -> R$%.2f\n", numCC, salCC);
					}
					else if (opSec == 2)
					{
						System.out.println("Qual valor a debitar na conta poupança " + numCP + "?");
						valMov = ler.nextDouble();
						salCP -= valMov;
						System.out.printf("Saldo atual na Conta Poupança %d -> R$%.2f\n", numCP, salCP);
					}
					else
					{
						System.out.println("Erro!");
					}
					break;

				case 3:
					System.out.printf("Entre \n1 - Conta corrente e poupança\n2 - Poupança e conta corrente\n");
					opSec = ler.nextInt();
					System.out.println("opção -> " + opSec);

					if (opSec == 1)
					{
						System.out.println("Qual valor a transferir da CC " + numCC + " para CP " + numCP + "?");
						valMov = ler.nextDouble();
						if (valMov > salCC)
						{
							System.out.println("SALDO INSUFICIENTE");
							System.out.printf("Saldo atual na Conta Corrente %d -> %.2f\n", numCC, salCC);
							System.out.printf("Saldo atual na Conta Poupança %d -> %.2f\n", numCP, salCP);
						}
						else
						{
							salCC -= valMov;
							salCP += valMov;
							System.out.printf("\nSaldo atual na Conta Corrente %d -> %.2f\n", numCC, salCC);
							System.out.printf("Saldo atual na Conta Poupança %d -> %.2f\n", numCC, salCP);
						}
					}
					else if (opSec == 2)
					{
						System.out.println("Qual valor a transferir da CP " + numCP + " para CC " + numCC + "?");
						valMov = ler.nextDouble();
						if (valMov > salCP)
						{
							System.out.println("SALDO INSUFICIENTE");
							System.out.printf("Saldo atual na Conta Poupança %d -> %.2f\n", numCP, salCP);
							System.out.printf("Saldo atual na Conta Corrente %d -> %.2f\n", numCC, salCC);
						}
						else
						{
							salCP -= valMov;
							salCC += valMov;
							System.out.printf("\nSaldo atual na Conta Poupança %d -> %.2f\n", numCP, salCP);
							System.out.printf("Saldo atual na Conta Corrente %d -> %.2f\n", numCC, salCC);
						}
					}
					else
					{
						System.out.println("Erro!");
					}
					break;

				case 4:
					System.out.println("Senhor(a) " + nome);
					System.out.printf("Saldo da sua Conta Corrente %d -> %.2f\n", numCC, salCC);
					System.out.printf("Saldo da sua Conta Poupança %d -> %.2f\n", numCP, salCP);
					break;

				case 5:
					System.out.println("Obrigado por trabalhar com o nosso banco!");
					c++;
					break;

				default:
					System.out.println("Erro!");
					break;
			}
		}
	}
}