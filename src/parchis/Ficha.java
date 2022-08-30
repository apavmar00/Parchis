package parchis;

/**
 *
 * comentario
 * 
 */

public class Ficha {
    private int id;
    private String color;
    
    //Constructor
    public Ficha(int id, String color){
        this.id = id;
        this.color = color;
    }
    
    public int mostrarId(){
        return id;
    }
    
    public String mostrarColor(){
        return color;
    }

}
