package app;



/**
 *
 * @author Aluno
 */
public class App {
    public static void main(String[] args) throws Exception {

        /*
        CREATE DATABASE `databaseproject` /*!40100 DEFAULT CHARACTER SET utf8mb4 */;

        /*
        
        USE databaseproject;

        CREATE TABLE `funcionario` (
          `id` int(11) NOT NULL AUTO_INCREMENT,
          `matricula` varchar(50) NOT NULL,
          `nome` varchar(100) NOT NULL,
          `idade` int(11) DEFAULT NULL,
          PRIMARY KEY (`id`)
        ) ENGINE=InnoDB AUTO_INCREMENT=18 DEFAULT CHARSET=utf8mb4;

        CREATE TABLE `gerente` (
          `idFuncionario` int(11) NOT NULL,
          `departamento` varchar(45) NOT NULL,
          PRIMARY KEY (`idFuncionario`),
          CONSTRAINT `gerente_ibfk_1` FOREIGN KEY (`idFuncionario`) REFERENCES `funcionario` (`id`) ON DELETE CASCADE
        ) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

        CREATE TABLE `operador` (
          `idFuncionario` int(11) NOT NULL,
          `funcao` varchar(100) NOT NULL,
          PRIMARY KEY (`idFuncionario`),
          CONSTRAINT `operador_ibfk_1` FOREIGN KEY (`idFuncionario`) REFERENCES `funcionario` (`id`) ON DELETE CASCADE
        ) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;


        -- Inserindo dados na tabela funcionario
        INSERT INTO funcionario (matricula, nome, idade) VALUES
        ('001', 'João Silva', 30),
        ('002', 'Maria Santos', 25),
        ('003', 'Carlos Oliveira', 40),
        ('004', 'Ana Sousa', 35),
        ('005', 'Pedro Almeida', 28),
        ('006', 'Sofia Pereira', 32),
        ('007', 'Lucas Mendes', 27),
        ('008', 'Luana Oliveira', 33),
        ('009', 'Guilherme Lima', 29),
        ('010', 'Lara Rodrigues', 31);
        
        -- Inserindo dados na tabela gerente
        INSERT INTO gerente (idFuncionario, departamento) VALUES
        (1, 'Vendas'),
        (2, 'Finanças'),
        (3, 'RH'),
        (4, 'Produção'),
        (5, 'TI');
        
        -- Inserindo dados na tabela operador
        INSERT INTO operador (idFuncionario, funcao) VALUES
        (6, 'Atendimento'),
        (7, 'Suporte'),
        (8, 'Produção'),
        (9, 'Logística'),
        (10, 'Qualidade');
        */
    
        
    }}
