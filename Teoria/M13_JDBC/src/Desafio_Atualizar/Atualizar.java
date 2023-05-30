package Desafio_Atualizar;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import FabricaConexao.FabricaConexao;

public class Atualizar {
  public static void main(String[] args) throws SQLException {
    
    Integer id = 0;
    Scanner sc = new Scanner(System.in);
    Connection connect = FabricaConexao.getConnection();

    String selectSQL = 
      """
        SELECT id, name FROM pessoas WHERE id = ?;    
      """;
    PreparedStatement stmt = connect.prepareStatement(selectSQL);
    
    String resp = "nao";

    while (resp.equalsIgnoreCase("nao")){

      System.out.print("Digite o ID da pessoa que você quer atualizar: ");
      id = sc.nextInt();
      sc.nextLine();
      stmt.setInt(1, id);
      ResultSet result = stmt.executeQuery();

      if (result.next()) {
        String name = result.getString(2);

        System.out.println("O nome atual é: " + name);

        System.out.print("Esta pessoa que você quer atualizar? (sim/nao)\n");
        resp = sc.nextLine();
       } else {
        System.out.println("Pessoa com ID " + id + " não encontrada. Tente novamente.");
      }

    }

    System.out.print("Digite o novo nome para a pessoa com o respectivo ID: ");
    String newName = sc.nextLine();

    String updateSQL = 
      """
        UPDATE pessoas SET name = ? WHERE id = ?;    
      """;

    stmt = connect.prepareStatement(updateSQL);
    stmt.setString(1, newName);
    stmt.setInt(2, id);
    stmt.execute();

    System.out.println("Pessoa atualizada com sucesso!");

    sc.close();
    stmt.close();
    connect.close();

    
  }
}
