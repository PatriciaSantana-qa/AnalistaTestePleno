package suporte;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import java.util.concurrent.TimeUnit;

public class web {
    public static WebDriver conexaoChrome() {
        //Abrindo o navegador
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Patricia\\drivers\\chromedriver.exe");
        WebDriver navegador = new ChromeDriver();
        navegador.manage().window().maximize();
        navegador.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

        //Navegando para a pagina Google!
        navegador.get("http://www.google.com.br");

        return navegador;

    }

}
