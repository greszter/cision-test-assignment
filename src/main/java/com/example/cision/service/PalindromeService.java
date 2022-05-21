package com.example.cision.service;

import com.example.cision.model.PalindromeInput;
import com.example.cision.model.PalindromeResponse;
import com.example.cision.repository.PalindromeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PalindromeService {

    @Autowired
    private PalindromeRepository repository;

    int resultStart;
    int resultLength;

    public PalindromeResponse addNew(PalindromeInput palindromeInput) {

        var response = new PalindromeResponse();
        var content = palindromeInput.getContent();

        response.setContent(content);
        response.setTimestamp(palindromeInput.getTimestamp());
        response.setLongestPalindromeSize(getLongestPalindrome(content));

        repository.save(response);
        return response;
    }

    private int getLongestPalindrome(String content) {
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

        return content.substring(resultStart, resultStart + resultLength).length(); //error handling
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
}



