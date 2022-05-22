package com.example.cision.controller;

import com.example.cision.model.PalindromeInput;
import com.example.cision.model.PalindromeResponse;
import com.example.cision.repository.PalindromeRepository;
import com.example.cision.service.PalindromeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping
public class PalindromeController {

    @Autowired
    private PalindromeService service;

    @PostMapping("add-new-item")
    public ResponseEntity<PalindromeResponse> addNew(@Valid @RequestBody PalindromeInput input) {
        return ResponseEntity.ok(service.addNew(input));
    }

    @GetMapping("get-all-items")
    public ResponseEntity<List<PalindromeResponse>> getAll() {
        return ResponseEntity.ok(service.getAllItems());
    }
}
