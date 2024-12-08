Feature: Item esgotado ao carrinho
    Scenario: onde o usuário adiciona vários itens ao carrinho, mas um deles está esgotado
    Given o usuário acessa o site de compras,
    And escolhe e todos os produtos da sua escolha,
    When o usuário vai verificar seu carrinho,
    But aparece que o produto selecionado está esgotado,
    And o site mostrará um aviso alertando que não tem o produto no momento