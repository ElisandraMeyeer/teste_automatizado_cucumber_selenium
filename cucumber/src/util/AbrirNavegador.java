package util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class AbrirNavegador {

    private WebDriver driver;

    public void inicializa(){
        String chromeDriver = System.getProperty("user.dir") + "/drivers/chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", chromeDriver);
        driver = new ChromeDriver();
        driver.manage().window().maximize();

    }

    public void navegador(){

        System.out.println(driver.toString());
    }


}
