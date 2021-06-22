package Testes;

import Paginas.InstagramTest;
import Suporte.Web;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import static org.junit.Assert.*;

public class AcessarConta {

    WebDriver navegador;

    @Before
    public void setUp() throws InterruptedException {

        navegador = Web.createChrome();
    }

    @Test
    public void logarInstagram() throws InterruptedException {
        String textoUsername = new InstagramTest(navegador)
                .enviarUsername("qualidadeinsta")
                .enviarSenha("n1x5p9p9")
                .clicarEnviar()
                .clicarAgoraNao()
                .clicarAtivarNao()
                .capturarTextoUsername();

        Assert.assertEquals("qualidadeinsta", textoUsername);

    }

    @Test
    public void DeslogarInstagram() throws InterruptedException {
        String textoPaginaIncial = new InstagramTest(navegador)
                .enviarUsername("qualidadeinsta")
                .enviarSenha("n1x5p9p9")
                .clicarEnviar()
                .clicarAgoraNao()
                .clicarAtivarNao()
                .clicarIcon()
                .clicarSair()
                .capturarTextoPaginaInicial();

        Assert.assertEquals("Esqueceu a senha?", textoPaginaIncial);

    }

    @After
    public void setDown() {
        navegador.quit();
    }
}

