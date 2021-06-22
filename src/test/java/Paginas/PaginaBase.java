package Paginas;

import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class PaginaBase {

    protected WebDriver navegador;

    public PaginaBase(WebDriver navegador) {
        this.navegador = navegador;
    }
}