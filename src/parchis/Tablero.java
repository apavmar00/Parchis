package parchis;

import java.util.ArrayList;

/**
 *
 * - Tablero con 4 colores y 68 posiciones 
 * (100 en total, contando las casillas que suben 
 * para encerrar una ficha en casa + las casillas de casa).
 * - Cada ficha va a recorrer antes de entrar al pasillo de la meta,
 * 64 casillas.
 * 
 */

public class Tablero {
    private boolean casillaNormal;
    private boolean casillaSeguro;
    private Integer[][] mapeo = new Integer[19][19];
    //private final ArrayList<String>[][] casillas = new ArrayList[19][19];
    //private String[][] casillas = new String[19][19];
    
    public String mostrarTablero(){
        Integer vacio = 0;
        Integer lleno = 1;
        Integer pasillos = 2;
        Integer meta = 3;
        
        for(int fila = 0; fila < 19; fila++){
            for(int columna = 0; columna < 19; columna++){
                if( (fila < 8 && columna < 8) || (columna > 10 && fila < 8) || (columna < 8 && fila > 10) || (columna > 10 && fila > 10) 
                        || ((columna == 8 || columna == 10) && fila == 8) || (columna == 9 && fila == 9) || ((columna == 8 || columna == 10) 
                        && fila == 10) ){
                    
                    mapeo[fila][columna] = (vacio);
                    System.out.print(mapeo[fila][columna]);
                    
                } else if( (columna == 9 && (fila < 8 || fila > 10)) || ((columna < 8 || columna > 10) && fila == 9) ){
                    
                    mapeo[fila][columna] = (pasillos);
                    System.out.print(mapeo[fila][columna]);
                    
                } else if( ((fila == 8 || fila == 10) && columna == 9) || ((columna == 8 || columna == 10) && fila == 9) ){
                    
                    mapeo[fila][columna] = (meta);
                    System.out.print(mapeo[fila][columna]);
                    
                } else{
                    
                    mapeo[fila][columna] = (lleno);
                    System.out.print(mapeo[fila][columna]);
                    
                }
            }
            System.out.println("");
        }
        
        
        
        
        
        
        
        
        
        
        
        
        
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
        
        //Se tiene que terminar y no creo que sea la opción más correcta.
        /*boolean cVacio = true;
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
        }*/
        
        return "";
    }

    @Override
    public String toString() {
        return mostrarTablero();
    }
    
    
}
