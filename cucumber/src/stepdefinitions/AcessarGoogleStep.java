package stepdefinitions;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;
import util.AbrirNavegador;

public class AcessarGoogleStep {


    AbrirNavegador abrirNavegador = new AbrirNavegador();



    @Quando("instancionar chrome-driver")
    public void instancionar_chrome_driver() {
        abrirNavegador.inicializa();
    }

    @Então("o navegador Google Chrome deve abrir")
    public void o_navegador_Google_Chrome_deve_abrir() {
        abrirNavegador.navegador();
    }

    @Dado("que o usuário está na página do google")
    public void que_o_usuário_está_na_página_do_google() {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @Dado("que o usuário digitou o que deseja pesquisar")
    public void que_o_usuário_digitou_o_que_deseja_pesquisar() {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @Quando("clicar em Pesquisar")
    public void clicar_em_Pesquisar() {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @Então("deve retornar o resultado da pesquisa")
    public void deve_retornar_o_resultado_da_pesquisa() {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }
}
