

Feature: Generate an invoice for a customers

@tag1
  Scenario: Generate an invoice including delivery information, price, and items to be cleaned
    Given a customer has placed an order for cleaning services
    When the order has been completed and delivered to the customer
    Then an invoice should be generated that includes "Delivery date"
    
    
      - Delivery information (date, time, address)
      - Price of the cleaning service
      - List of items that were cleaned
      
      
      
      
 @tag
Feature: Generate an invoice for a customers 



  @tag1
  Scenario: Generate an invoice   
    Given there is a invoice whith Delivery DATE "Delivery date" , DELIVERY TIME  "Delivery time" , DELIVERY ADDRESS "Delivery address" ,ORDER PRICE "order state"
   When the order has been completed and delivered to the customer
    Then prodect whith prodect name "prod name", regestd for "user id"
    