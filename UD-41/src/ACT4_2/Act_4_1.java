

package ACT4_2;


public class Act_4_1 {

  
    public static void main(String[] args) {
     
        int [][] matriu = UtilitatsMatrius.generaMatriu(10, 1, 9);
        
        UtilitatsMatrius.mostrarMatriu(matriu);
        
    }
public static void main1(String[] args) {
     
        int [][] matriu = UtilitatsMatrius.generaMatriu(10, 1, 5);
        
        int [] diagonal = UtilitatsMatrius.generaDiagonalPrincipal(matriu);
        
        UtilitatsArrays.mostraArray(diagonal);
    }
}
