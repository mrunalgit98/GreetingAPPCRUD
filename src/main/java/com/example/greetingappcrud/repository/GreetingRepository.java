package com.example.greetingappcrud.repository;

import com.example.greetingappcrud.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GreetingRepository extends JpaRepository<User, Integer> {

}
