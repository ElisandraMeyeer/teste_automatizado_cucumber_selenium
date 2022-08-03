#language:pt
Funcionalidade: Apresentar anexos de e-mail ao lado da aba E-mail


  -Descrição: Como usuário, eu gostaria de ter a possibilidade de visualizar os anexos diretamente na interface
  -de detalhamento de e-mail, possibilitando a análise completa do seu conteúdo sem a necessidade de realizar
  -download dos arquivos ou procurá-los na listagem de e-mails.

  @basico
  Cenário: Visualização dos anexos ao lado da aba email
    Dado que o usuário está com a modal "Emais" aberta
    Quando selecionar a visualização de mensagens de e-mail
    E selecionar um e-mail que possua anexos
    Então o sistema deverá mostrar os anexos existentes em uma aba ao lado do email

  @basico
  Cenário: Não visualizar a aba anexos caso o email não possua anexos
    Dado que o usuário está com a modal "Emais" aberta
    Quando selecionar a visualização de mensagens de e-mail
    E selecionar um e-mail que não possua anexos
    Então o sistema não deve mostrar a aba visualização de anexos

  @geral
  Cenário: Mostrar a quantidade de anexos ao lado do nome da aba
    Dado que o usuário está com a modal "Emais" aberta
    Quando selecionar a visualização de mensagens de e-mail
    E selecionar um e-mail que possua anexos
    Então o sistema deve mostrar a quantidade de anexos ao lado do nome da aba

  @específico
  Esquema do Cenario: Listagem de arquivos
  - A listagem de arquivos deve possuir o nome do arquivo e deve ter uma visualização de no máximo 5 arquivos
  - Se houver uma lista maior deve ser apresentada uma barra de rolagem.
    Dado que o usuário está com a modal "Emails" aberta
    Quando o usuário selecionar a aba anexo
    Entao se na listagem aparecerem até <quantidade> documentos deve <resultado>
    Exemplos:
      | quantidade          | resultado
      | 5                   | possuir o nome do arquivo e deve ter uma visualização
      | 6                   | ser apresentada uma barra de rolagem

  @específico
  Cenário: Carregar o primeiro item da lista automaticamente
    Dado que o usuário está com a modal "Emais" aberta
    Quando o usuário selecionar a aba anexo
    Então o primeiro arquivo da lista deve ser automaticamente carregado

  @completo
  Cenário: Botão de download
    Dado que o usuário está com a modal "Emais" aberta
    Quando o usuário selecionar a aba anexo
    Então o botão de download deve ficar disponível para realizar o download do anexo

  @completo
  Cenário: Ação de realizar o download deve ser auditado
    Dado que o usuário está com a modal "Emais" aberta
    Quando o usuário fazer o download de um anexo
    Então esta ação deve ser auditada

  @completo
  Cenário: A listagem de anexos deve ficar permanentemente visível enquanto a aba estiver aberta, permitindo a rápida troca de arquivos
    Dado que o usuário está com a modal "Emais" aberta
    Quando o usuário selecionar a aba anexo
    Então a lista de anexos deve ficar permanentemente visível































