Feature: Sistema de pagamento
    Scenario: Realizar um pagamento com cartão de crédito
    Context: dado que o usuário tem um cartão de crédito válido e saldo suficiente

    Esquema do cenário
    Given que o usuário "Ana" tem cartão de crédito com saldo de R$ 1000,00
    When "Ana" tenta realizar uma comprar de R$ 200,00
    Then a transação deve ser aprovada
    And o saldo do cartão deve ser atualizado R$ 800,00 
  