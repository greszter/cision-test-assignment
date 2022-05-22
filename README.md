# Palindrome length counter

This is a test assignment with the following two endpoints:

- Add new item: `/add-new-item`
  - The body should contain two Strings, a `content` and a `timestamp`
- Get all saved items: `/get-all-items`
  - Returns all items that are saved in the database
  - Each object has three properties: `content` and `timestamp` (same as in the input) and a `longestPalindromeSize` counted by the application

The application currently uses in-memory database that is empty on startup.

Use `mvn clean install` and then run the application

TODO:
- Finish tests
- Add date serializer to transform String `timestamp` into ZonedDateTime (in case it is needed for calculations later)



