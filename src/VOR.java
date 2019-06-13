import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class VOR {
    private Map<String, Equipa> equipas;

    public Barco getBarco(String idEquipa, String barco) throws InvalidBoatException{
        if(equipas.get(idEquipa).getBarcos().containsKey(barco)){
            return equipas.get(idEquipa).getBarcos().get(barco);
        }
        else throw new InvalidBoatException();
    }

    public List<Barco> getBarcos(String idEquipa, double milhas){
        return this.equipas.get(idEquipa).getBarcos().entrySet().stream().filter(x->x.getValue().getMilhas()>milhas).
                map(x->x.getValue()).collect(Collectors.toList());
    }

    public void removeBarco(String idEquipa, String idBarco) throws InvalidBoatException{
        if(equipas.get(idEquipa).getBarcos().containsKey(idBarco)){
            Map<String, Barco> e = this.equipas.get(idEquipa).getBarcos();
            e.remove(idBarco);
            equipas.get(idBarco).setBarcos(e);
        }
        else throw new InvalidBoatException();
    }
}
