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
        //Arrange (configuraione):
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
}