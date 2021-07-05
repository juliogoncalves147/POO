package com.company;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Stack {

    private int contador;
    private List<String> stack;

    public Stack(){
        this.contador = 0;
        this.stack = new ArrayList<>();
    }

    public Stack(int contador, List<String> stack){
        this.contador = contador;
        this.stack = new ArrayList<>();
        for(String l : stack)
            this.stack.add(l);
    }

    public Stack(Stack l){
        this.contador= l.getContador();
        this.stack = l.getStack();
    }

    public int getContador() {
        return this.contador;
    }

    public void setContador(int contador) {
        this.contador = contador;
    }

    public List<String> getStack() {
        return this.stack;
    }

    public void setStack(List<String> stack) {
        this.stack = stack;
    }

    public void imprime(){
        for(String l : this.stack)
            System.out.println(l + "\n");

    }

    public String top(){
        String a = new String();
        if (!this.stack.isEmpty()) {
           Iterator itr = this.stack.iterator();
           while(itr.hasNext()) {
               a = (String) itr.next();
           }
            return a;
        }
        return null;
    }

    public String topI(){
        return this.stack.stream().reduce((first,second)->second).orElse(null);
    }

    void push(String s){
        this.stack.add(s);
    }

    void pop(){
        if (!this.stack.isEmpty()) {
            this.stack.remove(stack.size() - 1);
        }
    }

    boolean empty() {
        return this.stack.isEmpty();
    }

    int length(){
        return this.stack.size();
    }
}
