import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


//os getters e setters tao feitos pelo intelliJ é só para não me chatear
public class Equipa {
    private String nome;
    private Map<String,Barco> barcos;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Map<String, Barco> getBarcos() {
        return barcos;
    }

    public void setBarcos(Map<String, Barco> barcos) {
        this.barcos = barcos;
    }

    public double totalEmProva(String idBarco){
        return this.barcos.get(idBarco).getEtapas().stream().
                mapToDouble(x->(x.getFim().getTimeInMillis()-x.getInicio().getTimeInMillis())/3.6e4).sum();
    }
    
}
