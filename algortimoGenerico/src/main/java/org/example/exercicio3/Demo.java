package org.example.exercicio3;


import java.util.ArrayList;
import java.util.List;

public class Demo
{
    static int tamanhoPopulacao = 100;
    static List<Horario> horariosList = new ArrayList<>();

    public static void main(String[] args)
    {
        // Criando população inicial
        Populacao populacao = new Populacao(tamanhoPopulacao);
        horariosList = populacao.getHorarios();

        // Calcular o valor de fitness para cada horário na população
        for (Horario horario : horariosList)
        {
            double fitness = Fitness.calcularFitness(horario);
            // Faça algo com o valor de fitness, como armazenar em uma lista ou exibir na tela
            System.out.println("Fitness do horário: " + fitness);
        }
    }
}
