import org.carro.Carro;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TesteCarro {

    @Test
    public void testCarroParado() {
        Carro c = new Carro();
        assertEquals(0, c.getVelocidade());
    }

    @Test
    public void testAcelerar() {
        Carro c = new Carro();
        c.potencia = 10;
        c.acelerar();
        assertEquals(10, c.getVelocidade());
    }

    @Test
    public void testFrear() {
        Carro c = new Carro();
        c.potencia = 10;
        c.acelerar();
        c.frear();
        c.frear();
        c.frear();
        c.frear();
        assertEquals(0, c.getVelocidade());
    }
}
