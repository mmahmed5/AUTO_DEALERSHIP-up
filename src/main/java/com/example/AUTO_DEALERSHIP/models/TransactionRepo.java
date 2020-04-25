package com.example.AUTO_DEALERSHIP.models;

import org.springframework.data.repository.CrudRepository;

public interface TransactionRepo extends CrudRepository<TransactionData, String > {
}
