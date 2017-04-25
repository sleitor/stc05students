package main.model.dao;

import main.model.pojo.User;

/**
 * Created by Троицкий Дмитрий on 20.04.2017.
 */
public interface UserInterface {

    User findUserByLoginAndPassword (String user, String password);
}
