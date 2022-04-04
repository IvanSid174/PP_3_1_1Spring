package ru.sidorov.springbootdemo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Service;
import ru.sidorov.springbootdemo.dao.UserDao;
import ru.sidorov.springbootdemo.model.User;
import ru.sidorov.springbootdemo.repository.UserRepository;

import javax.transaction.Transactional;
import java.util.List;
@Service
@Transactional
public class UserServiceImpl implements UserService{
    private  final UserDao daoUser;
    @Autowired
    public UserServiceImpl(UserDao daoUser) {
        this.daoUser = daoUser;
    }

    @Override
    public List<User> allUsers() {
        return daoUser.allUsers();
    }

    @Override
    public void add(User user) {
        daoUser.add(user);

    }

    @Override
    public void delete(int id) {
        daoUser.delete(id);

    }

    @Override
    public void edit(User user) {
        daoUser.edit(user);

    }

    @Override
    public User getById(int id) {
        return daoUser.getById(id);
    }
}
