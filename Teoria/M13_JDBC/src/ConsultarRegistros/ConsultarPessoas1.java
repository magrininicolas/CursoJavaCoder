package ConsultarRegistros;

import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import FabricaConexao.FabricaConexao;

public class ConsultarPessoas1 {
  public static void main(String[] args) throws SQLException {
    
    Connection connect = FabricaConexao.getConnection();
    String sql = "SELECT * FROM pessoas";
    Statement stmt = connect.createStatement();
    ResultSet result = stmt.executeQuery(sql);

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
    connect.close();
  }
}
