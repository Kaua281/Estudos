Feature: 
  Scenario: Concluir uma tarefa pendente
    Given que o usuário tem tarefas pendentes no sistema de gestão
    And uma tarefa chamada "Finalizar relatório" está na lista de tarefas pendentes
    When o usuário acessa sua lista de tarefas
    And clica na opção "Marcar como concluída" na tarefa "Finalizar relatório"
    Then a tarefa "Finalizar relatório" deve ser movida para a lista de tarefas concluídas
    And a tarefa "Finalizar relatório" não deve aparecer na lista de tarefas pendentes
