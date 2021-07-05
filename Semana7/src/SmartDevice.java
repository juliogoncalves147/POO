import java.util.Objects;

public class SmartDevice {

    private String Identificador;
    private boolean estado;

    public SmartDevice(){
        this.Identificador = "";
        this.estado = false;
    }

    public SmartDevice(String id){
        this.Identificador = id;
        this.estado = false;
    }

    public SmartDevice(SmartDevice sd){
        this.Identificador = sd.getID();
        this.estado = sd.getEstado();
    }

    public boolean getEstado(){
        return this.estado;
    }

    public SmartDevice(String id, boolean estado){
        this.Identificador = id;
        this.estado = estado;
    }

    public String getID(){
        return this.Identificador;
    }

    public boolean getOn(){
        return this.estado;
    }

    public void setOn(boolean e){
        this.estado = e;
    }

    public SmartDevice clone(){
        return new SmartDevice(this);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SmartDevice that = (SmartDevice) o;
        return estado == that.estado && Objects.equals(Identificador, that.Identificador);
    }

    @Override
    public int hashCode() {
        return Objects.hash(Identificador, estado);
    }
}


