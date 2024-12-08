/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Aluno
 */
public class Conexao {

    //! lembrem de mudar o url, user e password de acordo com o mysql de vcs
    private static final String url = "jdbc:mysql://localhost:3306/databaseproject";
    private static final String user = "root";
    private static final String password = "";

    private static Connection conn;

    public static Connection getConexao() {
        try {
            if (conn == null) {
                conn = DriverManager.getConnection(url, user, password);
                return conn;
            } else {
                return conn;
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
            return null;
        }
        
    }

}
    
    

