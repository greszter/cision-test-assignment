package com.example.cision.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@Entity
public class PalindromeResponse {

    @Id()
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String content;

    private String timestamp;

    private int longestPalindromeSize;
}
