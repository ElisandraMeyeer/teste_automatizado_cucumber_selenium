#language:pt
  @acessarvárioscomponenteshtml

  Funcionalidade: Acessar vários componentes html

    Contexto:
      Dado que o usuário acessou o arquivo Campo de Treinamento
      @validar_campo_textfield_textarea
        Esquema do Cenário: Validar campo textfield e textarea
        Quando o usuário digitar <texto> no campo <campo>
        Então o resultado no campo <campo> deve ser <texto>
        Exemplos:
          |texto              |campo     |
          |Elisandra          | textfield|
          |Meyer              | textfield|
          |Teste Teste        | textarea |


    @validar_campo_radiobutton
      Cenário: Validar compo radiobutton
      Quando o usuário clicar no radiobutton
      Então o elemento radiobutton deve ficar selecionado


    @validar_checkbox_comida
    Cenário: Validar botão checkbox comida favorita
      Quando o usuário selecionar o botão checkbox no campo comida favorita
      Então o elemento checkbox deve ficar selecionado


    @validar_combobox_escolaridade
    Cenário: Validar combobox escolaridade
      Quando o usuário selecionar uma opção no campo combobox
      Então o elemento combobox deve ficar selecionado


    @validar_select_esportes
    Cenário: Validar select se pratica esportes
      Quando o usuário clicar em uma opção no campo de pratica esportes
      Então deve selecionar a opção desejada pelo usuário


    @clicar_botão_cadastrar
    Cenário: Clicar no botão cadastrar e validar informações preenchidas
      Quando o usuário preencher as informações e clicar no botão cadastrar
      Então deve validar todas as informações preenchidas


    @nome_é_obrigatório
    Cenário: O campo nome é obrigatório
      Dado que o usuário não preencheu nenhum campo
      Quando o usuário clicar no botão cadastrar
      Então deve aparecer o seguinte aviso Nome eh obrigatorio


    @sobrenome_é_obrigatório
    Cenário: O campo sobrenome é obrigatório
      Quando o usuário preencher apenas o campo nome e clicar no botão cadastrar
      Então deve aparecer o seguinte aviso Sobrenome eh obrigatorio


    @sexo_é_obrigatório
    Cenário: O campo sexo é obrigatório
      Quando o usuário preencher os campos nome e sobrenome e clicar no botão cadastrar
      Então deve aparecer o seguinte aviso Sexo eh obrigatório


    @regra_carne_vegetariano
    Cenário: Se come carne não pode ser vegetariano
      Dado que o usuário desejar escolher as opções em Qual sua comida favorita?
      Quando o usuário selecionar a opção carne e vegetariano e clicar no botão cadastrar
      Então deve aparecer o seguinte aviso Tem certeza que voce eh vegetariano?

    @regra_esporte
    Cenário: Não pode marcar “O que eh esporte” e marcar um esporte que pratica ao mesmo tempo
      Dado que o usuário deseja escolher uma opção em Pratica esportes?
      Quando o usuário escolher uma opção de esporte e também selecionar a opção O que eh esporte? e clicar no botão cadastrar
      Então deve aparecer o seguinte aviso Voce faz esporte ou nao?

      @validar_botão_
      Cenário: Clicar no botão Confirm
        Quando o usuário clicar no botão Confirm
        Então deve aparecer uma mensagem de Confirm Simples
        E o usuário deve clicar no botão Ok
        Então deve aparecer uma mensagem de Confirmado

    @validar_botão_alert_negado
    Cenário: Clicar no botão Confirm e cancelar
      Quando o usuário clicar no botão Confirm
      Então deve aparecer uma mensagem de Confirm Simples
      E o usuário deve clicar no botão Cancelar
      Então deve aparecer uma mensagem de Negado






























