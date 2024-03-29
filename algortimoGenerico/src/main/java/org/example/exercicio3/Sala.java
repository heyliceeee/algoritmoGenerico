package org.example.exercicio3;

public class Sala
{
    private int id;
    private int capacidade;
    private List<Aula> aulasAgendadas;


    public Sala(int id, int capacidade) {
        this.id = id;
        this.capacidade = capacidade;
    }


    public boolean estaDisponivelParaBloco(BlocoHoras bloco)
    {
        // Verifique se há alguma sobreposição com o bloco de horas atual
        for (Aula aula : aulasAgendadas)
        {
            if (aula.getBlocoHoras().equals(bloco))
            {
                // Se houver uma aula já agendada para o mesmo bloco de horas, a sala não está disponível
                return false;
            }
        }
        return true; // Retorne true se a sala estiver disponível para o bloco de horas, caso contrário false
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }
}
