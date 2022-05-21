package com.example.cision.model;

import lombok.Data;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.sql.Timestamp;

@Data
@EnableJpaRepositories
@Entity
public class PalindromeResponse {

    @Id()
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String content;

    private String timestamp;
    
    private int longestPalindromeSize;
}
