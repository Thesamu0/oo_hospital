import java.util.List;

public class Paciente extends Pessoa{
    private int senhaAtendimento;
    private List<String> sintomas;

    public Paciente(String cpf, String nome, int idade, int senhaAtendimento, List<String> sintomas) {
        super(cpf, nome, idade);
        this.senhaAtendimento = senhaAtendimento;
        this.sintomas = sintomas;
    }

    public int getSenhaAtendimento() {
        return senhaAtendimento;
    }

    public void setSenhaAtendimento(int senhaAtendimento) {
        this.senhaAtendimento = senhaAtendimento;
    }

    public List<String> sintomas() {
        return sintomas;
    }
}
