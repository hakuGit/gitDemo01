package com.haku.springdata.springdata01.dao;

import com.haku.springdata.springdata01.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDao extends JpaRepository<User,Integer>, JpaSpecificationExecutor<User> {
}
