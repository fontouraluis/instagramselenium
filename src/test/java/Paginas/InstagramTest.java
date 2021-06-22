package Paginas;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static java.lang.Thread.sleep;

public class InstagramTest extends PaginaBase {

    public InstagramTest(WebDriver navegador) {
        super(navegador);
    }

    public SalvarDadosLogin clicarEnviar() throws InterruptedException {
        navegador.findElement(By.cssSelector("#loginForm > div > div:nth-child(3) > button > div")).click();
        sleep(9000);
        return new SalvarDadosLogin(navegador);
    }

    public InstagramTest enviarUsername(String username){
        navegador.findElement(By.cssSelector("#loginForm > div > div:nth-child(1) > div > label > input")).sendKeys(username);
        return this;
    }

    public InstagramTest enviarSenha(String senha){
        navegador.findElement(By.cssSelector("#loginForm > div > div:nth-child(2) > div > label > input")).sendKeys(senha);
        return this;
    }

    public String capturarTextoPaginaInicial(){
        return navegador.findElement(By.xpath("//a[text()=\"Esqueceu a senha?\"]")).getText();

    }
}
