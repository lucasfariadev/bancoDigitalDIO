public abstract class Conta implements IConta{
    private static int AGENCIA_PADRAO = 1;
    private static int SEQUENCIAL = 1;

    protected int agencia;
    protected int numeroConta;
    protected double saldo;
    protected Cliente cliente;

    //construtor
    public Conta(Cliente cliente){
        this.agencia = Conta.AGENCIA_PADRAO;
        this.numeroConta = SEQUENCIAL++;
        this.cliente = cliente;

    }

    //métodos get

    int getAgencia(){
        return agencia;
    }

    int getNumeroConta(){
        return  numeroConta;
    }

    double getSaldo(){
        return saldo;
    }


    @Override
    public void sacar(double valor) {
        this.saldo -= valor;

    }

    @Override
    public void depositar(double valor) {
        this.saldo += valor;
    }

    @Override
    public void transferir(double valor, IConta contaDestino) {
        this.sacar(valor);
        contaDestino.depositar(valor);
        System.out.println("--------------------------------------------------------------------------------");
        System.out.println("Comprovante: Você transferiu R$" + valor +
                ", e o saldo restante da sua conta é R$" + this.saldo);
        System.out.println("---------------------------------------------------------------------------------");
    }

    protected void imprimirInfos(){
        System.out.println(String.format("Titular: %s", this.cliente.getNome()));
        System.out.println(String.format("Agência: %d", this.agencia));
        System.out.println(String.format("Conta: %d", this.numeroConta));
        System.out.println(String.format("Saldo: R$ %.2f", this.saldo));
        System.out.println("__________________________");
    }


}
