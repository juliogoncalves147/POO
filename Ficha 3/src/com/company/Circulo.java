package com.company;

public class Circulo {

    private double x;
    private double y;
    private double raio;


    public Circulo () {
        this.x = 0;
        this.y = 0;
        this.raio = 1;
    }

    public Circulo(int x, int y, int raio) {
        this.x = x;
        this.y = y;
        this.raio = raio;
    }

    public Circulo(Circulo umCirculo) {

        this.x = umCirculo.getX();
        this.y = umCirculo.getY();
        this.raio = umCirculo.getRaio();
    }

    public double getX() {
        return this.x;
    }

    public double getY() {
        return this.y;
    }

    public double getRaio() {
        return  this.raio;
    }

    public void setX (double x) {
        this.x = x;
    }

    public void setY (double y) {
        this.y = y;
    }

    public void setRaio (double raio) {
        this.raio = raio;
    }

    public void alteraCentro(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double calculaArea(){

        double area = (Math.PI) * Math.pow(this.raio, 2);
        return  area;
    }

    public double calculaPerimetro() {
        double perimetro = 2 * (Math.PI) * this.raio;
        return perimetro;
    }

}
