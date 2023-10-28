package com.sx.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sx.domain.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

}