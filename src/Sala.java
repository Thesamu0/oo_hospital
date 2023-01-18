import java.time.LocalDate;


public abstract class Sala {
    private int numero;
    private int andar;
    private LocalDate dataReserva;

    public Sala(int numero, int andar) {
        this.numero = numero;
        this.andar = andar;
    }

    public void reservar(int dia,int mes,int ano){
        this.dataReserva = LocalDate.of(ano,mes,dia);
        System.out.println("Sala reservada para " + dia + "/" + mes + "/" + ano);
    }
}
