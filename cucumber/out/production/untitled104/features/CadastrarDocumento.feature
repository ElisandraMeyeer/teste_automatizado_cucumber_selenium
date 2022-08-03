#language:pt
Funcionalidade: Cadastrar Documento




  Cenário: Campo obrigatório nome
    Quando o usuário estiver com a modal "Cadastrar documento" aberta
    Entao deve ser obrigatório preencher o campo Nome


  Cenario: O usuário criador é associado automaticamente ao documento
    Dado que o usuário está com a modal "Cadastrar documento" aberta
    Quando o usuário digitar no campo Nome
    Entao o documento receberá o conteúdo do campo nome associado ao documento

  Cenario: Além do campo obrigatório Nome, a interface deverá ter somente os campos Data de Criação, Data de Término, Descrição e Anexo, em uma única aba
    Quando o usuário está com a modal "Cadastrar documento" aberta
    Entao deverá mostrar em uma única aba os capos Data de Criação, Data de Término, Descrição e Anexo


  Cenario: A Data de Término é referente a disponibilidade que o documento ficará no sistema
    Quando o usuário está com a modal "Cadastrar documento" aberta
    E cadastrar um documento
    Então o documento deverá ficar disponível até a data de término que foi informada

  Cenario: O Anexo é para o usuário realizar o upload do documento
    Quando o usuário está com a modal "Cadastrar documento" aberta
    E acessar o campo anexo
    Então o usuário deve realizar o upload do documento

  Cenario: O tamanho do campo Nome deve ser igual a 100 caracteres
    Quando o usuário está com a modal "Cadastrar documento" aberta
    E acessar o campo anexo
    Então o usuário deve realizar o upload do documento


  Esquema do Cenario: Tamanhos dos campos
  - O tamanho do campo Nome deve ser igual a 100 caracteres
  - tamanho do campo Descrição deve ser igual a 4000 caracteres
    Dado que o usuário está com a modal "Cadastrar documento" aberta
    Quando o usuário acessar o campo <campo>
    Entao o campo <campo> <resultado> <caracteres> caracteres
    Exemplos:
      | campo          | resultado               | caracteres |
      | Nome           | deve aceitar no máximo  |100         |
      | Descrição      | deve aceitar no máximo  |4000        |


  Cenario: Data de Término não deve ser maior que a Data de Início
    Quando o usuário está com a modal "Cadastrar documento" aberta
    E acessar o campo data de término
    Então a data de término não deve ser maior que a data de início


  Cenario: Tamanho do documento para upload é até 5GB;
    Quando o usuário está com a modal "Cadastrar documento" aberta
    E selecionar um documento para anexar no campo anexo
    Então o documento deve ter um tamanho de até 5GB

  Cenario: Botão salvar
    Quando o usuário está com a modal "Cadastrar documento" aberta
    E preencher todos os campos obrigatórios
    Então o botão salvar deve estar disponível para o usuário clicar

  Cenario: Botão cancelar
    Quando o usuário está com a modal "Cadastrar documento" aberta
    Então o botão cancelar deve estar disponível para o usuário clicar


  Esquema do Cenario: Mensagens de feedback
  - Documento salvo com sucesso
  - A Data de Término não pode ser maior que a Data de Início
  - O campo Nome é obrigatório
    Dado que o usuário está com a modal "Cadastrar documento" aberta
    Quando o usuário clicar no botão salvar
    Entao deve aparecer a mensagem de feedback <mensagem> caso <condição>
    Exemplos:
      | mensagem                                                 | condição
      |documento salvo com sucesso                               |  todos os campos obrigatórios estiverem preenchidos e de maneira correta
      |A Data de Término não pode ser maior que a Data de Início |  a data de término for maior que a data de início
      |O campo Nome é obrigatório                                |  o campo obrigatório nome não estiver preenchido





