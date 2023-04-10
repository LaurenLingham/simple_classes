import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PrinterTest {

    Printer printer;

    @Before
    public void setup() {
        printer = new Printer(50, 30);
    }

    @Test
    public void hasPaper() {
        assertEquals(50, printer.getPaper());
    }

    @Test
    public void hasToner() {
        assertEquals(30, printer.getToner());
    }

    @Test
    public void canPrintIfHasEnoughPaper() {
        printer.print(5, 5);
        assertEquals(25, printer.getPaper());
    }

    @Test
    public void cannotPrintIfNotEnoughPaper() {
        printer.print(10, 10);
        assertEquals(50, printer.getPaper());
    }

    @Test
    public void usesToner() {
        printer.print(5, 5);
        assertEquals(5, printer.getToner());
    }

    @Test
    public void cannotPrintIfNotEnoughToner() {
        printer.print(5, 10);
        assertEquals(30, printer.getToner());
    }
}
