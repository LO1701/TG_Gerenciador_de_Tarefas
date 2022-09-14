package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConectionFactory {
       public static final String DRIVER = "com.mysql.jdbc.Driver";  
       public static final String DB_URL = "jdbc:mysql://localhost:3306/db_todoapp";
       public static final String USER = "root";
       public static final String PASS = "";
       
       public static Connection getConnection(){
           try{
               Class.forName(DRIVER);
               return DriverManager.getConnection(DB_URL, USER, PASS);
           }catch(ClassNotFoundException | SQLException x){
               throw new RuntimeException("Erro na conexao com o BD", x);
           }
       }
       
       public static void CloseConnection (Connection connection){
           try {
               if(connection != null)
                   connection.close();
           } catch (SQLException e) {
               throw new RuntimeException("Erro ao fechar a conexao com o BD", e);
           }
       }
       
}
