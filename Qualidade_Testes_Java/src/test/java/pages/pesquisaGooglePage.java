package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class pesquisaGooglePage {
    private WebDriver navegador;

    public pesquisaGooglePage(WebDriver navegador) {
        this.navegador = navegador;
    }

    public pesquisaGooglePage preencheCampoPesquisa(String texto) {
        navegador.findElement(By.name("q")).sendKeys(texto);

        return this;
    }
    public pesquisaGooglePage clicarBtnPesquisa(){
        navegador.findElement(By.name("btnK")).submit();
        return  this;
    }
    public consultaPage clicarLinkPesquisado(){
        navegador.findElement(By.className("LC20lb")).click();
     return new consultaPage (navegador);
        }
}


