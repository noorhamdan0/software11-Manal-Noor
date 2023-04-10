
Feature: Order Tracking

@tag1
 Scenario: defult state for the prodect 
   Given there is prodect with ORDER STATUS "wating"
   When the order its just  orderd now
   Then the order status should be wating
   
   @tag2
   Scenario: Updating the order status to 
   Given there is an order with "prodect name" 
    When  the order state is changed  
    Then the order with "prodect name" status should be "state"
    
  