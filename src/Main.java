import java.util.Date;

public class Main {

    public static void main(String[] args) {

        Cliente rodrigo = new Cliente();
        rodrigo.setNome("Rodrigo Santos");

        Conta cc = new ContaCorrente(rodrigo);
        Conta poupanca = new ContaPoupanca(rodrigo);

//Testando transferencia para analisar programa

        cc.depositar(1100);
        cc.transferir(100, poupanca);
        cc.transferir(50, poupanca);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();

        // Inserido data para Extrato

        Date data = new Date();
        System.out.println("Data Transação: "+data);
    }
}

