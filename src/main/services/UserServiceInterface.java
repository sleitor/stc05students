package main.services;

import main.model.pojo.User;

/**
 * Created by Троицкий Дмитрий on 20.04.2017.
 */
public interface UserServiceInterface {

    User auth(String login, String password);
}
