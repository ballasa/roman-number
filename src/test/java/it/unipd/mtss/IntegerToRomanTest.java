////////////////////////////////////////////////////////////////////
// SARA BALLARDIN 2101048
// DAVIDE LOPARCO 2101088
////////////////////////////////////////////////////////////////////

package it.unipd.mtss;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;
import org.junit.Test;

/**
 * Classe di test per verificare il corretto funzionamento della conversione
 * da numeri interi (arabi) a numeri romani fino al 1000.
 */
public class IntegerToRomanTest {
    @Test
    public void testConvertOne() {
        // Arrange (configurazione):
        int number = 1;

        // Act (esecuzione del metodo da testare):
        String result = IntegerToRoman.convert(number);

        // Assert (verifica):
        assertEquals("I", result);
    }

    @Test
    public void testConvertTwo() {
        // Arrange:
        int number = 2;

        // Act:
        String result = IntegerToRoman.convert(number);

        // Assert:
        assertEquals("II", result);
    }

    @Test
    public void testConvertThree() {
        // Arrange:
        int number = 3;

        // Act:
        String result = IntegerToRoman.convert(number);

        // Assert:
        assertEquals("III", result);
    }

    @Test
    public void testConvertFour() {
        // Arrange:
        int number = 4;

        // Act:
        String result = IntegerToRoman.convert(number);

        // Assert:
        assertEquals("IV", result);
    }

    @Test
    public void testConvertFive() {
        // Arrange:
        int number = 5;

        // Act:
        String result = IntegerToRoman.convert(number);

        // Assert:
        assertEquals("V", result);
    }

    @Test
    public void testConvertSix() {
        // Arrange:
        int number = 6;

        // Act:
        String result = IntegerToRoman.convert(number);

        // Assert:
        assertEquals("VI", result);
    }

    @Test
    public void testConvertSeven() {
        // Pattern AAA compatto:
        assertEquals("VII", IntegerToRoman.convert(7));
    }

    @Test
    public void testConvertNine() {
        assertEquals("IX", IntegerToRoman.convert(9));
    }

    @Test
    public void testConvertTen() {
        assertEquals("X", IntegerToRoman.convert(10));
    }

    @Test
    public void testConvertFifteen() {
        assertEquals("XV", IntegerToRoman.convert(15));
    }

    @Test
    public void testConvertTwenty() {
        assertEquals("XX", IntegerToRoman.convert(20));
    }

    @Test
    public void testConvertThirtyFour() {
        assertEquals("XXXIV", IntegerToRoman.convert(34));
    }

    @Test
    public void testConvertFortyNine() {
        assertEquals("XLIX", IntegerToRoman.convert(49));
    }

    @Test
    public void testConvertFifty() {
        assertEquals("L", IntegerToRoman.convert(50));
    }

    @Test
    public void testConvertSeventyThree() {
        assertEquals("LXXIII", IntegerToRoman.convert(73));
    }

    @Test
    public void testConvertNinetyNine() {
        assertEquals("XCIX", IntegerToRoman.convert(99));
    }

    @Test
    public void testConvertOneHundred() {
        assertEquals("C", IntegerToRoman.convert(100));
    }

    @Test
    public void testConvertThreeHundredNinetyNine() {
        assertEquals("CCCXCIX", IntegerToRoman.convert(399));
    }

    @Test
    public void testConvertFourHundred() {
        assertEquals("CD", IntegerToRoman.convert(400));
    }

    @Test
    public void testConvertFiveHundred() {
        assertEquals("D", IntegerToRoman.convert(500));
    }

    @Test
    public void testConvertNineHunderedNinetyNine() {
        assertEquals("CMXCIX", IntegerToRoman.convert(999));
    }

    @Test
    public void testConvertOneThousand() {
        assertEquals("M", IntegerToRoman.convert(1000));
    }

    
    // TEST EDGE CASES:

    @Test
    public void testNumberZero() {
        // Arrange
        int number = 0;

        try {
            // Act
            IntegerToRoman.convert(number);

            // Se la conversione non lancia l'errore, il test fallisce qui
            fail("Ci si aspettava una IllegalArgumentException per l'input 0");

        } catch (IllegalArgumentException e) {
            // Assert
            assertEquals("Il numero deve essere compreso tra 1 e 1000. Valore inserito: 0", e.getMessage());
        }
    }

    @Test
    public void testNegativeNumber() {
        // Arrange
        int number = -1;

        try {
            // Act
            IntegerToRoman.convert(number);

            fail("Ci si aspettava una IllegalArgumentException per l'input -1");

        } catch (IllegalArgumentException e) {
            // Assert
            assertEquals("Il numero deve essere compreso tra 1 e 1000. Valore inserito: -1", e.getMessage());
        }
    }

    @Test
    public void testNumberTooHigh() {
        // Arrange
        int number = 1001;

        try {
            // Act
            IntegerToRoman.convert(number);

            fail("Ci si aspettava una IllegalArgumentException per l'input 1001");

        } catch (IllegalArgumentException e) {
            // Assert
            assertEquals("Il numero deve essere compreso tra 1 e 1000. Valore inserito: 1001", e.getMessage());
        }
    }
}