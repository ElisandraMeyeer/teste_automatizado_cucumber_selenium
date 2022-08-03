package stepdefinitions;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;
import util.Componentes;

public class ComponentesStep {

    Componentes componentes = new Componentes();

    @Dado("que o usuário acessou o arquivo Campo de Treinamento")
    public void que_o_usuário_acessou_o_arquivo_Campo_de_Treinamento() {

        componentes.inicializa();
    }

    @Quando("o usuário digitar Elisandra no campo textfield")
    public void o_usuario_digitar_Elisandra_no_campo_textfield() {
        componentes.testeTextFieldNome();
    }

    @Então("o resultado no campo textfield deve ser Elisandra")
    public void o_resultado_no_campo_textfield_deve_ser_Elisandra() {
        componentes.validaTextFieldNome();
    }

    @Quando("o usuário digitar Meyer no campo textfield")
    public void o_usuario_digitar_Meyer_no_campo_textfield() {
        componentes.testeTextFieldSobrenome();
    }

    @Então("o resultado no campo textfield deve ser Meyer")
    public void o_resultado_no_campo_textfield_deve_ser_Meyer() {
        componentes.validaTextFieldSobrenome();
    }

    @Quando("o usuário digitar Teste Teste no campo textarea")
    public void o_usuario_digitar_Teste_Teste_no_campo_textarea() {
        componentes.testeTextArea();

    }

    @Então("o resultado no campo textarea deve ser Teste Teste")
    public void o_resultado_no_campo_textarea_deve_ser_Teste_Teste() {
        componentes.validaTextArea();

    }


    @Quando("o usuário clicar no radiobutton")
    public void o_usuário_clicar_no_radiobutton() {

        componentes.testeRadioButton();
    }

    @Então("o elemento radiobutton deve ficar selecionado")
    public void o_elemento_radiobutton_deve_ficar_selecionado() {

        componentes.validaRadioButton();
    }

    @Quando("o usuário selecionar o botão checkbox no campo comida favorita")
    public void o_usuário_selecionar_o_botão_checkbox_no_campo_comida_favorita() {

        componentes.testeCheckBox();
    }

    @Então("o elemento checkbox deve ficar selecionado")
    public void o_elemento_checkbox_deve_ficar_selecionado() {

        componentes.validaCheckBoxComida();
    }


    @Quando("o usuário selecionar uma opção no campo combobox")
    public void o_usuário_selecionar_uma_opção_no_campo_combobox() {

        componentes.selecionarCombobox();
    }

    @Então("o elemento combobox deve ficar selecionado")
    public void o_elemento_combobox_deve_ficar_selecionado() {

        componentes.validarComboBox();
    }

    @Quando("o usuário clicar em uma opção no campo de pratica esportes")
    public void o_usuário_clicar_em_uma_opção_no_campo_de_pratica_esportes() {
        componentes.selecionarPraticaEsportes();
    }

    @Então("deve selecionar a opção desejada pelo usuário")
    public void deve_selecionar_a_opção_desejada_pelo_usuário() {

        componentes.validarPraticaEsportes();
    }


    @Quando("o usuário preencher as informações e clicar no botão cadastrar")
    public void o_usuário_preencher_as_informações_e_clicar_no_botão_cadastrar() {
        componentes.testeTextFieldNome();
        componentes.testeTextFieldSobrenome();
        componentes.testeTextArea();
        componentes.testeRadioButton();
        componentes.testeCheckBox();
        componentes.selecionarCombobox();
        componentes.selecionarPraticaEsportes();
        componentes.clicarNoBotaoCadastrar();
    }

    @Então("deve validar todas as informações preenchidas")
    public void deve_validar_todas_as_informações_preenchidas() {
        componentes.validarInformacoes();
    }



    @Dado("que o usuário não preencheu nenhum campo")
    public void que_o_usuário_não_preencheu_nenhum_campo() {

    }

    @Quando("o usuário clicar no botão cadastrar")
    public void o_usuario_clicar_no_botao_cadastrar() {
        componentes.clicarNoBotaoCadastrar();
    }

    @Então("deve aparecer o seguinte aviso Nome eh obrigatorio")
    public void deve_aparecer_o_seguinte_aviso_Nome_eh_obrigatorio() {
        componentes.validaMensagemBotãoCadastrarNomeObrigatorio();
    }



    @Quando("o usuário preencher apenas o campo nome e clicar no botão cadastrar")
    public void o_usuario_preencher_apenas_o_campo_nome_e_clicar_no_botao_cadastrar() {
        componentes.testeTextFieldNome();
        componentes.clicarNoBotaoCadastrar();
    }

    @Então("deve aparecer o seguinte aviso Sobrenome eh obrigatorio")
    public void deve_aparecer_o_seguinte_aviso_Sobrenome_eh_obrigatorio() {
        componentes.validaMensagemBotãoCadastrarSobrenomeObrigatorio();
    }


    @Quando("o usuário preencher os campos nome e sobrenome e clicar no botão cadastrar")
    public void o_usuario_preencher_os_campos_nome_e_sobrenome_e_clicar_no_botao_cadastrar() {
        componentes.testeTextFieldNome();
        componentes.testeTextFieldSobrenome();
        componentes.clicarNoBotaoCadastrar();
    }

    @Então("deve aparecer o seguinte aviso Sexo eh obrigatório")
    public void deve_aparecer_o_seguinte_aviso_Sexo_eh_obrigatorio() {
        componentes.validaMensagemBotãoCadastrarSexoObrigatorio();
    }


    @Dado("que o usuário desejar escolher as opções em Qual sua comida favorita?")
    public void que_o_usuario_desejar_escolher_as_opcoes_em_Qual_sua_comida_favorita() {


    }

    @Quando("o usuário selecionar a opção carne e vegetariano e clicar no botão cadastrar")
    public void o_usuario_selecionar_a_opcao_carne_e_vegetariano() {
        componentes.testeTextFieldNome();
        componentes.testeTextFieldSobrenome();
        componentes.testeRadioButton();
        componentes.selecionaCarneEVegetariano();
        componentes.clicarNoBotaoCadastrar();
    }

    @Então("deve aparecer o seguinte aviso Tem certeza que voce eh vegetariano?")
    public void deve_aparecer_o_seguinte_aviso_Tem_certeza_que_voce_eh_vegetariano() {
        componentes.validaMensagemBotãoCadastrarComida();
    }


    @Dado("que o usuário deseja escolher uma opção em Pratica esportes?")
    public void que_o_usuario_deseja_escolher_uma_opcao_em_Pratica_esportes() {

    }

    @Quando("o usuário escolher uma opção de esporte e também selecionar a opção O que eh esporte? e clicar no botão cadastrar")
    public void o_usuario_escolher_uma_opcao_de_esporte_e_tambem_selecionar_a_opcao_O_que_eh_esporte() {
        componentes.testeTextFieldNome();
        componentes.testeTextFieldSobrenome();
        componentes.testeRadioButton();
        componentes.regraEsporte();
        componentes.clicarNoBotaoCadastrar();
    }

    @Então("deve aparecer o seguinte aviso Voce faz esporte ou nao?")
    public void deve_aparecer_o_seguinte_aviso_Voce_faz_esporte_ou_nao() {
        componentes.validaMensagemEsporte();
    }

    @Quando("o usuário clicar no botão Confirm")
    public void o_usuario_clicar_no_botao_Confirm() {
        componentes.clicarNoBotaoConfirm();
    }

    @Então("deve aparecer uma mensagem de Confirm Simples")
    public void deve_aparecer_uma_mensagem_de_Confirm_Simples() {
        componentes.validarMensagemConfirm();
    }

    @Então("o usuário deve clicar no botão Ok")
    public void o_usuario_deve_clicar_no_botao_Ok() {
        componentes.clicarOk();
    }

    @Então("deve aparecer uma mensagem de Confirmado")
    public void deve_aparecer_uma_mensagem_de_Confirmado() {
        componentes.validarMensagemOk();
    }

    @Então("o usuário deve clicar no botão Cancelar")
    public void o_usuario_deve_clicar_no_botao_Cancelar() {
        componentes.clicarCancelar();
    }

    @Então("deve aparecer uma mensagem de Negado")
    public void deve_aparecer_uma_mensagem_de_Negado() {
        componentes.validarMensagemCancelar();
    }



















}
