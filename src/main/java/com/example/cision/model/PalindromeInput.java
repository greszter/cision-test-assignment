package com.example.cision.model;
import lombok.Data;

import javax.validation.constraints.NotBlank;
@Data
public class PalindromeInput {

    @NotBlank(message = "Content field cannot be blank")
    private String content;


    @NotBlank(message = "Valid timestamp must be provided")
    private String timestamp;
}
