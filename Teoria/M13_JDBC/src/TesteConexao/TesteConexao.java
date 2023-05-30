package TesteConexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TesteConexao {
  public static void main(String[] args) throws SQLException {

    String connectionString = "jdbc:mysql://localhost?verifyServerCertificate=false&useSSL=true";
    String user = "root";
    String password = "senha";

    Connection connect = DriverManager.getConnection(connectionString, user, password);
    
    System.out.println("Conexão efetuada com sucesso!");
    connect.close();
  }
}
