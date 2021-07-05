package com.company;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void iniciateste(){
        EncEficiente teste = new EncEficiente();
        String nova = new String();
               nova = teste.toString();
               System.out.println(nova);
    }

    public static void testeparametrizado(EncEficiente teste) {
        String nova = new String();
        nova = teste.toString();
        System.out.println("\n" + nova + "\n");

        double conta = teste.calculaValorTotal();
        double desconto = teste.calculaValorDesconto();
        int produtos = teste.numeroTotalProdutos();
        boolean check = teste.existeProdutoEncomenda("Bolachas");
        System.out.println("A conta total são: " + conta + " euros\n");
        System.out.println("Obteve um desconto total de: " + desconto + " euros\n");
        System.out.println("Comprou um total de: " + produtos + " produtos\n");
        System.out.println("Existem bebidas na sua encomenda? " + check + "\n");
    }

    public static void testaremove(EncEficiente teste) {
        teste.removeProduto("Bolachas");

        String novo = new String();
        novo = teste.toString();
        System.out.println("\n" + novo + "\n");
    }

    public static void main(String[] args) {
       /* LocalDate data = LocalDate.now();
        LinhaEncomenda ls = new LinhaEncomenda();
        ls.setReferencia("Bolachas");
        ls.setDescricao("Maria");
        ls.setPreco(2.99);
        ls.setQuantidade(1);
        ls.setImposto(1.23);
        ls.setDesconto(1);

        LinhaEncomenda l2 = new LinhaEncomenda();
        l2.setReferencia("Bebida");
        l2.setDescricao("CocaCola");
        l2.setPreco(4.49);
        l2.setQuantidade(2);
        l2.setImposto(1.23);
        l2.setDesconto(0.5);

        List<LinhaEncomenda> encomenda = new ArrayList<>();
        encomenda.add(l2);

        EncEficiente teste = new EncEficiente("Joao", "237880889", "Braga", 966876243, data, encomenda);

        //testa metodos da Classe EncEficiente
              teste.adicionaLinha(ls);
           // iniciateste();
              testeparametrizado(teste);
           // testaremove(teste);

           */

        Stack nova = new Stack();
        nova.getStack().add("Um");
        nova.getStack().add("Dois");
        nova.getStack().add("Tres");



        int a = nova.length();
        System.out.println(a +"\n");
        nova.imprime();
    }
}
