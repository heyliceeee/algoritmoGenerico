package org.example.exercicio3;

public class Turma
{
    private int id;
    private int tamanho;


    public Turma(int id, int tamanho) {
        this.id = id;
        this.tamanho = tamanho;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }
}
