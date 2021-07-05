package com.company;

import java.util.Scanner;


public class Main {

    public static int[][] lerNotas(){
        Scanner sc = new Scanner(System.in);
        int[][] array = new int[5][5];

        for(int i = 0; i < 5; i++) {
           for (int a = 0; a < 5; a++) {
                System.out.print("Introduza uma nota!\n");
                array[i][a] = sc.nextInt();
             }
         }
        return array;
    }

    public static void main(String[] args) {
	    Alunos lista = new Alunos();
	    Scanner sc = new Scanner(System.in);

	    //  Exercicio 1
	    /*
	    int[][] array = new int[5][5];
	    array = lerNotas();
        lista.atualizaNotas(array);
        */

        // Exercicio 2
        /*
        int[][] array = new int[5][5];
        array = lerNotas();
        lista.atualizaNotas(array);
        System.out.print("Introduza o numero da disciplina");
        int disciplina = sc.nextInt();
        int notas = lista.calculaNotas(disciplina-1);
        System.out.println("Soma das notas e: " + notas);
        */

        // Exercicio 3
        /*
        int[][] array = new int[5][5];
        array = lerNotas();
        lista.atualizaNotas(array);
        System.out.print("Introduza o numero do aluno do qual quer a média\n");
        int aluno = sc.nextInt();
        int media = lista.calculaMediaAlunos(aluno-1);
        System.out.println("A media do aluno " + aluno + " e " + media);
        */

        // Exercicio 4
        /*
        int[][] array = new int[5][5];
        array = lerNotas();
        lista.atualizaNotas(array);
        System.out.print("Introduza o numero do UC do qual quer a média\n");
        int UC= sc.nextInt();
        int media = lista.calculaMediaUC(UC-1);
        System.out.println("A media da UC " + UC + " e " + media);
         */

        // Exercicio 5
        /*
        int[][] array = new int[5][5];
        array = lerNotas();
        lista.atualizaNotas(array);
        int max = lista.calculaMax();
        System.out.println("A nota mais alta e: " + max);
        */

        // Exercicio 6
        /*
        int[][] array = new int[5][5];
        array = lerNotas();
        lista.atualizaNotas(array);
        int min = lista.calculaMin();
        System.out.println("A nota mais baixa e: " + min);
        */

        // Exercicio 7
        /*
        int[][] array = new int[5][5];
        array = lerNotas();
        lista.atualizaNotas(array);
        System.out.println("Introduza uma nota: ");
        int min = sc.nextInt();
        int[] notas = lista.notasCima(min);
        */

        // Exercicio 8
        int[][] array = new int[5][5];
        array = lerNotas();
        lista.atualizaNotas(array);


    }
}
