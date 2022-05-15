import java.util.ArrayList;
import java.util.List;

public class Banco implements IBanco{
    ArrayList<Conta> contas = new ArrayList<Conta>();
    String nome;

    public Banco(String nome){
        this.nome = nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public void abreConta(Conta conta) {
        this.contas.add(conta);
    }

    void getInfoContas(){
        for (Conta conta : contas){
            System.out.println("_____Informações Contas____");
            System.out.println(String.format("Banco %s ", nome));
            System.out.println(String.format("Titular %s:", conta.cliente.getNome()));
            System.out.println(String.format("Agencia: %d",conta.agencia));
            System.out.println(String.format("Conta: %d", conta.numeroConta));
            System.out.println("----------------------------");


        }
    }
}