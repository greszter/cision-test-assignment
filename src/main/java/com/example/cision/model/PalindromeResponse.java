package com.example.cision.model;

import lombok.Data;

import java.sql.Timestamp;

@Data
public class PalindromeResponse {

    private String content;

    private Timestamp timestamp;
    
    private int longestPalindromeSize;
}
