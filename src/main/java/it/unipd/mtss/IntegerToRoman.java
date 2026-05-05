////////////////////////////////////////////////////////////////////
// SARA BALLARDIN 2101048
// DAVIDE LOPARCO 2101088
////////////////////////////////////////////////////////////////////

package it.unipd.mtss;

/**
 * Classe per la conversione di numeri arabi in numeri romani
 */
public class IntegerToRoman {

    /**
     * Metodo Che converte un numero arabo nel corrispondente numero romano
     * @param number
     * @return Stringa contentente il numero romano ottenuto
     */
    public static String convert(int number){
        StringBuilder result = new StringBuilder();

        while(number>=5){
            result.append("V");
            number-=5;
        }

        while(number>=4){
            result.append("IV");
            number-=4;
        }

        while(number>=1){
            result.append("I");
            number--;
        }

        return result.toString();
    }
}