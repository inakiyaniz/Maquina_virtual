import java.sql.*;

public class degrees_table {
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
                    "INSERT INTO students (CodDegree, Title, Hours) VALUES( ? , ?, ? )");

            st.setString(1,"2A");
            st.setString(2,"Inaki");
            st.setString(3, "Donosti");
            st.setString(4, "26698483");
            st.setDate(5, java.sql.Date.valueOf("2003-06-03"));
            st.setInt(6, 007);
            System.out.println("se ha subido todo correctamente al data");


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
