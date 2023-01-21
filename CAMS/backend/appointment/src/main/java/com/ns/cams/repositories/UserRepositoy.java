package com.ns.cams.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ns.cams.base.entity.User;

@Repository
public interface UserRepositoy extends JpaRepository<User, Integer>{

}
