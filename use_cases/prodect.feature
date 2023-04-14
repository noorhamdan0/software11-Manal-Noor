
@tag
Feature: product 

Background: 
Given table
| prodect_name | picture     | description | order_state |
| c            | a           |  cleaning   | wating  |
| s            | b           |  dry        | in tretment  |
| d            | f           | dry        | complete  |

  @tag1
  Scenario: user add product to clean  
    Given there is a prodect whith PRODECT NAME "prodect name" , PITURE "picture " , DISCRIPTION "description" ,ORDER STATUS "order state"
     When the prodect is enterd "prod"
    Then prodect whith prodect name "prod name", regestd for "user id"
    

  