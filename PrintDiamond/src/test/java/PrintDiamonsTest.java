import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PrintDiamondsTest {
    @Test
    void line_A_for_A() {
        PrintDiamond d = new PrintDiamond();
        assertEquals("A", d.makeLine('A','A'));
    }
    @Test
    void line_A_for_B() {
        PrintDiamond d = new PrintDiamond();
        assertEquals("*A", d.makeLine('A','B'));
    }
    @Test
    void line_A_for_C() {
        PrintDiamond d = new PrintDiamond();
        assertEquals("**A", d.makeLine('A','C'));
    }
    @Test
    void line_B_for_C() {
        PrintDiamond d = new PrintDiamond();
        assertEquals("*B*B", d.makeLine('B','C'));
    }
    @Test
    void line_C_for_C() {
        PrintDiamond d = new PrintDiamond();
        assertEquals("C***C", d.makeLine('C','C'));
    }
    @Test
    void testA() {
        PrintDiamond d = new PrintDiamond();
        assertEquals("A\n", d.makeDiamond('A'));
    }
    @Test
    void testB() {
        PrintDiamond d = new PrintDiamond();
        assertEquals("*A\nB*B\n*A\n", d.makeDiamond('B'));
    }
    @Test
    void testC() {
        PrintDiamond d = new PrintDiamond();
        assertEquals("**A\n*B*B\nC***C\n*B*B\n**A\n", d.makeDiamond('C'));
    }
}
