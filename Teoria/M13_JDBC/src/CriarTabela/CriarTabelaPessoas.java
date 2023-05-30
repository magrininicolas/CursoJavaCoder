package CriarTabela;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import FabricaConexao.FabricaConexao;

public class CriarTabelaPessoas {

  public static void main(String[] args) throws SQLException {
    Connection connect = FabricaConexao.getConnection();
    
    String sql = 
      """
        CREATE TABLE pessoas (
          id INT AUTO_INCREMENT PRIMARY KEY,
          name VARCHAR(80) NOT NULL
        )
      """;

    Statement stmt = connect.createStatement();
    stmt.execute(sql);

    connect.close();
  }
}
