package org.example.exercicio3;

import java.util.List;

public class Horario
{
    private List<Aula> aulas;


    public Horario() {

    }

    public Horario(List<Aula> aulas) {
        this.aulas = aulas;
    }


    public List<Aula> getAulas() {
        return aulas;
    }

    public void setAulas(List<Aula> aulas) {
        this.aulas = aulas;
    }
}
