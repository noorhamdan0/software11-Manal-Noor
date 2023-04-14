
      
 @tag
Feature: Generate an invoice for a customers 



  @tag1
   Scenario: Generate an invoice   
    Given there is a invoice whith  "List of items that were cleaned" , DELIVERY ADDRESS "Delivery address" ,ORDER PRICE "order price"
    When  the order has been completed and delivered to the customer
    Then  an invoice should be generated with "Delivery date"
    
    
    