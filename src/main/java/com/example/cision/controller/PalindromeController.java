package com.example.cision.controller;

import com.example.cision.model.PalindromeInput;
import com.example.cision.service.PalindromeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping
public class PalindromeController {

    @Autowired
    PalindromeService service;

    @PostMapping("add-new-item")
    public ResponseEntity<String> addNew(@Valid PalindromeInput input) {
        service.addNew(input);
        return ResponseEntity.ok("New item successfully saved");
    }
}
