package com.csq.study.dao;

import com.csq.study.pojo.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface UserDao extends JpaRepository<User, Integer>,
        JpaSpecificationExecutor<User> {
}
