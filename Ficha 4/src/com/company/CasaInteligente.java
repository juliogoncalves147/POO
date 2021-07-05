package com.company;

import java.util.ArrayList;
import java.util.List;

public class CasaInteligente {
    private List<Lampada> casa;

    public CasaInteligente(){
        this.casa = new ArrayList<>();
    }

    public CasaInteligente(List<Lampada> casa){
        this.casa = new ArrayList<>();
        for(Lampada l : casa)
            this.casa.add(l.clone());
    }

    public void addLampada(Lampada l){
        this.casa.add(l);
    }

    public void ligaLampadaNormal(int index){
        this.casa.get(index).lampON();
    }

    public void ligaLampadaEco(int index){
        this.casa.get(index).lampECO();
    }

    public int qtEmEco(){
       return (int) this.casa.stream().filter(lampada -> (lampada.getModo() == 1)).count();
    }

    public void imprime(){
        casa.forEach(lampada -> System.out.println(lampada.getModo()));
    }

    public void removeLampada(int index){
        casa.remove(index);
    }

    public void ligaTodasEco(){
        casa.stream().forEach(lampada -> lampada.lampECO());
    }

    public void ligaTodasMax(){
        casa.stream().forEach(lampada->lampada.lampON());
    }

    public double consumoTotal(){
       return (double) this.casa.stream().total(lampada -> lampada.totalConsumo());
    }

}
