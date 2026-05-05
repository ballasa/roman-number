////////////////////////////////////////////////////////////////////
// SARA BALLARDIN 2101048
// DAVIDE LOPARCO 2101088
////////////////////////////////////////////////////////////////////

package it.unipd.mtss;

public class RomanPrinter {
    public static String print(int num)
    {
        return printAsciiArt(IntegerToRoman.convert(num));
    }

    private static String printAsciiArt(String romanNumber){
        //Controllo di sicurezza per stringhe nulle o vuote;
        if(romanNumber==null || romanNumber.isEmpty()){
            return "";
        }

        //Array che contiene la lettera I divisa nelle sue 6 righe orizzontali;
        String[] asciiI={
            " _____ ",
            "|_   _|",
            "  | |  ",
            "  | |  ",
            " _| |_ ",
            "|_____|"
        };

        StringBuilder result = new StringBuilder();

        //Ciclo che itera sulle 6 righe dell'ASCII art;
        for(int i=0; i<6; i++){
            //Ciclo che scorre ogni lettera della stringa romana;
            for(int j=0; j<romanNumber.length(); j++){
                if(romanNumber.charAt(j)=='I'){ //Se la lettera corrente è una I aggiunge la riga corrispondente;
                    result.append(asciiI[i]);
                }
            }
                
            if(i<5){ //Va a capo alla fine di ogni riga completata;
                result.append("\n");
            }
        }
        
        return result.toString(); //Trasforma il risultato in una stringa classica;
    }
}