import org.banco.ContaCorrente;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TesteContaCorrente {

    ContaCorrente cc;

    @Before
    public void inicializaConta(){
        cc = new ContaCorrente();
        cc.depositar(200);
    }

    @Test
    public void depositar() {
        assertEquals(cc.saldo, 200);
    }

    @Test
    public void saque() {
        int valorSacado = cc.sacar(50);
        assertEquals(cc.saldo, 150);
        assertEquals(valorSacado, 50);
    }

    @Test
    public void saqueMaiorQueSaldo() {
        int valorSacado = cc.sacar(300);
        assertEquals(cc.saldo, 200);
        assertEquals(valorSacado, 0); // 0 porque não terá sacado nada (valor > saldo)
    }
}
