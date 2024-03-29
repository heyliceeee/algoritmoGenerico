package org.example.exercicio3;

public class BlocoHoras
{
    private int id;
    private int horaInicio;


    public BlocoHoras(int id, int horaInicio) {
        this.id = id;
        this.horaInicio = horaInicio;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getHoraInicio() {
        return horaInicio;
    }

    public void setHoraInicio(int horaInicio) {
        this.horaInicio = horaInicio;
    }
}
