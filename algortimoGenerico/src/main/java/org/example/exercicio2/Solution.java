package org.example.exercicio2;

import java.util.ArrayList;
import java.util.List;

public class Solution implements Comparable<Solution>
{
    List<Objeto> objetosList = new ArrayList<>();

    public Solution()
    {
        objetosList.add(new Objeto("Espada Mágica", 2.5, 100.0));
        objetosList.add(new Objeto("Poção de Cura", 0.5, 50.0));
        objetosList.add(new Objeto("Pedra Preciosa", 0.2, 200.0));
        objetosList.add(new Objeto("Escudo de Ouro", 3.0, 150.0));
        objetosList.add(new Objeto("Espada de Aço", 2.5, 50.0));
        objetosList.add(new Objeto("Poção de Cura", 0.2, 30.0));
        objetosList.add(new Objeto("Elmo de Ferro", 1.8, 80.0));
        objetosList.add(new Objeto("Pergaminho de Teleporte", 0.1, 500.0));
        objetosList.add(new Objeto("Gema Preciosa", 0.05, 200.0));
        objetosList.add(new Objeto("Adaga Envenenada", 1.0, 80.0));
        objetosList.add(new Objeto("Anel de Poder", 0.3, 300.0));
        objetosList.add(new Objeto("Amuleto da Sorte", 0.1, 150.0));
        objetosList.add(new Objeto("Lanterna Mágica", 0.8, 120.0));
        objetosList.add(new Objeto("Botas Velozes", 0.6, 180.0));
        objetosList.add(new Objeto("Coroa de Diamante", 0.7, 500.0));
    }


    /**
     * Compares this object with the specified object for order.  Returns a
     * negative integer, zero, or a positive integer as this object is less
     * than, equal to, or greater than the specified object.
     *
     * <p>The implementor must ensure {@link Integer#signum
     * signum}{@code (x.compareTo(y)) == -signum(y.compareTo(x))} for
     * all {@code x} and {@code y}.  (This implies that {@code
     * x.compareTo(y)} must throw an exception if and only if {@code
     * y.compareTo(x)} throws an exception.)
     *
     * <p>The implementor must also ensure that the relation is transitive:
     * {@code (x.compareTo(y) > 0 && y.compareTo(z) > 0)} implies
     * {@code x.compareTo(z) > 0}.
     *
     * <p>Finally, the implementor must ensure that {@code
     * x.compareTo(y)==0} implies that {@code signum(x.compareTo(z))
     * == signum(y.compareTo(z))}, for all {@code z}.
     *
     * @param o the object to be compared.
     * @return a negative integer, zero, or a positive integer as this object
     * is less than, equal to, or greater than the specified object.
     * @throws NullPointerException if the specified object is null
     * @throws ClassCastException   if the specified object's type prevents it
     *                              from being compared to this object.
     * @apiNote It is strongly recommended, but <i>not</i> strictly required that
     * {@code (x.compareTo(y)==0) == (x.equals(y))}.  Generally speaking, any
     * class that implements the {@code Comparable} interface and violates
     * this condition should clearly indicate this fact.  The recommended
     * language is "Note: this class has a natural ordering that is
     * inconsistent with equals."
     */
    @Override
    public int compareTo(Solution o)
    {
        if(this.getFitnessFunction() > o.getFitnessFunction()) //se a funcao fitness atual for maior que a seguinte (melhor solucao)
        {
            return 1;
        }

        if(this.getFitnessFunction() < o.getFitnessFunction()) //se a funcao fitness atual for menor que a seguinte (melhor solucao)
        {
            return -1;
        }


        return 0;
    }
}
