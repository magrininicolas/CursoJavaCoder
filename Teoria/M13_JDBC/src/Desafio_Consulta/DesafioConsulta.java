package Desafio_Consulta;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import ConsultarRegistros.Pessoa;
import FabricaConexao.FabricaConexao;

public class DesafioConsulta {

  public static void main(String[] args) throws SQLException {

    Scanner sc = new Scanner(System.in);
    Connection connect = FabricaConexao.getConnection();
    
    String sql = 
      """
        SELECT * FROM pessoas WHERE name LIKE ?;
      """;
      
    System.out.print("Digite os caracteres que você quer que os nomes procurados possuam: ");
    String character = sc.nextLine();

    PreparedStatement stmt = connect.prepareStatement(sql);
    stmt.setString(1, "%" + character + "%");
    ResultSet result = stmt.executeQuery();

    List<Pessoa> pessoas = new ArrayList<>();

    while(result.next()) {
      int id = result.getInt("id");
      String name = result.getString("name");
      pessoas.add(new Pessoa(id, name));
    }

    for (Pessoa p : pessoas) {
      System.out.println(p.getId() + " --> " + p.getName());
    }

    stmt.close();
    sc.close();

  }
}
