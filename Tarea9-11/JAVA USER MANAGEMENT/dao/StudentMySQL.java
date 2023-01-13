import java.sql.PreparedStatement;
import java.sql.ResultSet;

import dao.StudentDAO;

public class UserMySQLml implements UserDAO{
    private Connection connection;
    private PreparedStatement preparedStatement;
    private ResultSet resultSet;


    private static final String INSERT = "INSERT INTO user_table (name, lastname, email, password) VALUES (?, ?, ?, ?)";
    private static final String UPDATE = "UPDATE user_table SET name = ?, lastname =  ?, password = ?, email = ? WHERE id = ?";
    private static final String DELETE = "DELETE FROM user_table WHERE id = ?";
    private static final String GET_BY_ID = "SELECT * FROM user_table WHERE id = ?";
    private static final String GET_ALL = "SELECT * FROM user_table";
    private static final String GET_BY_EMAIL_AND_PASSWORD = "SELECT * FROM user_table WHERE email = ? AND password = ?";

}
