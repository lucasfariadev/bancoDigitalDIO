public class ContaCorrente extends Conta {

    public ContaCorrente(Cliente cliente){
        super(cliente);
    }

    @Override
    public void imprimirExtrato(){
        System.out.println("_____EXTRATO CORRENTE_____");
        super.imprimirInfos();
    }

}
