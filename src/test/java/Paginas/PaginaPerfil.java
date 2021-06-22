package Paginas;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static java.lang.Thread.sleep;

public class PaginaPerfil extends PaginaBase {
    public PaginaPerfil(WebDriver navegador) {
        super(navegador);
    }

    public PaginaPerfil clicarIcon() throws InterruptedException {
        navegador.findElement(By.cssSelector("#react-root > section > nav > div._8MQSO.Cx7Bp > div > div > div.ctQZg > div > div:nth-child(5) > span")).click();
        sleep(1000);
        return this;
    }

    public InstagramTest clicarSair() throws InterruptedException {
        navegador.findElement(By.xpath("//div[text()=\"Sair\"]")).click();
        sleep(3000);
        return new InstagramTest(navegador);
    }

    public PaginaPerfil clicarAtivarNao() throws InterruptedException {
        navegador.findElement(By.cssSelector("body > div.RnEpo.Yx5HN > div > div > div > div.mt3GC > button.aOOlW.HoLwm")).click();
        sleep(3000);
        return new PaginaPerfil (navegador);

    }

    public String capturarTextoUsername() {
        return navegador.findElement(By.className("gmFkV")).getText();
    }
}
