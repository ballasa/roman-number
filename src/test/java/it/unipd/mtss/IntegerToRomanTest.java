////////////////////////////////////////////////////////////////////
// SARA BALLARDIN 2101048
// DAVIDE LOPARCO 2101088
////////////////////////////////////////////////////////////////////

package it.unipd.mtss;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class IntegerToRomanTest {
    @Test
    public void testConvertOne(){
        //Arrange (configurazione):
        int number=1;

        //Act (esecuzione del metodo da testare):
        String result=IntegerToRoman.convert(number);

        //Assert (verifica):
        assertEquals("I", result);
    }

    @Test
    public void testConvertTwo(){
        //Arrange:
        int number=2;

        //Act:
        String result=IntegerToRoman.convert(number);

        //Assert:
        assertEquals("II", result);
    }

    @Test
    public void testConvertThree(){
        //Arrange:
        int number=3;

        //Act:
        String result=IntegerToRoman.convert(number);

        //Assert:
        assertEquals("III", result);
    }

    @Test
    public void testConvertFour(){
        //Arrange:
        int number = 4;

        //Act:
        String result = IntegerToRoman.convert(number);

        //Assert:
        assertEquals("IV", result);
    }

    @Test
    public void testConvertFive(){
        //Arrange:
        int number = 5;

        //Act:
        String result = IntegerToRoman.convert(number);

        //Assert:
        assertEquals("V", result);
    }

    @Test
    public void testConvertSix(){
        //Arrange:
        int number = 6;

        //Act:
        String result = IntegerToRoman.convert(number);

        //Assert:
        assertEquals("VI", result);
    }

    @Test
    public void testConvertSeven(){
        //Pattern AAA compatto:
        assertEquals("VII", IntegerToRoman.convert(7));
    }

    @Test
    public void testConvertNine(){
        assertEquals("IX", IntegerToRoman.convert(9));
    }

    @Test
    public void testConvertTen(){
        assertEquals("X", IntegerToRoman.convert(10));
    }

    @Test
    public void testConvertFifteen(){
        assertEquals("XV", IntegerToRoman.convert(15));
    }

    @Test
    public void testConvertTwenty(){
        assertEquals("XX", IntegerToRoman.convert(20));
    }

    @Test
    public void testConvertThirtyFour(){
        assertEquals("XXXIV", IntegerToRoman.convert(34));
    }

    @Test
    public void testConvertFortyNine(){
        assertEquals("XLIX", IntegerToRoman.convert(49));
    }

    @Test
    public void testConvertFifty(){
        assertEquals("L", IntegerToRoman.convert(50));
    }

    @Test
    public void testConvertSeventyThree(){
        assertEquals("LXXIII", IntegerToRoman.convert(73));
    }

    @Test
    public void testConvertNinetyNine(){
        assertEquals("XCIX", IntegerToRoman.convert(99));
    }

    @Test
    public void testConvertOneHundred(){
        assertEquals("C", IntegerToRoman.convert(100));
    }

    @Test
    public void testConvertThreeHundredNinetyNine(){
        assertEquals("CCCXCIX", IntegerToRoman.convert(399));
    }

    @Test
    public void testConvertFourHundred(){
        assertEquals("CD", IntegerToRoman.convert(400));
    }

    @Test
    public void testConvertFiveHundred(){
        assertEquals("D", IntegerToRoman.convert(500));
    }
}