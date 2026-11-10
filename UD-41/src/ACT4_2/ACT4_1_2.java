
package ACT4_2;


public class ACT4_1_2 {
    public static void main(String[] args) {
     
        int [][] matriu = UtilitatsMatrius.generaMatriu(10, 1, 5);
        
        int [] diagonal = UtilitatsMatrius.generaDiagonalPrincipal(matriu);
        
        UtilitatsArrays.mostraArray(diagonal);
    }

}
