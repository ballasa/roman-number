////////////////////////////////////////////////////////////////////
// SARA BALLARDIN 2101048
// DAVIDE LOPARCO 2101088
////////////////////////////////////////////////////////////////////

package it.unipd.mtss;

public class IntegerToRoman {
    public static String convert(int number){
        StringBuilder result = new StringBuilder();

        while(number>=1){
            result.append("I");
            number--;
        }

        return result.toString();
    }
}