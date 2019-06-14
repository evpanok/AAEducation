package ua.com.avesacademy;

import java.util.List;

public interface UserService {

    CustomUser getUserByLogin(String login);
    boolean existByLogin(String login);
    void addUser(CustomUser customUser);
    void updateUser(CustomUser customUser);
    List<CustomUser> findAll();
    public void deleteUser(long[] id);
    CustomUser findById(long pattern);

}
