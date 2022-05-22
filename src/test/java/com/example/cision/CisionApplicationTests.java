package com.example.cision;

import com.example.cision.repository.PalindromeRepository;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

@DisplayName("Palindrome API tests")
@SpringBootTest
@AutoConfigureMockMvc
class CisionApplicationTests {

//	@Autowired
//	private MockMvc mockMvc;

	@MockBean
	private PalindromeRepository palindromeRepository;

	@Test
	@DisplayName("Successfully add new palindrome item")
	public void testSuccessfulPalindromeAdding() throws Exception {

	}

	@Test
	@DisplayName("API parameter error on adding new item")
	public void testApiParameterErrorOnPalindromeAdding() throws Exception {
	}

	@Test
	@DisplayName("Successfully add new item with not only alphanumeric characters")
	public void testAddPalindromeWithNonAlphanumericCharacters() throws Exception {
	}

	@Test
	@DisplayName("Get all items - empty array")
	public void testGetAllWithEmptyArray() throws Exception {
	}

	@Test
	@DisplayName("Get all items")
	public void testGetAll() throws Exception {
	}
}
