package com.bittiger.AdsSearch.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Repository;

import com.bittiger.AdsSearch.model.Customer;
import com.bittiger.AdsSearch.model.User;

@Repository
public class CustomerDao {
    @Autowired
    private MongoTemplate mongoTemplate;
    
    public Customer findByFirstName(String firstName) {
        return null;};
    
    public List<Customer> findByLastName(String lastName) {
        return null;}; 
        
    public void create(User p) {
        System.out.println(this.mongoTemplate == null);
        this.mongoTemplate.insert(p, "Test1");
    }
}
