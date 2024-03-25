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
}