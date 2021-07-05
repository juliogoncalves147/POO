package com.company;

import java.awt.image.AreaAveragingScaleFilter;
import java.lang.reflect.Array;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class EncEficiente {

    private String nome;
    private String nif;
    private String morada;
    private int numero;
    private LocalDate data;
    private List<LinhaEncomenda> linhas;

    public EncEficiente(){
        this.nome = "";
        this.nif = "";
        this.morada = "";
        this.numero = 0;
        this.data = LocalDate.now();
        this.linhas = new ArrayList<>();
    }

    public EncEficiente(String nome, String nif, String morada, int numero, LocalDate data, List<LinhaEncomenda> ls) {
         this.nome = nome;
         this.nif = nif;
         this.morada = morada;
         this.numero = numero;
         this.data = data;
         // this.linhas = new ArrayList<>();
         // for(LinhaEncomenda l : ls)
         // this.linhas.add(l.clone());
         this.setLinhas(ls); // faz a mesma cena que as três linhas de cima
    }

    public EncEficiente (EncEficiente e) {
        this.nome = e.getNome();
        this.nif = e.getNif();
        this.morada = e.getMorada();
        this.numero = e.getNumero();
        this.data = e.getData();
        this.linhas = e.getLinhas();
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNif() {
        return this.nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    public String getMorada() {
        return this.morada;
    }

    public void setMorada(String morada) {
        this.morada = morada;
    }

    public int getNumero() {
        return this.numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public LocalDate getData() {
        return this.data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public List<LinhaEncomenda> getLinhas() {
        List<LinhaEncomenda> nova = new ArrayList<>();
        for(LinhaEncomenda l : this.linhas)
            nova.add(l.clone());
        return nova;
    }

    public void setLinhas(List<LinhaEncomenda> ls) {
        this.linhas = new ArrayList<>();
        for(LinhaEncomenda l : ls)
            this.linhas.add(l.clone());
    }

    public boolean equals(Object e){
        if (e == this) return true;
        if ((e == null) || (e.getClass() != this.getClass())) return false;
        EncEficiente o = (EncEficiente) e;
        return this.nome.equals(o.getNome()) &&
                this.nif.equals(o.getNif())   &&
                this.morada.equals(o.getMorada()) &&
                this.numero == o.getNumero()      &&
                this.data.equals(o.getData())    &&
                this.linhas.equals(o.getLinhas());
    }

    public EncEficiente clone() {
        return new EncEficiente(this);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("\nNome: ").append(this.nome);
        sb.append("\nNIF: ").append(this.nif);
        sb.append("\nMorada:  ").append(this.morada);
        sb.append("\nNumero: ").append(this.numero);
        sb.append("\nData: ").append(this.data);
        for(LinhaEncomenda l : this.linhas)
            sb.append("\nLinha Encomenda: ").append(l.toString());

        return sb.toString();
    }

    public double calculaValorTotal() {
        double conta = 0;
        for(LinhaEncomenda l : this.linhas)
            conta += l.calculaValorLinhaEnc();
        return conta;
    }

    public double calculaValorDesconto(){
        double desconto = 0;
        for(LinhaEncomenda l : this.linhas)
            desconto += l.calculaValorDesconto();
        return desconto;
    }

    public int numeroTotalProdutos(){
        int produtos = 0;
        for(LinhaEncomenda l : this.linhas)
            produtos += l.getQuantidade();
        return produtos;
    }

    public boolean existeProdutoEncomenda(String refProduto){
        for(LinhaEncomenda l : this.linhas)
           if (l.getReferencia().equals(refProduto)) return true;

        return false;
    }

    public void adicionaLinha(LinhaEncomenda linha){
        this.linhas.add(linha.clone());     // será necessário dar clone da linha? Se sim, porque?
    }

    public void removeProduto(String codProd) {
        this.linhas.removeIf(s->s.getReferencia().equals(codProd));
    }
}
