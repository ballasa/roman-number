////////////////////////////////////////////////////////////////////
// SARA BALLARDIN 2101048
// DAVIDE LOPARCO 2101088
////////////////////////////////////////////////////////////////////

package it.unipd.mtss;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class RomanPrinterTest {
    @Test
    public void testPrintAsciiOne() {
        // Arrange:
        int number = 1;
        String expected = " _____ \n" +
                "|_   _|\n" +
                "  | |  \n" +
                "  | |  \n" +
                " _| |_ \n" +
                "|_____|";

        // Act:
        String result = RomanPrinter.print(number);

        // Assert:
        assertEquals(expected, result);
    }

    @Test
    public void testPrintAsciiTwo() {
        // Arrange:
        int number = 2;
        String expected = " _____  _____ \n" +
                "|_   _||_   _|\n" +
                "  | |    | |  \n" +
                "  | |    | |  \n" +
                " _| |_  _| |_ \n" +
                "|_____||_____|";

        // Act:
        String result = RomanPrinter.print(number);

        // Assert:
        assertEquals(expected, result);
    }

    @Test
    public void testPrintAsciiThree() {
        // Arrange:
        int number = 3;
        String expected = " _____  _____  _____ \n" +
                "|_   _||_   _||_   _|\n" +
                "  | |    | |    | |  \n" +
                "  | |    | |    | |  \n" +
                " _| |_  _| |_  _| |_ \n" +
                "|_____||_____||_____|";

        // Act:
        String result = RomanPrinter.print(number);

        // Assert:
        assertEquals(expected, result);
    }

    @Test
    public void testPrintAsciiFour() {
        // Arrange:
        int number = 4;

        // Act:
        String expected = " _____ __      __\n" +
                "|_   _|\\ \\    / /\n" +
                "  | |   \\ \\  / / \n" +
                "  | |    \\ \\/ /  \n" +
                " _| |_    \\  /   \n" +
                "|_____|    \\/    ";

        String result = RomanPrinter.print(number);
        // Assert:
        assertEquals(expected, result);
    }

    @Test
    public void testPrintAsciiNine() {
        // Arrange:
        int number = 9;
        String expected = " _____ __  __ \n" +
                "|_   _|\\ \\/ / \n" +
                "  | |   \\  /  \n" +
                "  | |   /  \\  \n" +
                " _| |_ / /\\ \\ \n" +
                "|_____|\\/  \\/ ";

        // Act:
        String result = RomanPrinter.print(number);

        // Assert:
        assertEquals(expected, result);
    }

    @Test
    public void testPrintAsciiTen() {
        // Arrange:
        int number = 10;
        String expected = "__  __ \n" +
                "\\ \\/ / \n" +
                " \\  /  \n" +
                " /  \\  \n" +
                "/ /\\ \\ \n" +
                "\\/  \\/ ";

        // Act:
        String result = RomanPrinter.print(number);

        // Assert:
        assertEquals(expected, result);
    }

    @Test
    public void testPrintAsciiFifteen() {
        // Arrange:
        int number = 15;
        String expected = "__  __ __      __\n" +
                "\\ \\/ / \\ \\    / /\n" +
                " \\  /   \\ \\  / / \n" +
                " /  \\    \\ \\/ /  \n" +
                "/ /\\ \\    \\  /   \n" +
                "\\/  \\/     \\/    ";

        // Act:
        String result = RomanPrinter.print(number);

        // Assert:
        assertEquals(expected, result);
    }

    @Test
    public void testPrintAsciiTwenty() {
        // Arrange:
        int number = 20;
        String expected = "__  __ __  __ \n" +
                "\\ \\/ / \\ \\/ / \n" +
                " \\  /   \\  /  \n" +
                " /  \\   /  \\  \n" +
                "/ /\\ \\ / /\\ \\ \n" +
                "\\/  \\/ \\/  \\/ ";

        // Act:
        String result = RomanPrinter.print(number);

        // Assert:
        assertEquals(expected, result);
    }

    @Test
    public void testPrintAsciiThirtyFour() {
        // Arrange:
        int number = 34;
        String expected = "__  __ __  __ __  __  _____ __      __\n" +
                "\\ \\/ / \\ \\/ / \\ \\/ / |_   _|\\ \\    / /\n" +
                " \\  /   \\  /   \\  /    | |   \\ \\  / / \n" +
                " /  \\   /  \\   /  \\    | |    \\ \\/ /  \n" +
                "/ /\\ \\ / /\\ \\ / /\\ \\  _| |_    \\  /   \n" +
                "\\/  \\/ \\/  \\/ \\/  \\/ |_____|    \\/    ";

        // Act e Assert:
        assertEquals(expected, RomanPrinter.print(number));
    }

    @Test
    public void testPrintAsciiFifty() {
        // Arrange:
        int number = 50;
        String expected = " _      \n" +
                "| |     \n" +
                "| |     \n" +
                "| |     \n" +
                "| |____ \n" +
                "|______|";

        // Act e Assert:
        assertEquals(expected, RomanPrinter.print(number));
    }

    @Test
    public void testPrintAsciiNinety() {
        // Arrange:
        int number = 90;
        String expected = "__  __   _____ \n" +
                "\\ \\/ /  / ____|\n" +
                " \\  /  | |     \n" +
                " /  \\  | |     \n" +
                "/ /\\ \\ | |____ \n" +
                "\\/  \\/  \\_____|";

        // Act:
        String result = RomanPrinter.print(number);

        // Assert:
        assertEquals(expected, result);
    }

    @Test
    public void testPrintAsciiFourHundred() {
        // Arrange:
        int number = 400;
        String expected = "  _____  _____  \n" +
                " / ____||  __ \\ \n" +
                "| |     | |  | |\n" +
                "| |     | |  | |\n" +
                "| |____ | |__| |\n" +
                " \\_____||_____/ ";

        // Act:
        String result = RomanPrinter.print(number);

        // Assert:
        assertEquals(expected, result);
    }

    @Test
    public void testPrintAsciiFiveHundred() {
        // Arrange:
        int number = 500;
        String expected = " _____  \n" +
                "|  __ \\ \n" +
                "| |  | |\n" +
                "| |  | |\n" +
                "| |__| |\n" +
                "|_____/ ";

        // Act:
        String result = RomanPrinter.print(number);

        // Assert:
        assertEquals(expected, result);
    }

    @Test
    public void testPrintAsciiOneThousand() {
        // Arrange:
        int number = 1000;
        String expected = " __  __ \n" +
                "|  \\/  |\n" +
                "| \\  / |\n" +
                "| |\\/| |\n" +
                "| |  | |\n" +
                "|_|  |_|";

        // Act:
        String result = RomanPrinter.print(number);

        // Assert:
        assertEquals(expected, result);
    }
}