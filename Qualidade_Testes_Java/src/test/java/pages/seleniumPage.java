package pages;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.IOException;

public class seleniumPage {
    private WebDriver navegador;

    public seleniumPage (WebDriver navegador){
    this.navegador = navegador;
    }
     public seleniumPage tirarPrint() throws IOException {
        File srcFile = ((TakesScreenshot)navegador).getScreenshotAs(OutputType.FILE);
         FileUtils.copyFile(srcFile, new File("C:\\Users\\Patricia\\ScreenShotSelenium\\Evidencias\\test.png"));
    return this;
     }


}
