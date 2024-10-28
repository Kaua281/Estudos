Feature: Redefinir Senha
    Feature Description
    Scenario:  Enviar um link de redefinição de senha por e-mail
    Given que o usuário está na paginá de login
    And clicou no link "Esqueci minha senha"
    When ele insere o endereço de e-mail cadastrado 
    Then o sistema envia um e-mail com o link de redefinição de senha
    And o usuário consegue acesar a página de redefinição de senha
    