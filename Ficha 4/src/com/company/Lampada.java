package com.company;

import java.text.DecimalFormat;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class Lampada {
    private int modo; //0 - off | 1 - economico | 2 - on
    private LocalDateTime last_change;
    //LocalDateTime switch_mode;
    private Duration ligado;
    private Duration eco;
    private Duration desligado;
    private Duration ligado_rest;
    private Duration eco_rest;

    public Lampada(){
        this.modo = 0;
        this.last_change = LocalDateTime.now();
        //this.switch_mode = LocalDateTime.now();
        ligado = Duration.ZERO;
        eco = Duration.ZERO;
        desligado = Duration.ZERO;
        ligado_rest = Duration.ZERO;
        eco_rest = Duration.ZERO;
    }

    public Lampada(Lampada e){
        this.modo = e.getModo();
        this.last_change = e.getLast_change();
        this.ligado = e.getLigado();
        this.eco = e.getEco();
        this.desligado = e.getDesligado();
        this.ligado_rest = e.getLigado_rest();
        this.eco_rest = e.getEco_rest();
    }

    public void atualizaTempos(){
        LocalDateTime present = LocalDateTime.now();
        Duration intervalo = Duration.between(this.last_change,present); //Tempo desde ultima mudança
        this.last_change = LocalDateTime.now();                     //Atualiza tempo de ultima mudança

        switch(this.modo){ //Soma ao tempo que esteve em x modo
            case 0:
                this.desligado = this.desligado.plus(intervalo);
                break;
            case 1:
                this.eco = this.eco.plus(intervalo);
                this.eco_rest = this.eco_rest.plus(intervalo);
                break;
            case 2:
                this.ligado = this.ligado.plus(intervalo);
                this.ligado_rest = this.ligado_rest.plus(intervalo);
                break;
            default:
                break;
        }
    }
    public void lampOFF(){
        this.atualizaTempos();
        this.ligado_rest = Duration.ZERO;
        this.eco_rest = Duration.ZERO;
        this.modo = 0; //Atualiza modo atual
    }
    public void lampON(){
        this.atualizaTempos();
        this.modo = 2; //Atualiza modo atual
    }

    public int getModo() {
        return modo;
    }

    public void setModo(int modo) {
        this.modo = modo;
    }

    public LocalDateTime getLast_change() {
        return last_change;
    }

    public void setLast_change(LocalDateTime last_change) {
        this.last_change = last_change;
    }

    public Duration getLigado() {
        return ligado;
    }

    public void setLigado(Duration ligado) {
        this.ligado = ligado;
    }

    public Duration getEco() {
        return eco;
    }

    public void setEco(Duration eco) {
        this.eco = eco;
    }

    public Duration getDesligado() {
        return desligado;
    }

    public void setDesligado(Duration desligado) {
        this.desligado = desligado;
    }

    public Duration getLigado_rest() {
        return ligado_rest;
    }

    public void setLigado_rest(Duration ligado_rest) {
        this.ligado_rest = ligado_rest;
    }

    public Duration getEco_rest() {
        return eco_rest;
    }

    public void setEco_rest(Duration eco_rest) {
        this.eco_rest = eco_rest;
    }

    public void lampECO(){
        this.atualizaTempos();
        this.modo = 1; //Atualiza modo atual
    }
    public String toString(){
        return "Ligado: " + ligado.toString() + " | ECO: " + eco.toString() +
                " | Desligado: " + desligado.toString();
    }
    public double totalConsumo() {
        return ligado.toMillis() * 0.9 + eco.toMillis() * 0.1;
    }

    public Lampada clone() {
        return new Lampada(this);
    }
}