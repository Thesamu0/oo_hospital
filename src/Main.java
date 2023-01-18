import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Paciente jorge = new Paciente("12345","Jorge",23,01, Arrays.asList("Dor de cabeça") );
        ClinicoGeral medico = new ClinicoGeral("4231","Marcelo",32,"abcde");

        System.out.println(medico.realizarDiagnostico(jorge.sintomas()));

        Cirurgia salaDeCirurgia = new Cirurgia(25,3);
        salaDeCirurgia.reservar(10,05,2023);
        Cirurgiao cirurgiao = new Cirurgiao("45555","Caio",54,"abfse",salaDeCirurgia);

    }
}