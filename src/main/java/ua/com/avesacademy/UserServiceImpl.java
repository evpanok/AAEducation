package ua.com.avesacademy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;


    @Override
    @Transactional(readOnly = true)
    public CustomUser getUserByLogin(String login) {
        return userRepository.findByLogin(login);
    }

    @Override
    @Transactional(readOnly = true)
    public boolean existByLogin(String login) {
        return userRepository.existsByLogin(login);
    }

    @Override
    @Transactional
    public void addUser(CustomUser customUser) {
        userRepository.save(customUser);

    }

    @Transactional
    @Override
    public void updateUser(CustomUser customUser) {
        userRepository.save(customUser);
    }


    @Transactional
    @Override
    public List<CustomUser> findAll() {
        return userRepository.findAll();
    }

    @Transactional
    @Override
    public void deleteUser(long[] id) {
            for (long idPage : id)
                userRepository.delete(idPage);
        }

    @Override
    @Transactional
    public CustomUser findById(long pattern) {
        return userRepository.findById(pattern);
    }
}

