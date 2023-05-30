package InserirRegistros;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import FabricaConexao.FabricaConexao;

public class NovaPessoa {
  public static void main(String[] args) throws SQLException {
    Scanner sc = new Scanner(System.in);

    System.out.print("Informe o nome: ");
    String name = sc.nextLine();

    Connection connect = FabricaConexao.getConnection();

    String sql = 
      """
        INSERT INTO pessoas (name) VALUES (?);
      """;
      PreparedStatement stmt = connect.prepareStatement(sql);
      stmt.setString(1, name);

      stmt.execute();

      System.out.println("Pessoa incluída com sucesso!");

    sc.close();
  }
}
