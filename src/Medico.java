import java.util.List;

public class Medico extends Funcionario{
    private String certificado;
    private Paciente paciente;

    public Medico(String cpf, String nome, int idade, String certificado) {
        super(cpf, nome, idade);
        this.certificado = certificado;
    }

    public final void receberPaciente(Paciente pac){
        this.paciente = pac;
    }

    public final void dispensarPaciente(){
        this.paciente = null;
    }

    public String getCertificado() {
        return certificado;
    }

    public void setCertificado(String certificado) {
        this.certificado = certificado;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public String realizarDiagnostico(List<String> sintomas){
        if(sintomas.size() == 0){
            return "Paciente saudável";
        } else if (sintomas.size()<=2) {
            return "Paciente está doente";
        }
        else{
            return "Paciente muito doente";
        }
    }
}
