import com.sun.xml.internal.messaging.saaj.packaging.mime.util.LineInputStream;

import java.util.List;
import java.util.Set;

//os getters e setters tao feitos pelo intelliJ é só para não me chatear
public class Barco {
    private String id;
    private double milhas;
    private String categoria;
    private double autonomia;
    private Pessoa skipper;
    private Set<Pessoa> tripulantes;
    private List<RegistoEtapa> etapas;

    public List<RegistoEtapa> getEtapas() {
        return etapas;
    }

    public void setEtapas(List<RegistoEtapa> etapas) {
        this.etapas = etapas;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getMilhas() {
        return milhas;
    }

    public void setMilhas(double milhas) {
        this.milhas = milhas;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public double getAutonomia() {
        return autonomia;
    }

    public void setAutonomia(double autonomia) {
        this.autonomia = autonomia;
    }

    public Pessoa getSkipper() {
        return skipper;
    }

    public void setSkipper(Pessoa skipper) {
        this.skipper = skipper;
    }

    public Set<Pessoa> getTripulantes() {
        return tripulantes;
    }

    public void setTripulantes(Set<Pessoa> tripulantes) {
        this.tripulantes = tripulantes;
    }
}
