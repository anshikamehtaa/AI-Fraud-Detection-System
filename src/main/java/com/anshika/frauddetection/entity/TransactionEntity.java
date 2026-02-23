package com.anshika.frauddetection.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;

@Entity
@AllArgsConstructor
@Getter
@Setter
@Builder
@Table(name="transactions")
public class TransactionEntity {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private long id;

    @ManyToOne //many transections one user
    @JoinColumn(name = "user_id", nullable = false) //adding user id in the database instead of storing whole user
    private UserEntity user;

    @Column(nullable = false)
    private double amount;

    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private TransactionType transactionType;

    @Column(nullable = false)
    private String location;

    @CreationTimestamp
    @Column(updatable = false)
    private LocalDateTime createdAt;

    private Double riskScore;

    private Boolean isFlagged = false;


}
