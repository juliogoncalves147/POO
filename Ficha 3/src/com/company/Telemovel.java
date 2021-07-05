package com.company;

public class Telemovel {

    private String marca;
    private String modelo;
    private int resolx;
    private int resoly;
    private int numMensagens;
    private String[] mensagens;
    private int dimFotos;
    private int dimApps;
    private double armazenamentoTotal;
    private double ocupado;
    private int numFotos;
    private int numApps;
    private String[] apps;


    public Telemovel() {
        setMarca("n/a");
        setModelo("n/a");
        setResolx(0);
        setResoly(0);
        setNumMensagens(0);
        this.mensagens = (new String[100]);
        setDimFotos(1024);
        setDimApps(2048);
        setArmazenamentoTotal(getDimApps() + getDimFotos());
        setOcupado(0);
        setNumApps(0);
        setNumFotos(0);
        this.apps = new String[100];
    }

    public void instalaApp(String nome, int tamanho) {

        if (existeEspaco(tamanho)) {
            setNumApps(getNumApps()+1);
            setOcupado(getOcupado()+tamanho);
            setApp(nome, getNumApps());
        }
        else System.out.print("Nao existe espaço para a aplicação");
    }

    public boolean existeEspaco(int numeroBytes) {
        if (this.ocupado + numeroBytes > this.armazenamentoTotal) return false;
        else return true;
    }


    public String getMarca() {
        return this.marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getResolx() {
        return resolx;
    }

    public void setResolx(int x) {
        this.resolx = x;
    }

    public int getResoly() {
        return resoly;
    }

    public void setResoly(int y) {
        this.resoly = y;
    }

    public int getNumMensagens() {
        return numMensagens;
    }

    public void setNumMensagens(int numMensagens) {
        this.numMensagens = numMensagens;
    }
    public String getMensagem(int idx) {
        return mensagens[idx];
    }

    public String[] getMensagens() {
        return mensagens;
    }

    public void setMensagem(String msg, int idx) {
        this.mensagens[idx - 1] = msg;
    }

    public int getDimFotos() {
        return dimFotos;
    }

    public void setDimFotos(int dimFotos) {
        this.dimFotos = dimFotos;
    }

    public int getDimApps() {
        return dimApps;
    }

    public void setDimApps(int dimApps) {
        this.dimApps = dimApps;
    }

    public double getArmazenamentoTotal() {
        return armazenamentoTotal;
    }

    public void setArmazenamentoTotal(double armazenamentoTotal) {
        this.armazenamentoTotal = armazenamentoTotal;
    }

    public double getOcupado() {
        return ocupado;
    }

    public void setOcupado(double ocupado) {
        this.ocupado = ocupado;
    }

    public int getNumFotos() {
        return numFotos;
    }

    public void setNumFotos(int numFotos) {
        this.numFotos = numFotos;
    }

    public int getNumApps() {
        return numApps;
    }

    public void setNumApps(int numApps) {
        this.numApps = numApps;
    }

    public String[] getApps() {
        return apps;
    }
    public  String get_App(int idx) {
        return apps[idx];
    }

    public void setApp(String app, int idx) {
        this.apps[idx -1] = app;
    }
    public void setApps(String[] apps) {
        this.apps = apps;
    }



}