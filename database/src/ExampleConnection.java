import java.sql.*;

public class ExampleConnection {
    public static void main(String[] args){
        String url = "jdbc:mariadb://localhost:3306/test_inaki";

        String username="root";
        String password="root";

        Connection connection=null;
        try{
            System.out.println("Connection open");
            Class.forName("org.mariadb.jdbc.Driver");
            connection = DriverManager.getConnection(url, username, password);




            ResultSet resultSet = null;
            Statement stmt = null;

            stmt =connection.createStatement();
            //resultSet = stmt.executeQuery(s: "show database;")

            if(stmt.execute("show databases;")){
                resultSet = stmt.getResultSet();
            }
            while(resultSet.next()){
                System.out.println(resultSet.getString("Database"));
            }



                if (connection!=null){
                    connection.close();
                    System.out.println("Connection close");
                }

        }catch (ClassNotFoundException e){
            e.printStackTrace();
        }catch (SQLException e){
            e.printStackTrace();
        }
        }
    }

