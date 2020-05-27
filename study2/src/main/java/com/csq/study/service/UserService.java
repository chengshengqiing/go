package com.csq.study.service;


import com.csq.study.dao.UserDao;

import com.csq.study.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

import java.util.UUID;

@Service
public class UserService {
    @Autowired
    UserDao userDao;
    /**
     * 查询全部
     *
     * @return
     */
    public List<User> findAll() {
        return userDao.findAll();
    }

    /**
     * 根据Id查询
     *
     * @param id
     * @return
     */
    public User findById(Integer id) {
        return userDao.findById(id).get();
    }

    /**
     * 增加标签
     *
     * @param user
     */
    public void add(User user) {
        user.setId(UUID.randomUUID().hashCode());
        userDao.save(user);
    }

    /**
     * 更新标签
     *
     * @param user
     */
    public void update(User user) {

        userDao.save(user);
    }

    /**
     * 删除标签
     *
     * @param id
     */
    public void deteleById(Integer id) {
        userDao.deleteById(id);
    }
}
