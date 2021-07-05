package com.company;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class GestaoEncomendas {

    private Map<Integer, EncEficiente> encomendas;

    public GestaoEncomendas() {
        this.encomendas = new HashMap<>();
    }

    public GestaoEncomendas(Map<Integer, EncEficiente> encs) {
        // this.encomendas = new HashMap<>();
        // for(EncEficiente e : encs.values())
        //     this.encomendas.put(e.getNumero(), e.clone());
        this.encomendas = encs.values().stream()
                .collect(Collectors.toMap(e -> e.getNumero(), e -> e.clone()));

    }

    public GestaoEncomendas(GestaoEncomendas ge) {
        this.encomendas = ge.getEncomendas();
    }

    public Map<Integer, EncEficiente> getEncomendas() {
        return this.encomendas.values().stream()
                .collect(Collectors.toMap(e -> e.getNumero(), e -> e.clone()));
    }

    public Set<Integer> todosCodigosEnc() {
        return new TreeSet(this.encomendas.keySet());
    }

    public void addEncomenda (EncEficiente enc){
        this.encomendas.put(enc.getNumero(), enc.clone());
    }

    public 
}
