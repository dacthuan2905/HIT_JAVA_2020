 import java.sql.*;

 public class RunMain {
    public static void main(String[] args) {
        String url="jdbc:sqlserver://localhost:1433;databaseName=Java";
        String username="sa";
        String password="123";

        try {
            Connection connection= DriverManager.getConnection(url,username,password);
            if(connection !=null){
                System.out.println("connect success");
            }
            String sql="SELECT * FROM HangHoa";
            int stt=5;
            String name="Tê giác";
//            String sqlinsert=" INSERT INTO HangHoa VALUES(4,N'"+name+"')";
            String sqlinsert=" INSERT INTO HangHoa VALUES(?,?)";
            PreparedStatement preparedStatement=connection.prepareStatement(sqlinsert);
            preparedStatement.setInt(1,stt);
            preparedStatement.setString(2,name);
            preparedStatement.execute();

//                    Statement statement=connection.createStatement();
//                    statement.execute(sqlinsert);
//                    ResultSet rs=statement.executeQuery(sql);
//
//                    while (rs.next()){
//                        System.out.println(rs.getInt(1)+":"+rs.getString(2));
//                    }
        } catch (SQLException e) {
            e.printStackTrace();
        }


    }
}
