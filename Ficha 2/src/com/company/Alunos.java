package com.company;

import java.util.Arrays;

public class Alunos {

    int[][] notasTurma = new int[5][5];

    public void atualizaNotas(int[][] array) {
        this.notasTurma = array;

        for (int c = 0; c < 5; c++) {
            for (int z = 0; z < 5; z++) {
                System.out.println("Nota da Turma  " + notasTurma[c][z]);
            }
        }
    }

    public int calculaNotas(int i) {
        int notas = 0;
        for (int a = 0; a < 5; a++) {
            notas += notasTurma[a][i];
        }
        return notas;
    }

    public int calculaMediaAluno(int i) {
        int media = 0;
        for (int a = 0; a < 5; a++) {
            media += notasTurma[i][a];
        }
        return media / 5;
    }

    public int calculaMediaUC(int i) {
        int media = 0;
        for (int a = 0; a < 5; a++) {
            media += notasTurma[a][i];
        }
        return media / 5;
    }

    public int calculaMax() {
        int max = 0;
        for (int a = 0; a < 5; a++) {
            for (int b = 0; b < 5; b++) {
                if (notasTurma[a][b] >= max) max = notasTurma[a][b];
            }
        }
        return max;
    }

    public int calculaMin() {
        int min = 1000;
        for (int a = 0; a < 5; a++) {
            for (int b = 0; b < 5; b++) {
                if (notasTurma[a][b] <= min) min = notasTurma[a][b];
            }
        }
        return min;
    }

    public int[] notasCima(int i) {
        int contador = 0;
        int[] array = new int[25];
        for (int a = 0; a < 5; a++) {
            for (int b = 0; b < 5; b++) {
                if (notasTurma[a][b] > i) {
                    array[contador] = notasTurma[a][b];
                    contador++;
                }
            }
        }
        int[] newarray = new int[contador];
        System.arraycopy(array, 0, newarray, 0, contador);
        return newarray;
    }

    public String devolveNotas() {
        String[] notas = new String[25];
        for (int a = 0; a < 5; a++) {
            for (int b = 0; b < 5; b++) {
d
            }
        }
    }
}
