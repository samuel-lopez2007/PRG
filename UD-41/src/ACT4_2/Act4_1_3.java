
package ACT4_2;


public class Act4_1_3 {
    public static void main(String[] args) {
     
        int [][] matriu = UtilitatsMatrius.generaMatriu(10, 1, 5);
        
        int [] diagonal = UtilitatsMatrius.generaDiagonalSecundaria(matriu);
        
        UtilitatsArrays.mostraArray(diagonal);
    }
}
