package com.company;

public class Lampada {

    private int ON;
    private int ECO;
    private long inicio;
    private long termino;

    public Lampada () {
        // OFF corresponde a ON e ECO estarem a 0;
        // int 1 ativa o ON
        // int 2 ativa o ECO
        this.ON = 0;
        this.ECO = 0;
    }

    public Lampada (int f) {
        if (f == 1) {
            setTime();
            setON();
        } else if (f == 2) {
            setECO();
        }
        else if (f == 3) {
            setOFF();
        }
    }

    public void setTime() {
        inicio = 0;
        termino = 0;
    }

    public void setInicio() {
        inicio = System.nanoTime();
    }
    public void setTermino() {
        termino = System.nanoTime();
    }

    public void setON() {
        setTime();
        setInicio();
        this.ON = 1;
        this.ECO = 0;
    }

    public  void setECO() {
        setTime();
        setInicio();
        this.ON = 0;
        this.ECO = 1;
    }

    public void  setOFF() {
        this.ON = 0;
        this.ECO = 0;
        setTermino();
    }

    public void lampON() {
        setON();
    }

    public void lampOFF() {
        setOFF();
    }

    public void lampECO() {
        setECO();
    }

    public double totalConsumo(){

        double consumo = 1.32 * (termino-inicio);

        return consumo;
    }

    public static void wait(int ms)
    {
        try
        {
            Thread.sleep(ms);
        }
        catch(InterruptedException ex)
        {
            Thread.currentThread().interrupt();
        }
    }
}
