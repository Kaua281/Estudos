package DAO;

import java.sql.*;
import conection.Conexao;
import entity.*;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

/**
 *
 * @author Aluno
 */
public class Operations {
    public static void cadastrarFuncionario(Funcionario funcionario){
        String sql = "INSERT INTO funcionario(matricula, nome, idade) VALUES(?, ?, ?)";
        PreparedStatement ps = null;
        
        try {
            ps = Conexao.getConexao().prepareStatement(sql);
            ps.setString(1, funcionario.getMatricula());
            ps.setString(2, funcionario.getNome());
            ps.setString(3, String.valueOf(funcionario.getIdade()));
            
            ps.execute();
            ps.close();
        } catch (SQLException e) {
            e.printStackTrace();
        } 
        
    }
    
    public static DefaultListModel<String> listarFuncionarios() {
        DefaultListModel<String> listaFuncionarios = new DefaultListModel<>();
        try {
            /*Cria um objeto Statement a partir do método "Conexao.getConexao", este objeto Statement não possui atributos porém tem vários métodos para executar instruções sql: https://docs.oracle.com/javase/8/docs/api/java/sql/Statement.html */
            Statement stmt = Conexao.getConexao().createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM funcionario");
            while (rs.next()) {
                String coluna1 = rs.getString("id");
                String coluna2 = rs.getString("matricula");
                String coluna3 = rs.getString("nome");
                String coluna4 = String.valueOf(rs.getString("idade"));
                String funcionario = 
                        "ID: " + coluna1 + " | matricula: " + coluna2 + " | nome: " + coluna3 + " | idade: " + coluna4;
                listaFuncionarios.addElement(funcionario);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return listaFuncionarios;
    }
    
    public static void removerFuncionario(String id) {
        String sql = "DELETE FROM funcionario WHERE id = ?";
        
        try (PreparedStatement ps = Conexao.getConexao().prepareStatement(sql)) {
            
            ps.setString(1, id);
            int rowsAffected = ps.executeUpdate();
            
            if (rowsAffected > 0) {
                JOptionPane.showMessageDialog(null, "Funcionário removido com sucesso");

            } else {
                JOptionPane.showMessageDialog(null,"Nenhum funcionário encontrado com o ID fornecido.");
            }
            
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void cadastrarGerente(Gerente gerente){
        PreparedStatement psFuncionario = null;
        PreparedStatement psGerente = null;
        
        try {
        
            // Inserir dados na tabela funcionario
            String sqlFuncionario = "INSERT INTO funcionario(matricula, nome, idade) VALUES (?, ?, ?)";
            psFuncionario = Conexao.getConexao().prepareStatement(sqlFuncionario);
            psFuncionario.setString(1, gerente.getMatricula());
            psFuncionario.setString(2, gerente.getNome());
            psFuncionario.setInt(3, gerente.getIdade());
            psFuncionario.executeUpdate();
            
            // Inserir dados na tabela gerente, referenciando o idFuncionario inserido
            String sqlGerente = "INSERT INTO gerente(idFuncionario, departamento) VALUES (LAST_INSERT_ID(), ?)";
            psGerente = Conexao.getConexao().prepareStatement(sqlGerente);
            psGerente.setString(1, gerente.getDepartamento());
            psGerente.executeUpdate();
            
            
        } catch (SQLException e) {
            e.printStackTrace();
        } 
        
    }
    
    public static DefaultListModel<String> listarGerentes() {
        DefaultListModel<String> listaGerentes = new DefaultListModel<>();
        try {
            /*Cria um objeto Statement a partir do método "Conexao.getConexao", este objeto Statement não possui atributos porém tem vários métodos para executar instruções sql: https://docs.oracle.com/javase/8/docs/api/java/sql/Statement.html */
            Statement stmt = Conexao.getConexao().createStatement();
            ResultSet rs = stmt.executeQuery(
                "SELECT funcionario.id, funcionario.matricula, funcionario.nome, funcionario.idade, gerente.departamento " +
                "FROM funcionario " +
                "INNER JOIN gerente ON funcionario.id = gerente.idFuncionario");

            while (rs.next()) {
                String coluna1 = rs.getString("id");
                String coluna2 = rs.getString("matricula");
                String coluna3 = rs.getString("nome");
                String coluna4 = String.valueOf(rs.getString("idade"));
                String coluna5 = rs.getString("departamento");
                String gerente = (
                        "ID: " + coluna1 + " | matricula: " + coluna2 + " | nome: " + coluna3 + " | idade: " + coluna4 + " | departamento: " + coluna5);
                listaGerentes.addElement(gerente);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return listaGerentes;
    }
    
    public static void removerGerentes(String id) {
        String rGerente = "DELETE FROM gerente WHERE idFuncionario = ?";
        String rFuncionario = "DELETE FROM funcionario WHERE id = ?";  
        try {
            PreparedStatement ps1 = Conexao.getConexao().prepareStatement(rGerente);
            ps1.setString(1, id);
            PreparedStatement ps2 = Conexao.getConexao().prepareStatement(rFuncionario);
            ps2.setString(1, id);
            int rowsAffected = ps1.executeUpdate();
            ps2.executeUpdate();
            
            if (rowsAffected > 0) {
                JOptionPane.showMessageDialog(null, "Gerente removido com sucesso");
            } else {
                JOptionPane.showMessageDialog(null, "Nenhum gerente encontrado com o ID fornecido.");
            }
            
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void cadastrarOperador(Operador operador){
        PreparedStatement psFuncionario = null;
        PreparedStatement psOperador = null;
        
        try {
        
            // Inserir dados na tabela funcionario
            String sqlFuncionario = "INSERT INTO funcionario(matricula, nome, idade) VALUES (?, ?, ?)";
            psFuncionario = Conexao.getConexao().prepareStatement(sqlFuncionario);
            psFuncionario.setString(1, operador.getMatricula());
            psFuncionario.setString(2, operador.getNome());
            psFuncionario.setInt(3, operador.getIdade());
            psFuncionario.executeUpdate();
            
            // Inserir dados na tabela Operador, referenciando o idFuncionario inserido
            String sqlOperador = "INSERT INTO Operador(idFuncionario, funcao) VALUES (LAST_INSERT_ID(), ?)";
            psOperador = Conexao.getConexao().prepareStatement(sqlOperador);
            psOperador.setString(1, operador.getFuncao());
            psOperador.executeUpdate();
            
            
        } catch (SQLException e) {
            e.printStackTrace();
        } 
        
    }
    
    public static DefaultListModel<String> listarOperador() {
        DefaultListModel<String> listaOperadores = new DefaultListModel<>();
        try {
            /*Cria um objeto Statement a partir do método "Conexao.getConexao", este objeto Statement não possui atributos porém tem vários métodos para executar instruções sql: https://docs.oracle.com/javase/8/docs/api/java/sql/Statement.html */
            Statement stmt = Conexao.getConexao().createStatement();
            ResultSet rs = stmt.executeQuery(
                "SELECT funcionario.id, funcionario.matricula, funcionario.nome, funcionario.idade, operador.funcao " +
                "FROM funcionario " +
                "INNER JOIN operador ON funcionario.id = operador.idFuncionario");

            while (rs.next()) {
                String coluna1 = rs.getString("id");
                String coluna2 = rs.getString("matricula");
                String coluna3 = rs.getString("nome");
                String coluna4 = String.valueOf(rs.getString("idade"));
                String coluna5 = rs.getString("funcao");
                String Operador = (
                        "ID: " + coluna1 + " | matricula: " + coluna2 + " | nome: " + coluna3 + " | idade: " + coluna4 + " | função: " + coluna5);
                listaOperadores.addElement(Operador);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return listaOperadores;
    }
    
    public static void removerOperador(String id) {
        String rOperador = "DELETE FROM Operador WHERE idFuncionario = ?";
        String rFuncionario = "DELETE FROM funcionario WHERE id = ?";  
        try {
            PreparedStatement ps1 = Conexao.getConexao().prepareStatement(rOperador);
            ps1.setString(1, id);
            PreparedStatement ps2 = Conexao.getConexao().prepareStatement(rFuncionario);
            ps2.setString(1, id);
            int rowsAffected = ps1.executeUpdate();
            ps2.executeUpdate();
            
            if (rowsAffected > 0) {
                JOptionPane.showMessageDialog(null, "Operador removido com sucesso");
            } else {
                JOptionPane.showMessageDialog(null,"Nenhum Operador encontrado com o ID fornecido.");
            }
            
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


}
    

