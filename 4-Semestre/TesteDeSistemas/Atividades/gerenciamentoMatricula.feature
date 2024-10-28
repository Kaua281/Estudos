Feature: Gerenciamento de matrículas
  Scenario: Adicionar um aluno a um curso
  Context: Dado que o aluno está cadastradono sistema e o curso tem vagas disponíveis
  
  Esquema do cenário:
    Given que o aluno "João" está cadastrado
    And há 10 vagas disponíveis no curso de "Matemática"
    When o administrador adiciona "João" ao curso
    Then a matrícula deve ser confirmada
    And o número de vagas disponíveis deve ser reduzido para 9