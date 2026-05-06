////////////////////////////////////////////////////////////////////
// SARA BALLARDIN 2101048
// DAVIDE LOPARCO 2101088
////////////////////////////////////////////////////////////////////

package it.unipd.mtss;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class RomanPrinterTest {
    @Test
    public void testPrintAsciiOne(){
        //Arrange:
        int number=1;
        String expected=
            " _____ \n" +
            "|_   _|\n" +
            "  | |  \n" +
            "  | |  \n" +
            " _| |_ \n" +
            "|_____|";

        //Act:
        String result=RomanPrinter.print(number);
        
        //Assert:
        assertEquals(expected, result);
    }

    @Test
    public void testPrintAsciiTwo(){
        //Arrange:
        int number=2;
        String expected=
            " _____  _____ \n" +
            "|_   _||_   _|\n" +
            "  | |    | |  \n" +
            "  | |    | |  \n" +
            " _| |_  _| |_ \n" +
            "|_____||_____|";

        //Act:
        String result=RomanPrinter.print(number);
        
        //Assert:
        assertEquals(expected, result);
    }

    @Test
    public void testPrintAsciiThree(){
        //Arrange:
        int number=3;
        String expected= 
            " _____  _____  _____ \n" +
            "|_   _||_   _||_   _|\n" +
            "  | |    | |    | |  \n" +
            "  | |    | |    | |  \n" +
            " _| |_  _| |_  _| |_ \n" +
            "|_____||_____||_____|";
            
        //Act:
        String result=RomanPrinter.print(number);
        
        //Assert:
        assertEquals(expected, result);
    }
}