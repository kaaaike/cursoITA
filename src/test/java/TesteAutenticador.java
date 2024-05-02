import org.junit.Test;
import org.login.Autenticador;
import org.login.LoginException;
import org.login.Usuario;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class TesteAutenticador {

    @Test
    public void loginComSucesso() throws LoginException {
        Autenticador a = new Autenticador();
        Usuario u = a.logar("Kaike", "123mudar");
        assertEquals("Kaike", u.getLogin());
    }

    @Test(expected = LoginException.class)
    public void loginComFalha() throws LoginException {
        Autenticador a = new Autenticador();
        Usuario u = a.logar("Kaike", "senhaIncorreta");
    }

    @Test
    public void informacaoDoErro() {
        Autenticador a = new Autenticador();

        try {
           Usuario u = a.logar("Kaike", "senhaIncorreta");
            fail();
        } catch (LoginException e) {
            assertEquals("Kaike", e.getLogin());
        }
    }
}
