package Paginas;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SalvarDadosLogin extends PaginaBase {

    public SalvarDadosLogin(WebDriver navegador) {
        super(navegador);
    }

    public PaginaPerfil clicarAgoraNao() {
        navegador.findElement(By.cssSelector("#react-root > section > main > div > div > div > div > button")).click();
        return new PaginaPerfil (navegador);
    }
}
