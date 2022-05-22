package com.example.cision.service;

import com.example.cision.model.PalindromeInput;
import com.example.cision.model.PalindromeResponse;
import com.example.cision.repository.PalindromeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PalindromeService {

    @Autowired
    private PalindromeRepository repository;

    int resultStart;
    int resultLength;

    public PalindromeResponse addNew(PalindromeInput palindromeInput) {
        var response = new PalindromeResponse();
        String alphaNumericRegex = "[^A-Za-z0-9]";
        var content = palindromeInput.getContent().replaceAll(alphaNumericRegex, "");

        response.setContent(palindromeInput.getContent());
        response.setTimestamp(palindromeInput.getTimestamp());
        response.setLongestPalindromeSize(getLongestPalindromeSize(content));

        repository.save(response);
        return response;
    }

    private int getLongestPalindromeSize(String content) {
        resultStart = 0;
        resultLength = 0;
        var contentLength = content.length();

        if (contentLength < 2) {
            return content.length();
        }

        for (int i = 0; i < contentLength - 1; i++) {
            expandRange(content, i, i);
            expandRange(content, i, i + 1);
        }

        return content.substring(resultStart, resultStart + resultLength).length();
    }

    private void expandRange(String str, int begin, int end) {
        while (begin >= 0 && end < str.length() && str.charAt(begin) == str.charAt(end)) {
            begin--;
            end++;
        }
        if (resultLength < end - begin - 1) {
            resultStart = begin + 1;
            resultLength = end - begin - 1;
        }
    }

    public List<PalindromeResponse> getAllItems() {
        return repository.findAll();
    }
}



