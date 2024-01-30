import java.util.Scanner;

public class ContaTerminal {
    /**
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        String nomeCliente;
        int usuario;
        String agencia;
        double extrato;

        System.out.println("Por favor, digite o numero da agencia.");
        agencia = sc.next();

        System.out.println("Por favor, digite o número da Conta:");
		usuario = sc.nextInt();

        System.out.println("Insira seu saldo:");
		extrato = sc.nextDouble();

        System.out.println("Insira seu nome:");
		nomeCliente = sc.next();


        System.out.println();
        System.out.printf("Olá %s, obrigado por criar uma conta em "
				+ "nosso banco, sua agência é %s, "
				+ "conta %d e seu saldo %.2f já está disponível"
				+ " para saque.", nomeCliente, agencia, usuario, extrato);

        sc.close();
        

    }
}
