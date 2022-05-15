public class Main {
    public static void main(String[] args) {

        Cliente clarkKent = new Cliente("Clark Kent");
        Cliente bruceWeyne = new Cliente("Bruce Weyne");


        Conta contaCorrenteClark = new ContaCorrente(clarkKent);
        Conta contaPoupancaClark = new ContaPoupanca(clarkKent);
        Conta contaPoupancaBruce = new ContaPoupanca(bruceWeyne);


        Banco heroesBank = new Banco("Heroes Bank");
        heroesBank.abreConta(contaCorrenteClark);
        heroesBank.abreConta(contaPoupancaClark);
        heroesBank.abreConta(contaPoupancaBruce);

        heroesBank.getInfoContas();


    }
}
