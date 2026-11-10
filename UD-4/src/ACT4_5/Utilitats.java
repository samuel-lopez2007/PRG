
package ACT4_5;

import java.util.ArrayList;

public class Utilitats {
    
    public static ArrayList <Integer>generaDiferents(int [] array) {
        
       ArrayList<Integer> resultado = new ArrayList<>();
        
        for(int a : array) {
        boolean existe=false;
            for(Integer l : resultado) {
               if(a == l) {
                existe = true;
                    break;
                }
            }
            if (!existe)
                resultado.add(a);
        }
        return resultado;
    }
    public static ArrayList <Integer> obteParells(int [] array) {
    
        ArrayList<Integer> resultado = new ArrayList<>();
      
            for(int a : array)  
                if(a % 2 == 0) 
                    resultado.add(a);
        return resultado; 
    }
    public static ArrayList <Integer> ordenaArrays(int [] array) {
        
        ArrayList<Integer> resultado = new ArrayList<>();
            resultado.add(array[0]);
            for(int i = 1;i<array.length;i++){
                boolean inserit = false;
                   for(int j = 0;j<resultado.size();j++){
                        if( array[i] >= resultado.get(j)){
                         resultado.add(j,array[i]);
                         inserit = true;
                         break;
                    }  
                }
                     if(!inserit){
                        resultado.add(array[i]);
            }
        }
            return resultado;
    }
}


            
        
        
    

