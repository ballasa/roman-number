////////////////////////////////////////////////////////////////////
// SARA BALLARDIN 2101048
// DAVIDE LOPARCO 2101088
////////////////////////////////////////////////////////////////////

package it.unipd.mtss;

/**
 * Classe per la conversione di numeri arabi in numeri romani.
 */
public class IntegerToRoman {

    /**
     * Metodo che converte un numero arabo nel corrispondente numero romano.
     * @param number
     * @return Stringa contentente il numero romano ottenuto.
     */
    public static String convert(int number){
        //Corrispondenza tra numeri romani e arabi (simboli singoli e casi sottrattivi);
        int[] values={1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] romanSymbols={"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

        StringBuilder result = new StringBuilder();

        //Scansione dell'array dai valori più grandi ai più piccoli;
        for(int i=0; i<values.length; i++){
            //Ciclo eseguito finché il numero è maggiore o uguale al valore corrente;
            while(number>=values[i]){
                result.append(romanSymbols[i]); //Aggiunto il simbolo corrispondente al risultato;
                number-=values[i];
            }
        }

        return result.toString();
    }
}