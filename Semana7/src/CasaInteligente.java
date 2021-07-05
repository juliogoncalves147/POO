import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CasaInteligente {

    private String morada;
    private Map<String, SmartDevice> dispositivos;
    private Map<String, List<String>> divisoes;

    public CasaInteligente(){
        this.morada = "";
        this.dispositivos = new HashMap<>();
        this.divisoes = new HashMap<>();
    }

    public CasaInteligente(String nome){
        this.morada = nome;
        this.dispositivos = new HashMap<>();
        this.divisoes = new HashMap<>();
    }


    public boolean existsDevice(String nome){
        return this.dispositivos.containsKey(nome);
    }

    public void addDevice(SmartDevice x) {
        this.dispositivos.put(x.getID(), x.clone());
    }

    public SmartDevice getDevice(String x){
        return this.dispositivos.get(x);
    }

    public void setAllOn (boolean b) {
        dispositivos.values().forEach(v -> v.setOn(b));
    }

    public void addRoom(String room){
        if (!divisoes.containsKey(room))
            divisoes.put(room, new ArrayList<>());
    }

    public void addToRoom(String room, String id){
        if(!divisoes.containsKey(room)) {
            addRoom(room);
        }
        if(!divisoes.get(room).stream().anyMatch(v -> v.equals(id)))
            divisoes.get(room).add(id);
    }

    public boolean roomHasDevice(String room, String id){
        return divisoes.get(room).stream().anyMatch(v -> v.equals(id));
    }


    public boolean hasRoom(String room){
        return divisoes.containsKey(room);
    }




}
