package tests;


import org.junit.*;
import org.junit.rules.TestName;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;


public class PesquisaGoogle {
     private WebDriver navegador;

    @Rule
    public TestName test = new TestName();

    @Before
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

    @Test
    public void TestPesquisaSite()
    {
        WebElement caixaPesquisa = navegador.findElement(By.name("q"));
        caixaPesquisa.clear();
        caixaPesquisa.sendKeys("seleniumhq.org");
        WebElement botaoPesquisa = navegador.findElement(By.name("btnK"));
        botaoPesquisa.submit();
        WebElement selecionarLink = navegador.findElement(By.className("LC20lb"));
        selecionarLink.click();
        Assert.assertEquals("Selenium - Web Browser Automation",navegador.getTitle());
        System.out.println(navegador.getTitle());
        System.out.println(navegador.getCurrentUrl());

       //Evidencias
        //String screenShotArquivo = "C:\\Users\\Patricia\\ScreenShotSelenium\\Evidencias\\" + Generator.dataHoraParaArquivo() + test.getMethodName() + ".png";
        //Screenshot.tirar(navegador,screenShotArquivo);

    }

    @After
    public void posCondicao(){
        navegador.quit();
    }
}
