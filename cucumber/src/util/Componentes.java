package util;

import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;
import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class Componentes {
    private WebDriver driver;
    private Select combo;
    public void inicializa(){
        String chromeDriver = System.getProperty("user.dir") + "/drivers/chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", chromeDriver);
        driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("file:///" + System.getProperty("user.dir") + "/resources/componentes.html");

    }

    public void testeTextFieldNome(){
        driver.findElement(By.id("elementosForm:nome")).sendKeys("Elisandra");
    }

    public void testeTextFieldSobrenome(){
        driver.findElement(By.id("elementosForm:sobrenome")).sendKeys("Meyer");
    }

    public void validaTextFieldNome(){
        Assert.assertEquals("Elisandra", driver.findElement(By.id("elementosForm:nome")).getAttribute("value"));
    }

    public void validaTextFieldSobrenome(){
        Assert.assertEquals("Meyer", driver.findElement(By.id("elementosForm:sobrenome")).getAttribute("value"));
    }

    public void testeTextArea(){
        driver.findElement(By.id("elementosForm:sugestoes")).sendKeys("Teste\nTeste");
    }

    public void validaTextArea(){
        Assert.assertEquals("Teste\nTeste", driver.findElement(By.id("elementosForm:sugestoes")).getAttribute("value"));
    }


    public void testeRadioButton(){
        WebElement radio2 = driver.findElement(By.id("elementosForm:sexo:1"));
        radio2.click();

        driver.findElement(By.id("elementosForm:sexo:1")).isSelected();

    }

    public void validaRadioButton(){
        Assert.assertEquals("F", driver.findElement(By.id("elementosForm:sexo:1")).getAttribute("value"));
    }


    public void testeCheckBox(){
        driver.findElement(By.id("elementosForm:comidaFavorita:2")).click();
    }

    public void validaCheckBoxComida(){
        Assert.assertEquals("pizza", driver.findElement(By.id("elementosForm:comidaFavorita:2")).getAttribute("value"));
    }

    public void selecionarCombobox(){

        WebElement elemento = driver.findElement(By.id("elementosForm:escolaridade"));

        combo = new Select(elemento);
        combo.selectByIndex(4);

    }

    public void validarComboBox(){

        Assert.assertEquals("Superior", combo.getFirstSelectedOption().getText());
    }


    public void selecionarPraticaEsportes(){

        WebElement elemento = driver.findElement(By.id("elementosForm:esportes"));

        combo = new Select(elemento);
        combo.selectByIndex(1);

    }


    public void validarPraticaEsportes(){

        Assert.assertEquals("Futebol", combo.getFirstSelectedOption().getText());
    }


    public void clicarNoBotaoCadastrar() {

        driver.findElement(By.id("elementosForm:cadastrar")).click();
    }


    public void validarInformacoes(){

        Assert.assertTrue(driver.findElement(By.id("descNome")).getText().endsWith("Elisandra"));
        Assert.assertTrue(driver.findElement(By.id("descSobrenome")).getText().endsWith("Meyer"));
        Assert.assertTrue(driver.findElement(By.id("descSexo")).getText().endsWith("Feminino"));
        Assert.assertTrue(driver.findElement(By.id("descComida")).getText().endsWith("Pizza"));
        Assert.assertTrue(driver.findElement(By.id("descEscolaridade")).getText().endsWith("superior"));
        Assert.assertTrue(driver.findElement(By.id("descEsportes")).getText().endsWith("Futebol"));
        Assert.assertTrue(driver.findElement(By.id("descComida")).getText().endsWith("Pizza"));
        Assert.assertTrue(driver.findElement(By.id("descSugestoes")).getText().endsWith("Teste Teste"));

    }


    public void validaMensagemBotãoCadastrarNomeObrigatorio(){
        Alert alert = driver.switchTo().alert();
        Assert.assertEquals("Nome eh obrigatorio", alert.getText());
    }

    public void clicarOk(){
        Alert alert = driver.switchTo().alert();
        alert.accept();
    }

    public void validaMensagemBotãoCadastrarSobrenomeObrigatorio(){
        Alert alert = driver.switchTo().alert();
        Assert.assertEquals("Sobrenome eh obrigatorio", alert.getText());
    }

    public void validaMensagemBotãoCadastrarSexoObrigatorio(){
        Alert alert = driver.switchTo().alert();
        Assert.assertEquals("Sexo eh obrigatorio", alert.getText());
    }

    public void selecionaCarneEVegetariano(){
        driver.findElement(By.id("elementosForm:comidaFavorita:0")).click();
        driver.findElement(By.id("elementosForm:comidaFavorita:3")).click();
    }

    public void validaMensagemBotãoCadastrarComida(){
        Alert alert = driver.switchTo().alert();
        Assert.assertEquals("Tem certeza que voce eh vegetariano?", alert.getText());
    }

    public void regraEsporte(){
        WebElement elemento = driver.findElement(By.id("elementosForm:esportes"));

        combo = new Select(elemento);
        combo.selectByIndex(1);
        combo.selectByIndex(4);
    }

    public void validaMensagemEsporte(){
        Alert alert = driver.switchTo().alert();
        Assert.assertEquals("Voce faz esporte ou nao?", alert.getText());
    }

    public void clicarNoBotaoConfirm() {

        driver.findElement(By.id("confirm")).click();
    }

    public void validarMensagemConfirm(){
        Alert alert = driver.switchTo().alert();
        Assert.assertEquals("Confirm Simples", alert.getText());
    }

    public void validarMensagemOk(){
        Alert alert = driver.switchTo().alert();
        Assert.assertEquals("Confirmado", alert.getText());
    }

    public void clicarCancelar(){
        driver.switchTo().alert().dismiss();

    }

    public void validarMensagemCancelar(){
        Alert alert = driver.switchTo().alert();
        Assert.assertEquals("Negado", alert.getText());
    }
















    public void fechaNavegador(){
        driver.quit();
    }
}
