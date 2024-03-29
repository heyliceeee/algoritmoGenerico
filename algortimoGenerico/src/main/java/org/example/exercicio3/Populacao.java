package org.example.exercicio3;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Populacao
{
    private List<Horario> horarios;

    public Populacao(int tamanhoPopulacao)
    {
        this.horarios = new ArrayList<>();

        for (int i = 0; i < tamanhoPopulacao; i++)
        {
            Horario horario = gerarHorarioAleatorio(); //gera um horario aleatorio
            this.horarios.add(horario);
        }
    }

    public void setHorarios(List<Horario> horarios)
    {
        this.horarios = horarios;
    }

    public List<Horario> getHorarios()
    {
        return horarios;
    }



    private Horario gerarHorarioAleatorio()
    {
        Horario horario = new Horario();
        List<Aula> aulas = new ArrayList<>(); // Lista de aulas no horário

        // Implemente a lógica para adicionar aulas aleatórias ao horário
        // Por exemplo:
        List<Sala> salasDisponiveis = obterSalasDisponiveis();
        List<Docente> docentesDisponiveis = obterDocentesDisponiveis();
        List<BlocoHoras> blocosDisponiveis = obterBlocosDisponiveis();

        // Em um loop, gere aulas aleatórias e adicione ao horário
        Random random = new Random();
        for (Turma turma : turmas)
        {
            UC uc = obterUnidadeCurricularAleatoria();
            Docente docente = obterDocenteAleatorio(docentesDisponiveis);
            BlocoHoras bloco = obterBlocoHorasAleatorio(blocosDisponiveis);
            Sala sala = obterSalaAleatoria(salasDisponiveis);

            Aula aula = new Aula(turma, uc, docente, bloco, sala);
            aulas.add(aula);

            // Remover a sala, docente e bloco utilizados para evitar duplicatas
            salasDisponiveis.remove(sala);
            docentesDisponiveis.remove(docente);
            blocosDisponiveis.remove(bloco);
        }

        horario.setAulas(aulas);
        return horario;
    }

    private List<Sala> obterSalasDisponiveis()
    {
        List<Sala> salasDisponiveis = new ArrayList<>();

        // Suponha que você tenha uma lista de todas as salas disponíveis
        List<Sala> todasSalas = obterTodasSalasDisponiveis();

        // Verifique a disponibilidade de cada sala para o bloco de horas atual
        for (Sala sala : todasSalas)
        {
            if (salaEstaDisponivelParaBloco(sala, blocoAtual))
            {
                salasDisponiveis.add(sala);
            }
        }

        return salasDisponiveis;
    }

    private List<Sala> obterTodasSalasDisponiveis()
    {
        List<Sala> todasSalas = new ArrayList<>();

        // Adicione as salas disponíveis à lista
        todasSalas.add(new Sala(1, 30)); // Exemplo: Sala com capacidade para 30 alunos
        todasSalas.add(new Sala(2, 25)); // Exemplo: Sala com capacidade para 25 alunos
        todasSalas.add(new Sala(3, 50));
        todasSalas.add(new Sala(4, 10));

        return todasSalas;
    }

    private boolean salaEstaDisponivelParaBloco(Sala sala, BlocoHoras bloco)
    {
        List<Aula> aulasAgendadas = obterAulasAgendadasParaSala(sala);

        // Verifique se há alguma sobreposição com o bloco de horas atual
        for (Aula aula : aulasAgendadas)
        {
            if (aula.getBlocoHoras().equals(bloco))
            {
                // Se houver uma aula já agendada para o mesmo bloco de horas, a sala não está disponível
                return false;
            }
        }

        return true; // Retorne true se a sala estiver disponível, caso contrário false
    }

    private List<Aula> obterAulasAgendadasParaSala(Sala sala)
    {
        List<Aula> aulasAgendadas = new ArrayList<>();

        // Suponha que você tenha uma lista de todas as aulas agendadas em seu sistema
        for (Aula aula : todasAulasAgendadas)
        {
            if (aula.getSala().equals(sala)) {
                aulasAgendadas.add(aula);
            }
        }

        return aulasAgendadas;
    }
}