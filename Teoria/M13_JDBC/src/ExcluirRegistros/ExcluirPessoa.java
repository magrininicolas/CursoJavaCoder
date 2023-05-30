package ExcluirRegistros;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import FabricaConexao.FabricaConexao;

public class ExcluirPessoa {
  public static void main(String[] args) throws SQLException {
    Scanner sc = new Scanner(System.in);
    System.out.print("Digite o ID da pessoa que você quer apagar: ");
    Integer id = sc.nextInt();

    Connection connection = FabricaConexao.getConnection();
    String deleteSQL = 
      """
        DELETE FROM pessoas WHERE id = ?
      """;
    
    PreparedStatement stmt = connection.prepareStatement(deleteSQL);
    stmt.setInt(1, id);
    stmt.execute();

    stmt.close();
    connection.close();
    sc.close();
    
  }
}
