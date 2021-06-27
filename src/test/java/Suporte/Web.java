package Suporte;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static java.lang.Thread.sleep;

public class Web {

    public static WebDriver createChrome() throws InterruptedException {
        //public static WebDriver createFirefox() throws InterruptedException {
        //public static WebDriver createIe() throws InterruptedException {
        //System.setProperty("webdriver.gecko.driver", "C:\\Users\\LuisAlbertoMarquesda\\Desktop\\DriverChrome\\geckodriver.exe");
        //System.setProperty("webdriver.ie.driver", "C:\\Users\\LuisAlbertoMarquesda\\Desktop\\DriverChrome\\IEDriverServer.exe");
        System.setProperty("webdriver.chrome.driver", "C:\\WebDriver\\chromedriver.exe");
        WebDriver navegador = new ChromeDriver();
        //WebDriver navigator = new InternetExplorerDriver();
        //WebDriver navigator = new FirefoxDriver();
        navegador.manage().window().maximize();
        navegador.get("https://www.instagram.com/");
        sleep(2000);
        return navegador;
    }}
