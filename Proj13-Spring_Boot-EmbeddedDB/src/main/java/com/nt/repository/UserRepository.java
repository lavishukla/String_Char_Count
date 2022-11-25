package com.nt.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nt.binding.User;

public interface UserRepository extends JpaRepository<User, Integer>{

}
