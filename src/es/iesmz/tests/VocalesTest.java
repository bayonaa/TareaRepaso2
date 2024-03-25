package es.iesmz.tests;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class VocalesTest {
    @BeforeEach
    public void beforeEach() {
        System.out.println("EXECUTE PROVA");
    }

    @Test
    public void test1() {
        assertEquals(4, Vocales.contarvocales ("Hola Mundo"));
    }

    @Test
    public void test2() {
        assertEquals(8, Vocales.contarvocales ("Esto Es una cadenA"));
    }

    @Test
    public void test3() {
        assertEquals(7, Vocales.contarvocales ("Java mola MogollOn"));
    }

    @Test
    public void test4() {
        assertEquals(1, Vocales.contarvocales ("4h0r4 s0n num3r0s"));
    }

    @Test
    public void test5() {
        assertEquals(6, Vocales.contarvocales ("Cadena S1n Vocales"));
    }
}