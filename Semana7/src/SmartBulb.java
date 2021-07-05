public class SmartBulb extends SmartDevice {

    private int estado;

    public static final int NEUTRAL = 1;
    public static final int COLD = 0;
    public static final int WARM = 2;



    public SmartBulb(){
        super();
        this.estado = NEUTRAL;
    }


    public SmartBulb(String nome){
            super(nome);
            this.estado = NEUTRAL;
    }


    public SmartBulb(String nome, int estado){
        super(nome);
        setTone(estado);
    }


    public int getTone(){
        return  this.estado;
    }

    public void setTone(int i){
        if (i < 0) {
            this.estado = 0;
        }
        else if (i > 2) {
            this.estado = 2;
        }
        else this.estado = i;
    }



}
