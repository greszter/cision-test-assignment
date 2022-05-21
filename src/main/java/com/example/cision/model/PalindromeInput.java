package com.example.cision.model;

import com.sun.istack.NotNull;
import lombok.Data;

import javax.persistence.Entity;
import javax.validation.constraints.NotBlank;
import java.sql.Timestamp;

@Data
public class PalindromeInput {

    @NotBlank(message = "Content field cannot be blank")
    private String content;

    @NotBlank(message = "Valid timestamp must be provided")
    private String timestamp;
}
