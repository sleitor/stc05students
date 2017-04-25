package main.model.dao;

import main.model.DataBaseConnector;
import main.model.pojo.Student;
import main.model.pojo.User;

import java.sql.*;

/**
 * Created by Троицкий Дмитрий on 20.04.2017.
 */
public class UserDAO implements UserInterface {
    private UserDAO userInterface;

    @Override
    public User findUserByLoginAndPassword(String login, String password) {
        Connection db = DataBaseConnector.initConnection();

        User user = null;
        try {
            PreparedStatement statement = db.prepareStatement( "SELECT * FROM user where login = ? AND password =?" );
            statement.setString( 1,login );
            statement.setString( 2,password );
            ResultSet resultSet = statement.executeQuery();
            if (resultSet.next()){
                user = new User( resultSet.getInt( 1 ), resultSet.getString( 2 ), resultSet.getString( 3 ), resultSet.getBoolean( 4 ) );
            }

        } catch(SQLException e) {
            e.printStackTrace();
        }

        return user;

    }

    public void setUserInterface(UserDAO userInterface) {
        this.userInterface = userInterface;
    }

    public UserDAO getUserInterface() {
        return userInterface;
    }
}
