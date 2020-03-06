package com.capgemini.lesson18.mock;

public interface UserDAO {
User loadByUserNameAndPassword(String username, String password);
}
