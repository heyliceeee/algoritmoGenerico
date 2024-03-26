package org.example.exercicio1;

import java.util.Random;

public class Solution implements Comparable<Solution>
{
    private final int SIZEWORD = 6;
    StringBuffer word;
    StringBuffer sol;


    /**
     * construtor para inicializar a população com o tamanho de n individuos
     * @param word
     */
    public Solution(StringBuffer word)
    {
        this.word = word;
        this.sol = new StringBuffer();

        Random random = new Random();
        String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";


        for(int i=0; i < SIZEWORD; i++) //percorrer a palavra
        {
            //gere random letra
            int index = random.nextInt(chars.length());
            char randomChar = chars.charAt(index);

            sol.append(randomChar);//coloca na palavra
        }

    }


    public StringBuffer getWord() {
        return word;
    }

    public StringBuffer getSol() {
        return sol;
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

        if(this.getFitnessFunction() < o.getFitnessFunction())
        {
            return -1;
        }

        return 0;
    }


    @Override
    public String toString() {
        return "Solution{" +
                "word = " + sol +
                ", function fitness = " + getFitnessFunction() +
                '}';
    }


    /** FUNCAO DE FITNESS
     * procurar a palavra mais semelhante a palavra escondida
     * @return a quantidade de letras iguais
     */
    private int getFitnessFunction()
    {
        int total=0;

        for(int i=0; i < this.sol.length(); i++)
        {
            if(sol.charAt(i) == word.charAt(i))
            {
                total++;
            }
        }

        return total;
    }
}
