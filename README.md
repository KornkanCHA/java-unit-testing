# Blog
https://kornkan.com/2024/07/13/what-is-unit-testing/

# Overview
This Java project aims to teach how to perform unit testing using a simple `Payment` class that calculates the total amount for a given price. The project includes a `Test` class that verifies the functionality of the `Payment` class through a unit test.

## Payment Class
- **Method:** `getTotal(double price)`
  - This method takes a `price` as input and checks if it is greater than or equal to 100.
  - If the price meets the condition, a 5% discount is applied, and the discounted total is returned.
  - If the price is less than 100, the original price is returned.

## Test Class
- **Method:** `test001()`
  - This method creates an instance of the `Payment` class and calls the `getTotal()` method with a test price of 120.0.
  - It uses an assertion to check if the returned total is 114.0, verifying that the discount logic is functioning correctly.

## Running the Tests
To run the tests, you can use a Java testing framework such as JUnit. The `test001()` method serves as a simple unit test for validating the discount logic in the `Payment` class.

## Notes
- The `Payment` class can be extended to include additional payment processing methods.
- Ensure to include a proper testing framework to run the tests effectively.

# IDE
This project was developed using Apache NetBeans IDE.
