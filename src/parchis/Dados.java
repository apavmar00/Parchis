package parchis;

/**
 *
 * Dos dados (Se generan aleatoriamente desde el 1 hasta el 6)
 * 
 */

public class Dados {
    private int dado1 = (int)(Math.random()*6+1);
    private int dado2 = (int)(Math.random()*6+1);
    
    @Override
    public String toString() {
        return dado1+", "+dado2;
    }
}
