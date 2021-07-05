public class SmartSpeaker extends SmartDevice {

    public static final int MAX = 20;

    private int volume;
    private String canal;

    public SmartSpeaker(){
        super();
        this.volume = 0;
        this.canal = "";
    }

    public SmartSpeaker(String nome){
        super(nome);
        this.volume  = 0;
        this.canal = "";
    }

    public SmartSpeaker(String nome, String canal, int volume){
        super(nome);
        this.canal = canal;
        setVolume(volume);
    }

    public int getVolume(){
        return this.volume;
    }

    public void setVolume(int volume){
        if (volume < 0) this.volume = 0;
        else if (volume == MAX || volume > 20) this.volume = 20;
        else this.volume = volume;
    }

    public void volumeUp(){
        if (this.volume < 20) this.volume++;
    }

    public void volumeDown(){
        if (this.volume > 0) this.volume--;
    }

    public String getChannel(){
        return this.canal;
    }

    public void setChannel(String nome){
        this.canal = nome;
    }


}
