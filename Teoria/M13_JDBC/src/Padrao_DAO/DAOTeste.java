package Padrao_DAO;

public class DAOTeste {

  public static void main(String[] args) {
    DAO dao = new DAO();

    String sql = "INSERT INTO pessoas (name) VALUES (?)";
    System.out.println(dao.include(sql, "João da Silva"));
    System.out.println(dao.include(sql, "Ana Julia"));
    System.out.println(dao.include(sql, "Djalma Santos"));
  }
  
  
}
