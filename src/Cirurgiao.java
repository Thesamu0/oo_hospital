public class Cirurgiao extends Medico{

    private Cirurgia salaDeCirurgia;

    public Cirurgiao(String cpf, String nome, int idade, String certificado, Cirurgia salaDeCirurgia) {
        super(cpf, nome, idade, certificado);
        this.salaDeCirurgia = salaDeCirurgia;
    }
}
