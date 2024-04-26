import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);
        int numeroAge;
        String agencia;
        String nomeCliente;
        double saldo;

        System.out.println("Digite o nome de Usuário: ");
        nomeCliente = teclado.next();

        System.out.println("Digite o nome de sua Agencia: ");
        agencia = teclado.next();
        
        System.out.println("Digite o numero da sua Agencia: ");
        numeroAge = Integer.parseInt(teclado.next());
        
        System.out.println("Digite o seu saldo: ");
        saldo = Double.parseDouble(teclado.next());
        
        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numeroAge + " e seu saldo " + saldo + " já está disponível para saque.");
    }
}
