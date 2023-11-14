public class App {
    public static void main(String[] args) throws Exception {

        Cliente diego = new Cliente();
        diego.setNome("Diego");
        Conta contaCorrente = new ContaCorrente(diego);
        contaCorrente.depositar(100);
        Conta contaPoupanca = new ContaPoupanca(diego);

        contaCorrente.transferir(20, contaPoupanca);
        

        contaCorrente.imprimirExtrado();
        contaPoupanca.imprimirExtrado();

        
    }
}
