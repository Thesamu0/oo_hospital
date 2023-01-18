public class Atendente extends Funcionario{
    private boolean atendendo;

    public Atendente(String cpf, String nome, int idade) {
        super(cpf, nome, idade);
        this.atendendo = false;
    }

    public final void iniciarAtendimento(){
        this.atendendo = true;
    }

    public final void finalizarAtendimento(){
        this.atendendo = false;
    }
}
