import java.util.GregorianCalendar;

public class RegistoEtapa {
    private GregorianCalendar inicio, fim;
    private String nome;
    private double milhas;

    public GregorianCalendar getInicio() {
        return inicio;
    }

    public void setInicio(GregorianCalendar inicio) {
        this.inicio = inicio;
    }

    public GregorianCalendar getFim() {
        return fim;
    }

    public void setFim(GregorianCalendar fim) {
        this.fim = fim;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getMilhas() {
        return milhas;
    }

    public void setMilhas(int milhas) {
        this.milhas = milhas;
    }
}
