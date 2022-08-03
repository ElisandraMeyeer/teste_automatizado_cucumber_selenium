#language:pt
  Funcionalidade: Cadastrar usuário

    Cenário: Modal cadastrar usuário
      Quando o usuário está com a modal "Cadastrar usuário"
      Entao deve apresentar os campos Nome, Nome da Mãe, CPF, Login, Senha

    Esquema do Cenario: Caracteres máximos nos campos
    - Nome do usuário e Nome da mãe deve aceitar no máximo 256 caracteres
    - O campo login deve aceitar no máximo 100 caracteres
    - O campo senha deve aceitar no máximo 8 caracteres
      Dado que o usuário está com a modal "Cadastrar usuário" aberta
      Quando o usuário digitar <caracteres> caracteres
      Entao o campo <campo> <resultado>
      Exemplos:
        |caracteres| campo          | resultado                                   |
        | 256      | Nome do usuário| deve aceitar a quantidade de caracteres     |
        | 257      | Nome do usuário| não deve aceitar a quantidade de caracteres |
        | 256      | Nome da mãe    | deve aceitar a quantidade de caracteres      |
        | 257      | Nome da mãe    | não deve aceitar a quantidade de caracteres  |
        | 100      | Login          | deve aceitar a quantidade de caracteres     |
        | 101      | Login          | não deve aceitar a quantidade de caracteres |
        | 8        | Senha          | deve aceitar a quantidade de caracteres     |
        | 9        | Senha          | não deve aceitar a quantidade de caracteres |


    Cenario: O CPF deve ser válido
      Dado que o usuário está com a modal "Cadastrar usuário" aberta
      Quando o usuário digitar no campo CPF
      Entao deve ser válido


    Cenário: A senha deve ser formada por pelo menos um caracter especial e uma letra maíscula
      Dado que o usuário está com a modal "Cadastrar usuário" aberta
      Quando o usuário digitar no campo Senha
      Então deve ter um caracter especial e uma letra maíuscula

    Cenário: Os campos Nome, Login e Senha são obrigatórios
      Dado que o usuário está com a modal "Cadastrar usuário" aberta
      Quando o usuário clicar no botão de salvar
      E o campo Nome estiver vazio
      E o campo Login estiver vazio
      E o campo Senha estiver vazio
      Então o cadastro não deve ser salvo e deve aparecer uma mensagem de aviso que os campos Nome, Login e Senha são obrigatórios

    Cenário: Mensagem de feedback após salvar o cadastro
    -O campo Nome, Login e Senha são obrigatórios
      Dado que o usuário está com a modal "Cadastrar usuário" aberta
      Quando o usuário clicar no botão de salvar
      E os campos obrigatórios estiverem preenchidos
      Então deve mostrar uma mensagem de feedback contendo: "Usuário salvo com sucesso!"

    Cenário: Deve ser possível cadastrar no máximo 100 usuários:
      Dado que o usuário está com a modal "Cadastrar usuário" aberta
      Quando o usuário clicar no botão de salvar
      E o número de usuários cadastrados atingir o número de 101
      Então deve mostrar uma mensagem de feedback contendo: "Atingiu o número máximo de usuários cadastrados que é 100"


      Cenário: O cadastro deve ser auditado:
        Dado que o usuário cadastrou o usuário
        Quando o usuário precisar voltar a um cadastro salvo anteriormente
        Então o cadastro deve ser auditado


