package com.example.cision.repository;

import com.example.cision.model.PalindromeResponse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PalindromeRepository extends JpaRepository <PalindromeResponse, Long> {
}
