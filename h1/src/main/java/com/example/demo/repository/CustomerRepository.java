package com.example.demo.repository;

import com.example.demo.domain.Customer;
import com.example.demo.domain.Customer;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;


@Repository
public interface CustomerRepository extends JpaRepository<Customer, Integer> {

    @Query(value = "select * from customer where username=?1 and password=?2", nativeQuery = true)
    public Customer findByUsernameAndPassword(String username, String password);


}