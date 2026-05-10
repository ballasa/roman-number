////////////////////////////////////////////////////////////////////
// SARA BALLARDIN 2101048
// DAVIDE LOPARCO 2101088
////////////////////////////////////////////////////////////////////

package it.unipd.mtss;

/**
 * Classe per la stampa in formato Ascii art di numeri romani.
 */
public class RomanPrinter {
    /**
     * Converte un numero intero in numero romano e lo stampa in formato Ascii art.
     * 
     * @param num il numero intero da stampare.
     * @return una stringa contenente l'Ascii art del numero romano.
     */
    public static String print(int num) {
        return printAsciiArt(IntegerToRoman.convert(num));
    }

    /**
     * Riceve una stringa di caratteri romani e assembla l'Ascii art riga per riga.
     * 
     * @param romanNumber la stringa contenente il numero romano.
     * @return l'Ascii art multi-linea.
     */
    private static String printAsciiArt(String romanNumber) {
        // Controllo di sicurezza per stringhe nulle o vuote;
        if (romanNumber == null || romanNumber.isEmpty()) {
            return "";
        }

        // Si ottiene una matrice dove ogni colonna è una lettera
        // e ogni riga di quella colonna è un pezzo del suo disegno Ascii;
        String[][] letterShapes = getLetterShapes(romanNumber);

        StringBuilder result = new StringBuilder();

        // Ciclo che itera sulle 6 righe di altezza del font Ascii;
        for (int row = 0; row < 6; row++) {
            // Per ogni riga si analizzano tutte le lettere della stringa;
            for (int col = 0; col < letterShapes.length; col++) {
                result.append(letterShapes[col][row]);
            }

            if (row < 5) { // Va a capo alla fine di ogni riga completata (tranne l'ultima riga);
                result.append("\n");
            }
        }

        return result.toString(); // Trasforma il risultato in una stringa classica;
    }

    /**
     * Mappa ogni carattere della stringa romana nel corrispondente array di
     * stringhe Ascii.
     * 
     * @param romanNumber la stringa da convertire.
     * @return una matrice dove il primo indice indica la posizione della lettera,
     *         il secondo indice indica la riga del disegno di quella lettera.
     * @throws IllegalArgumentException se la stringa contiene caratteri non
     *                                  supportati.
     */
    private static String[][] getLetterShapes(String romanNumber) {
        // Creazione di un contenitore grande quanto il numero di lettere;
        // Ogni lettera avrà a sua volta un array di 6 stringhe (le sue 6 righe Ascii);
        String[][] matrix = new String[romanNumber.length()][6];

        for (int i = 0; i < romanNumber.length(); i++) {
            char c = romanNumber.charAt(i);

            // Si sceglie il disegno corretto in base al carattere;
            switch (c) {
                case 'I':
                    matrix[i] = getAscii_I();
                    break;
                case 'V':
                    matrix[i] = getAscii_V();
                    break;
                case 'X':
                    matrix[i] = getAscii_X();
                    break;
                case 'L':
                    matrix[i] = getAscii_L();
                    break;
                case 'C':
                    matrix[i] = getAscii_C();
                    break;
                case 'D':
                    matrix[i] = getAscii_D();
                    break;
                case 'M':
                    matrix[i] = getAscii_M();
                    break;
                default:
                    // Se è una lettera non supportara lancia un errore;
                    throw new IllegalArgumentException("Carattere non supportato: " + c);
            }
        }
        return matrix;
    }

    /**
     * Fornisce il disegno Ascii della lettera I.
     * 
     * @return un array di 6 stringhe che rappresentano le righe della lettera I.
     */
    private static String[] getAscii_I() {
        return new String[] {
                " _____ ",
                "|_   _|",
                "  | |  ",
                "  | |  ",
                " _| |_ ",
                "|_____|"
        };
    }

    /**
     * Fornisce il disegno Ascii della lettera V.
     * 
     * @return un array di 6 stringhe che rappresentano le righe della lettera V.
     */
    private static String[] getAscii_V() {
        return new String[] {
                "__      __",
                "\\ \\    / /",
                " \\ \\  / / ",
                "  \\ \\/ /  ",
                "   \\  /   ",
                "    \\/    "
        };
    }

    /**
     * Fornisce il disegno Ascii della lettera X.
     * 
     * @return un array di 6 stringhe che rappresentano le righe della lettera X.
     */
    private static String[] getAscii_X() {
        return new String[] {
                "__  __ ",
                "\\ \\/ / ",
                " \\  /  ",
                " /  \\  ",
                "/ /\\ \\ ",
                "\\/  \\/ "
        };
    }

    /**
     * Fornisce il disegno Ascii della lettera L.
     * 
     * @return un array di 6 stringhe che rappresentano le righe della lettera L.
     */
    private static String[] getAscii_L() {
        return new String[] {
                " _      ",
                "| |     ",
                "| |     ",
                "| |     ",
                "| |____ ",
                "|______|"
        };
    }

    /**
     * Fornisce il disegno Ascii della lettera C.
     * 
     * @return un array di 6 stringhe che rappresentano le righe della lettera C.
     */
    private static String[] getAscii_C() {
        return new String[] {
                "  _____ ",
                " / ____|",
                "| |     ",
                "| |     ",
                "| |____ ",
                " \\_____|"
        };
    }

    /**
     * Fornisce il disegno Ascii della lettera D.
     * 
     * @return un array di 6 stringhe che rappresentano le righe della lettera D.
     */
    private static String[] getAscii_D() {
        return new String[] {
                " _____  ",
                "|  __ \\ ",
                "| |  | |",
                "| |  | |",
                "| |__| |",
                "|_____/ "
        };
    }

    /**
     * Fornisce il disegno Ascii della lettera M.
     * 
     * @return un array di 6 stringhe che rappresentano le righe della lettera M.
     */
    private static String[] getAscii_M() {
        return new String[] {
                " __  __ ",
                "|  \\/  |",
                "| \\  / |",
                "| |\\/| |",
                "| |  | |",
                "|_|  |_|"
        };
    }
}