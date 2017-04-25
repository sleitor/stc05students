package main.services;

import main.model.dao.UserInterface;
import main.model.pojo.User;
import org.springframework.stereotype.Service;

/**
 * Created by Троицкий Дмитрий on 20.04.2017.
 */

@Service
public class UserService implements UserServiceInterface{

    public UserInterface getUserDAO() {
        return userDAO;
    }

    public void setUserDAO(UserInterface userDAO) {
        this.userDAO = userDAO;
    }

    private UserInterface userDAO;

    public User auth(String login, String password) {
        User user = userDAO.findUserByLoginAndPassword( login, password );
        if (user != null && !user.isBlocked()){
            return user;
        } else {
            return null;
        }
    }
}
