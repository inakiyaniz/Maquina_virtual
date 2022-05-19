import java.sql.*;

public class exampleconection2 {
    public static void main(String[] args){
        String url = "jdbc:mariadb://localhost:3306/test_inaki";

        String username="root";
        String password="root";

        Connection connection=null;
        try{
            Class.forName("org.mariadb.jdbc.Driver");
            connection = DriverManager.getConnection(url, username, password);


            System.out.println("Connection open");
            //execute query
           PreparedStatement st =  connection.prepareStatement(
            "INSERT INTO table1 (col1) VALUE(?)");

            st.setString(1 ,"adios");
            st.executeUpdate();

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
