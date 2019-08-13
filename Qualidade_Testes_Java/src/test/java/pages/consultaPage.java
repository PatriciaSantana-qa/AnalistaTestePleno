package pages;

import org.junit.Assert;

import org.openqa.selenium.WebDriver;

public class consultaPage {

    private WebDriver navegador;


    public consultaPage(WebDriver navegador) {
        this.navegador = navegador;
    }

    public consultaPage testValidarTexto(){
        Assert.assertEquals("Selenium - Web Browser Automation",navegador.getTitle());
        System.out.println(navegador.getTitle());
        System.out.println(navegador.getCurrentUrl());

        return this;

    }

 }







