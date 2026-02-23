package com.anshika.frauddetection.repository;

import com.anshika.frauddetection.entity.TransactionEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TransactionRepository extends JpaRepository<TransactionEntity,Long> {
    List<TransactionEntity> findByUserId(Long userId);

    List<TransactionEntity> findByIsFlaggedTrue();
}
