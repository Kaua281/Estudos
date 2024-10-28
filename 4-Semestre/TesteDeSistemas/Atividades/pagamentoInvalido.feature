Feature: Pagamento com cartão invalido
    Scenario: O usuário tenta efetuar um pagamento com um cartão de crédito inválido.
    Given o usuário quer comprar um produto online utilizando o cartão de crédito,
    Then o usuário escolheu produto e adicionou ao carrinho,
    When o usuário cadastrou o cartão de crédito,
    But na hora de finalizar a compra deu cartão inválido.