package com.project.school.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.school.entities.User;

public interface UserRepo extends JpaRepository<User,Integer> {

}
