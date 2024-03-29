package org.example.exercicio3;

public class Aula
{
    private Turma turma;
    private UC UC;
    private Docente docente;
    private BlocoHoras blocoHoras; //1 blocoHoras = 2h
    private Sala sala;


    public Aula(Turma turma, UC UC, Docente docente, BlocoHoras blocoHoras, Sala sala) {
        this.turma = turma;
        this.UC = UC;
        this.docente = docente;
        this.blocoHoras = blocoHoras;
        this.sala = sala;
    }


    public Turma getTurma() {
        return turma;
    }

    public void setTurma(Turma turma) {
        this.turma = turma;
    }

    public org.example.exercicio3.UC getUC() {
        return UC;
    }

    public void setUC(org.example.exercicio3.UC UC) {
        this.UC = UC;
    }

    public Docente getDocente() {
        return docente;
    }

    public void setDocente(Docente docente) {
        this.docente = docente;
    }

    public BlocoHoras getBlocoHoras() {
        return blocoHoras;
    }

    public void setBlocoHoras(BlocoHoras blocoHoras) {
        this.blocoHoras = blocoHoras;
    }

    public Sala getSala() {
        return sala;
    }

    public void setSala(Sala sala) {
        this.sala = sala;
    }
}
