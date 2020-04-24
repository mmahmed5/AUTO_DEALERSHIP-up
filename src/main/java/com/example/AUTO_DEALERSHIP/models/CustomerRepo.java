package com.example.AUTO_DEALERSHIP.models;

import org.springframework.data.repository.CrudRepository;

public interface CustomerRepo extends CrudRepository<CustomerData, String > {
}
