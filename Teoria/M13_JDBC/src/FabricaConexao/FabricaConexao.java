package FabricaConexao;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public abstract class FabricaConexao{
   
  public static Connection getConnection() {
    try {
      Properties prop = getProperties();
      String url = prop.getProperty("base.url");
      String user = prop.getProperty("base.user");
      String password = prop.getProperty("base.password");

      return DriverManager.getConnection(url, user, password);
    } catch (SQLException | IOException e) {
      throw new RuntimeException(e);
    }
  }
  
  private static Properties getProperties() throws IOException {
    Properties prop = new Properties();
    String path = "/connection.properties";
    prop.load(FabricaConexao.class.getResourceAsStream(path));
    return prop;
  }
}
