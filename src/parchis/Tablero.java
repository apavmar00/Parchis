package parchis;

import java.util.ArrayList;
import java.util.Map;

/**
 *
 * Tablero con 4 colores y 68 posiciones 
 * (100 en total, contando las casillas que suben 
 * para encerrar una ficha en casa + las casillas de casa).
 * 
 */

public class Tablero {
    private final ArrayList<Map<String, Ficha[]>>[][] casillas = new ArrayList[19][19];
    //private String[][] casillas = new String[19][19];
    
    public String mostrarTablero(){
        /*if(casillas.length > 0){
            for(int i = 0; i < casillas.length; i++){
                //casillas[i] = "-";
                for(int j = 0; j < casillas.length; j++){
                    System.out.print(" -");
                }
                System.out.println("");
            }
        }*/
        //casillas[i][j] = ();
        
        boolean cVacio = true;
        boolean fVacio = false;
        int columna = 0;
        int fila = 0;
        
        if(casillas.length > 0){
            for(int i = 0; i < casillas.length; i++){
                if(fila == 8 || fila == 9 || fila == 10){
                    fVacio = true;
                } else{
                    fVacio = false;
                }
                
                for(int j = 0; j < casillas.length; j++){
                    if(columna < 8 && cVacio){
                        System.out.print("v");
                    }
                    
                    columna++;
                    
                    if(columna > 8){
                        columna = 0;
                        cVacio = false;
                    }
                    
                    if(!cVacio){
                        System.out.print("o");
                        if(columna == 2){
                            cVacio = true;
                            columna = 0;
                        }
                    }
                    
                }
                columna = 0;
                fila++;
                System.out.println("");
            }
            
            /*for(int i = 0; i < casillas.length; i++){
                for(int j = 0; j < casillas.length; j++){
                    if(contador < 8 && vacio){
                        System.out.print("v");
                    }
                    if(contador == 8){
                        contador = 0;
                        vacio = false;
                    }
                    if(contador < 3 && !vacio){
                        System.out.print("o");
                    }
                    if(contador == 3 && !vacio){
                        vacio = true;
                    }
                    contador++;
                }
                System.out.println("");
            }*/
        }
        
        return "";
    }

    @Override
    public String toString() {
        return mostrarTablero();
    }
    
    
}
