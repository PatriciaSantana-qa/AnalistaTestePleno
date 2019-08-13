package tests;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import pages.pesquisaGooglePage;
import suporte.web;


public class pesquisaGoogleTest {
    private WebDriver navegador;


    @Before
    public void setUp() {
        navegador = web.conexaoChrome();
    }

@Test
public void testAcessaPagina() {
    new pesquisaGooglePage(navegador)
            .preencheCampoPesquisa("seleniumhq.org")
            .clicarBtnPesquisa()
            .clicarLinkPesquisado()
            .testValidarTexto();
}

    @After
    public  void tearDown(){
        navegador.quit();
    }
}
