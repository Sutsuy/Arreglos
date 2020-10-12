/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bidimencional;

/**
 *
 * @author HP
 */
public class Arreglos {
    int [][] arreglo = {{9,13,5,2,5,6},
                        {12,3,5,5,1,5},
                        {8,5,3,4,1,5}}; 
   
    int restaFila1;
    int restaFila2;
    int restaFila3;
    
    
    public void proceso(){
        for(int i=0;i<3;i++){
            System.out.println("\n--------------------------------------------");
            for(int j=0;j<6;j++){
                System.out.print(" | "+arreglo[i][j]+" | ");
                
            }
        }
        System.out.println("\n--------------------------------------------");
        
        restaFila1=arreglo[0][0];
        for(int columnas=1;columnas<6 ;columnas++){
            
                                        
                 restaFila1 -=((arreglo[0][columnas]));
                 
            
        }
        System.out.println("La resta de la primer fila es: "+restaFila1);
        restaFila2=arreglo[1][0];
        for(int columnas=1;columnas<6 ;columnas++){
            
                                        
                 restaFila2 -=((arreglo[1][columnas]));
                 
            
        }
        System.out.println("La resta de la segunda fila es:"+restaFila2);
        
        restaFila3=arreglo[2][0];
        for(int columnas=1;columnas<6 ;columnas++){
            
                                        
                 restaFila3 -=((arreglo[2][columnas]));
                 
            
        }
        System.out.println("La resta de la tercera fila es: "+restaFila3);
    }
    
    
    
    
    
    
}
