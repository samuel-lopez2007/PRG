package cuc;

import static cuc.CUC_A2_final.NTAULER;

 /**
  * Crea una classe que inicialitzi una matriu quadrada, pe 5x5:
  *      Mostra-la per pantalla, cada fila a una línia.
  */
public class CUC_A2_final {
    static final int NTAULER = UtilitatsConsola.llegirSencer("Mida del tauler: ");
    static final int NFULLES = UtilitatsConsola.llegirSencer("Numero de fulles: ");
    static int SIMBOL_BUIT = 0;
    static int SIMBOL_CUC = 1;
    static int SIMBOL_FULLA = 9;
    
    public static void main(String[] args) {
        int[][] tauler = new int[NTAULER][NTAULER];  // tauler del joc
        int[] cuc = new int[2];  // posici� {fila,columna} del cuc
        int[] fulla = new int[NFULLES];
        int accio; 

        // Emplena el tauler amb el cuc i les fulles
        inicialitzaJoc(tauler, cuc, fulla);
        
        do {
            // Mostra el tauler
            UtilitatsArrays.mostraArray(cuc);
            UtilitatsMatrius.mostrarMatriu(tauler);
            
            // Cambia la posici� del cuc
            accio=UtilitatsConsola.llegirSencer("ACCIONS: 8:ALT, 4:ESQUERRA, 6:DRETA, 2:BAIX; 0:SORTIR: ");     
            cambiaPosicio(tauler, cuc, accio);
        } while (accio!=0);
    }
    
    public static void inicialitzaJoc(int[][] tauler, int[] cuc,int[] NFULLES){
        // Generam una posici� aleat�ria pel cuc
        int[] pos = UtilitatsArrays.generaArray(2, 0, NTAULER-1);  // {2,4}
        
        cuc[0] = pos[0];
        cuc[1] = pos[1];
        
        // Situa cuc en el tauler
        tauler[ cuc[0] ] [ cuc[1] ] = SIMBOL_CUC;
        // Revisa las posiciones de arrays si estan vacias o hay gusano para meter hojas
        
        for(int i = 0;i< NFULLES.length;i++){
            boolean posFulla = false;
            do{
               pos = UtilitatsArrays.generaArray(2, 0, NTAULER-1);
               if(tauler[pos[0]] [pos [1]] == SIMBOL_BUIT){
                posFulla = true;
                tauler[pos[0]] [pos[1]] = SIMBOL_FULLA;
               }
            } while(!posFulla);
        }    
     }

    public static void cambiaPosicio(int[][] tauler, int[] cuc, int accio) {
        
        tauler[ cuc[0] ] [ cuc[1] ] = SIMBOL_BUIT;  //De esta manera doy el valor de un array con posiciones x,y dentro de una matriz
        switch (accio) {
            case 4 -> // ESQ
                cuc[1] = (cuc[1]==0 ? NTAULER-1 : --cuc[1]); 
            case 6  -> // DRETA
                cuc[1] = (cuc[1]==NTAULER-1 ? 0 : ++cuc[1]); 
            case 8  -> // ALT
                cuc[0] = (cuc[0]==0 ? NTAULER-1 : --cuc[0]); 
            case 2 -> //BAIX
                cuc[0] = (cuc[0]==NTAULER-1 ? 0 : ++cuc[0]); 
        }
        tauler[cuc[0]][cuc[1]] = SIMBOL_CUC;
    }
    public static void mostraTauler(int[][]tauler){
        
       
        
    }
}
  