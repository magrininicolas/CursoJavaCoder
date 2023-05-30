package Padrao_DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import FabricaConexao.FabricaConexao;

public class DAO {
  private Connection connection;

  public int include(String sql, Object... attributes){
    try{
      PreparedStatement stmt = getConnection().prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);
      addAttributes(stmt, attributes);

      if(stmt.executeUpdate() > 0) {
        ResultSet r = stmt.getGeneratedKeys();

        if(r.next()){
          return r.getInt(1);
        }
      }
      return -1;
    } catch (SQLException e) {
      throw new RuntimeException(e);
    }
  }

  public void close(){
    try{
      getConnection().close();
    } catch (SQLException e) {
      System.out.println(e.getMessage());
    } finally {
      connection = null;
    }
  }

  public void addAttributes(PreparedStatement stmt, Object[] attributes) throws SQLException {
    Integer indexSQL = 1;
    for(Object attribute : attributes) {
      if(attribute instanceof String){
        stmt.setString(indexSQL, (String)attribute);
      } else if (attribute instanceof Integer) {
        stmt.setInt(indexSQL, (Integer)attribute);
      }
      indexSQL++;
    }
  }

  private Connection getConnection() {
    try {
      if(connection != null && !connection.isClosed()){
        return connection;
      }
    } catch (SQLException e) {
    }

    connection = FabricaConexao.getConnection();
    return connection;
  }
}
