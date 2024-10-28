Feature: Validação do Envio de E-mail de Confirmação
    Scenario: Enviar e-mail de confirmação após cadastro
    Given que "Carlos" realiza o cadastro como um novo usuário
    And o e-mail informado por "Carlos" é válido
    When o sistema processa o cadastro de "Carlos"
    Then o sistema deve enviar um e-mail de confirmação para o endereço fornecido por "Carlos"
    And o e-mail deve conter um link para ativação da conta
