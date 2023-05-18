Feature: Delete Customer/Product
As a admin,
I want to be able to delete a customer/product from the database


Scenario: Delete Customer
Given there is coustumer with "costumer id "
When the user selects a customer to delete
Then the customer is removed from the database
And a success message is displayed 


Scenario: Delete Product 
Given there is product with "product id"
When the user selects a product to delete
Then the product is removed from the database
And a success message is displayede 

