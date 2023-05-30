package CriarBanco;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import FabricaConexao.FabricaConexao;

public class CriarBanco {
  public static void main(String[] args) throws SQLException {

    // String connectionString = "jdbc:mysql://localhost?verifyServerCertificate=false&useSSL=true";
    // String user = "root";
    // String password = "senha";

    // Connection connect = DriverManager.getConnection(connectionString, user, password);

    Connection connect = FabricaConexao.getConnection();
    
    Statement stmt = connect.createStatement();
    stmt.execute("CREATE DATABASE IF NOT EXISTS curso_Java");
    System.out.println("Banco criado com sucesso!");

    connect.close();
  }
}
