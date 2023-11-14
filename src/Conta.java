public abstract class Conta implements IConta {
    protected int agencia;
    protected int numero;
    protected double saldo;
    protected Cliente cliente;
    protected Banco banco;

    protected static int SEQUENCIAL = 1;
    protected static int AGENCIA_PADRAO = 1;

    public Conta (Cliente cliente) {
    this.agencia = Conta.AGENCIA_PADRAO;
        this.numero = Conta.SEQUENCIAL++;
        this.cliente = cliente;
        
    }

        public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    protected void imprimirInfosComuns() {
        System.out.println("Agencia: " + agencia);
        System.out.println("Número: " + numero);
        System.out.println("Titular: " + this.cliente.getNome());
        System.out.println("Saldo: " + saldo);
    }

    

    @Override
    public void sacar(double valor) {
        saldo -= valor;
    }

    @Override
    public void depositar(double valor) {
       saldo += valor;
    }

    @Override
    public void transferir(double valor, Conta contaDestino) {
        this.sacar(valor);
        contaDestino.depositar(valor);
    }

    
}
