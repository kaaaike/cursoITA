import org.carro.CarroDeCorrida;
import org.carro.CarroMult;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TesteCarroMult {

    CarroDeCorrida c;

    @Before
    public void inicializaCarro() {
        c = new CarroMult(1.5, 100,"Teste");
    }

    @Test
    public void testCarroParado() {
        assertEquals(0, c.getVelocidade());
    }

    @Test
    public void testAcelerarUmaVez() {
        c.acelerar();
        assertEquals(10, c.getVelocidade());
    }

    @Test
    public void testAcelerarDuasVezes() {
        c.acelerar();
        c.acelerar();
        assertEquals(15, c.getVelocidade());
    }

    @Test
    public void testFrear() {
        c.acelerar();
        c.frear();
        assertEquals(5, c.getVelocidade());
    }

    @Test
    public void testFrearAteZero() {
        c.acelerar();
        c.frear();
        c.frear();
        c.frear();
        c.frear();
        assertEquals(0, c.getVelocidade());
    }
}
