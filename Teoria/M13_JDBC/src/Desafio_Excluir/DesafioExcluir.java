package Desafio_Excluir;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import ConsultarRegistros.Pessoa;
import FabricaConexao.FabricaConexao;

public class DesafioExcluir {
  
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);

    Connection connection;
    PreparedStatement stmt;

    try {
      connection = FabricaConexao.getConnection();
      
      String selectNomesSQL = 
        """
          SELECT id, name FROM pessoas;    
        """;

      stmt = connection.prepareStatement(selectNomesSQL);
      ResultSet r = stmt.executeQuery();
      List<Pessoa> pessoas = new ArrayList<>();

      while(r.next()) {
        pessoas.add(new Pessoa(r.getInt(1), r.getString(2)));
      }

      System.out.println("Lista de pessoas presentes na base de dados: ");
      pessoas.forEach(p -> System.out.println("ID: " + p.getId() + ", Name: " + p.getName()));

      Character resp = 'n';
      Integer deleteID = 0;

      String selectIDSQL = 
        """
          SELECT name FROM pessoas WHERE id = ?;   
        """;

      while(resp.equals('n')) {
        stmt = connection.prepareStatement(selectIDSQL);
        System.out.print("Digite o ID da pessoa que você quer excluir: ");
        deleteID = sc.nextInt();
        sc.nextLine();
        stmt.setInt(1, deleteID);
        r = stmt.executeQuery();

        if(r.next()) {
          System.out.print("Você quer excluir o/a " + r.getString(1) + "? \n(s/n): ");
          resp = sc.next().charAt(0);
        } else {
          System.out.println("Insira um ID válido!");
        }
      }

      String deleteSQL = 
        """
          DELETE FROM pessoas WHERE id = ?    
        """;

      stmt = connection.prepareStatement(deleteSQL);
      stmt.setInt(1, deleteID);
      stmt.execute();
      
      System.out.println("Pessoa excluída com sucesso!");

      connection.close();
      stmt.close();
      sc.close();
    } catch (SQLException e) {
      System.out.println("Ocorreu um erro ao acessar o banco de dados! Mensagem: " + e.getMessage());
    }
      
  }
}


// ChatGPT
// package Desafio_Excluir;

// import java.sql.Connection;
// import java.sql.PreparedStatement;
// import java.sql.ResultSet;
// import java.sql.SQLException;
// import java.util.ArrayList;
// import java.util.List;
// import java.util.Scanner;

// import ConsultarRegistros.Pessoa;
// import FabricaConexao.FabricaConexao;

// public class DesafioExcluir {
  
//   private static Scanner sc = new Scanner(System.in);
  
//   public static void main(String[] args) {
    
//     try {
//       Connection connection = FabricaConexao.getConnection();
      
//       List<Pessoa> pessoas = consultarPessoas(connection);

//       exibirListaPessoas(pessoas);

//       Integer deleteID = obterIdPessoa(sc, pessoas);

//       if (confirmarExclusao(sc, connection, deleteID)) {
//         excluirPessoa(connection, deleteID);
//         System.out.println("Pessoa excluída com sucesso!");
//       } else {
//         System.out.println("Exclusão cancelada pelo usuário.");
//       }

//       connection.close();
//       sc.close();
//     } catch (SQLException e) {
//       System.out.println("Ocorreu um erro ao acessar o banco de dados! Mensagem: " + e.getMessage());
//     }
      
//   }
  
//   private static List<Pessoa> consultarPessoas(Connection connection) throws SQLException {
//     String selectNomesSQL = "SELECT id, name FROM pessoas";    
//     PreparedStatement stmt = connection.prepareStatement(selectNomesSQL);
//     ResultSet r = stmt.executeQuery();
//     List<Pessoa> pessoas = new ArrayList<>();

//     while (r.next()) {
//       pessoas.add(new Pessoa(r.getInt(1), r.getString(2)));
//     }
    
//     stmt.close();
//     r.close();
    
//     return pessoas;
//   }
  
//   private static void exibirListaPessoas(List<Pessoa> pessoas) {
//     System.out.println("Lista de pessoas presentes na base de dados: ");
//     pessoas.forEach(p -> System.out.println("ID: " + p.getId() + ", Name: " + p.getName()));
//   }
  
//   private static Integer obterIdPessoa(Scanner sc, List<Pessoa> pessoas) {
//     Integer deleteID = 0;
//     boolean idValido = false;
    
//     while (!idValido) {
//       System.out.print("Digite o ID da pessoa que você quer excluir: ");
//       deleteID = sc.nextInt();
//       sc.nextLine();
      
//       for (Pessoa pessoa : pessoas) {
//         if (pessoa.getId() == deleteID) {
//           idValido = true;
//           break;
//         }
//       }
      
//       if (!idValido) {
//         System.out.println("Insira um ID válido!");
//       }
//     }
//     return deleteID;
//   }
  
//   private static boolean confirmarExclusao(Scanner sc, Connection connection, Integer deleteID) throws SQLException {
//     String selectIDSQL = "SELECT name FROM pessoas WHERE id = ?";
//     PreparedStatement stmt = connection.prepareStatement(selectIDSQL);
//     stmt.setInt(1, deleteID);
//     ResultSet r = stmt.executeQuery();
    
//     if (r.next()) {
//       String name = r.getString(1);
//       System.out.print("Você quer excluir o/a " + name + "? (s/n): ");
//       char resp = sc.next().charAt(0);
//       sc.nextLine();
//       return resp == 's' || resp == 'S';
//     } else {
//       System.out.println("Registro não encontrado!");
//       return false;
//     }
//   }
  
//   private static void excluirPessoa(Connection connection, Integer deleteID) throws SQLException {
//     String deleteSQL = "DELETE FROM pessoas WHERE id = ?";
//     PreparedStatement stmt = connection.prepareStatement(deleteSQL);
//     stmt.setInt(1, deleteID);
//     stmt.execute();
//     stmt.close();
//   }
// }

